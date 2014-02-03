package com.withanq.web.reader;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.Thumbnail;
import com.google.api.services.youtube.model.Video;
import com.google.api.services.youtube.model.VideoListResponse;

public class YoutubeReader extends Reader{

	/** Global instance of the HTTP transport. */
	private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
	
	private static final String apiKey = "AIzaSyCe1e7l_iCSkkEggvmklXvF49jldIWYE34";

	/** Global instance of the JSON factory. */
	private static final JsonFactory JSON_FACTORY = new JacksonFactory();

	/** Global instance of Youtube object to make all API requests. */
	private static YouTube youtube;
	
	private String targetUrl;
	
	private String id;
	
	private static final String youtubeRe = "(?i)http(s)?:\\/\\/(www\\.)?(youtube)\\.com.*watch.*v=";
	private static final Pattern youtubeRePattern = Pattern.compile(youtubeRe); 

	/**
	 * Initializes YouTube object to search for videos on YouTube
	 * (Youtube.Search.List). The program then prints the names and thumbnails
	 * of each of the videos (only first 50 videos).
	 * 
	 * @param args
	 *            command line args.
	 */
	public YoutubeReader() {
		super();
		youtube = new YouTube.Builder(HTTP_TRANSPORT, JSON_FACTORY,
				new HttpRequestInitializer() {
					public void initialize(HttpRequest request)
							throws IOException {
					}
				}).build();
	}
	
	public void setTargetUrl(String targetUrl) throws Exception{
		this.targetUrl = targetUrl;
		setIdFromUrl();
	}
	
	private void setIdFromUrl() throws Exception {
		String idRe = "(?i)(\\?|&)v=([^&]*)";
		Pattern idRePattern = Pattern.compile(idRe); 
		Matcher matcher = idRePattern.matcher(this.targetUrl);
		if(matcher.find()){
			System.out.println(matcher.group(2));
			this.id = matcher.group(2);
		}else{
			successor.findReader(this.targetUrl);
		}
	}

	public Video getData() throws Exception{
		com.google.api.services.youtube.YouTube.Videos.List list = youtube.videos().list(this.id, "snippet");
		list.setKey(apiKey);
		VideoListResponse listResponse = list.execute();
		List<Video> resultList = listResponse.getItems();
		if(resultList.size() != 1){
			successor.findReader(this.targetUrl);
		}
		return resultList.get(0);
	}
	
	public static void main(String[] args) throws Exception {
		YoutubeReader youtubeReader = new YoutubeReader();
		youtubeReader.setTargetUrl("http://www.youtube.com/watch?v=ZQTQSbjecLg&feature=youtube_gdata");
		Video result = youtubeReader.getData();
		Thumbnail thumbnail = result.getSnippet().getThumbnails().get("default");
		System.out.println(" Video Id: " + result.getId());
		System.out.println(" Title: " + result.getSnippet().getTitle());
		System.out.println(" Thumbnail: " + thumbnail.getUrl());
	}

	@Override
	public void findReader(String url) throws Exception {
		System.out.println("url ="+url);
		Response response = Jsoup.connect(url).execute();
		System.out.println("url ="+response.url());
		System.out.println("statusCode ="+response.statusCode());
		if(youtubeRePattern.matcher(response.url().toString()).find()){
			readData(response.url().toString());
        } else if (successor != null) {
            successor.findReader(url);
        }
		
	}

	@Override
	public void readData(String url) throws Exception {
		System.out.println("youtubeRePattern");
		setTargetUrl(url);
		Video result = getData();
		Thumbnail thumbnail = result.getSnippet().getThumbnails().get("default");
		System.out.println(" Video Id: " + result.getId());
		System.out.println(" Title: " + result.getSnippet().getTitle());
		System.out.println(" Thumbnail: " + thumbnail.getUrl());
		
	}
}
