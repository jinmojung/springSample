package com.withanq.web.servlet;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.withanq.web.conf.Conf;

@SuppressWarnings("serial")
public class ProxyServlet  extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger(ProxyServlet.class);
	
	// 대부분의 Servlet은 doGet 또는 doPost만 작성하며,
    // 컨테이너가 생성한 Request와 Response 객체를 전달 받는다.
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    	resp.setCharacterEncoding("UTF-8");
    	resp.setContentType("application/json");
    	PrintWriter writer = resp.getWriter();
    	List<NameValuePair>	nvps		= new ArrayList<NameValuePair>();
    	for (Enumeration<String> parameterNames = req.getParameterNames(); parameterNames.hasMoreElements();){
    		String parameterName = parameterNames.nextElement().toString();
    		if(!parameterName.equals("targetURL")){
    			nvps.add(new BasicNameValuePair(parameterName, req.getParameter(parameterName)));
    		}
    	}
        ByteArrayOutputStream	baos;
    	CloseableHttpClient httpclient = HttpClients.createDefault();
    	String targetURL = req.getParameter("targetURL");
    	System.out.println(targetURL);
        HttpPost httpPost = new HttpPost(Conf.API_HOST + targetURL);

        try {
			httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}	
        

		// Execute the method.
		CloseableHttpResponse response = null;
		try {
	        response = httpclient.execute(httpPost);
			if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
				System.err.println("Method failed: " + response.getStatusLine());
			}
			// Read the response body.
			InputStream is = response.getEntity().getContent();
			baos = new ByteArrayOutputStream();

			InputStream r = new BufferedInputStream(is);
			byte[] tmp = new byte[1024];
			int length;
			while ((length = r.read(tmp)) > 0) {
				baos.write(tmp, 0, length);
			}
			r.close();

			String s = new String(baos.toByteArray(), "UTF-8");
			System.out.println(s);
			writer.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (response != null) {
					response.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doPost");
    	logger.debug("doPost");
        if (!ServletFileUpload.isMultipartContent(request)) {
            //throw new IllegalArgumentException("Request is not multipart, please 'multipart/form-data' enctype for your form.");
        }
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        diskFileItemFactory.setSizeThreshold(Conf.DISK_FILE_ITEM_SIZE_THRESHOLD);
        ServletFileUpload uploadHandler = new ServletFileUpload(diskFileItemFactory);
        
        PrintWriter writer = response.getWriter();
        response.setContentType("application/json");
        try {
            List<FileItem> items = uploadHandler.parseRequest(request);
            for (FileItem item : items) {
            	File storeLocation = ((DiskFileItem)item).getStoreLocation();
                if (!item.isFormField()) {
                        File file = new File(Conf.Path.UPLOAD_IMAGE, item.getName());
                        item.write(file);
                        writer.write(item.getName());
                }
            }
        } catch (FileUploadException e) {
                throw new RuntimeException(e);
        } catch (Exception e) {
                throw new RuntimeException(e);
        } finally {
            writer.close();
        }

    }

    private String getMimeType(File file) {
        String mimetype = "";
        if (file.exists()) {
//            URLConnection uc = new URL("file://" + file.getAbsolutePath()).openConnection();
//            String mimetype = uc.getContentType();
//            MimetypesFIleTypeMap gives PNG as application/octet-stream, but it seems so does URLConnection
//            have to make dirty workaround
            if (getSuffix(file.getName()).equalsIgnoreCase("png")) {
                mimetype = "image/png";
            } else {
                javax.activation.MimetypesFileTypeMap mtMap = new javax.activation.MimetypesFileTypeMap();
                mimetype  = mtMap.getContentType(file);
            }
        }
        System.out.println("mimetype: " + mimetype);
        return mimetype;
    }



    private String getSuffix(String filename) {
        String suffix = "";
        int pos = filename.lastIndexOf('.');
        if (pos > 0 && pos < filename.length() - 1) {
            suffix = filename.substring(pos + 1);
        }
        System.out.println("suffix: " + suffix);
        return suffix;
    }

}
