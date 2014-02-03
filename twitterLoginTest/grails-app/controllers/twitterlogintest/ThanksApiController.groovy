package twitterlogintest


import org.apache.http.HttpResponse
import org.apache.http.client.ClientProtocolException
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.DefaultHttpClient
class ThanksApiController {

	def MsEntireMessageList() {
		def last_ms_seq = params.last_ms_seq
		if(!last_ms_seq){
			last_ms_seq = ""
		}
		println "http://trac.s-onair.com:10080/API/MsEntireMessageList?res-type=JSON&display_lang=en&session_key=&subject_uuid=&last_ms_seq=${last_ms_seq}"
		DefaultHttpClient httpClient = null;
		StringBuffer result = new StringBuffer();
		try {

			httpClient = new DefaultHttpClient();
			HttpGet getRequest = new HttpGet(
					"http://trac.s-onair.com:10080/API/MsEntireMessageList?res-type=JSON&display_lang=en&session_key=&subject_uuid=&last_ms_seq=${last_ms_seq}");
			getRequest.addHeader("accept", "application/json");

			HttpResponse response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(
					new InputStreamReader((response.getEntity().getContent())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				result.append(output);
			}

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			httpClient.getConnectionManager().shutdown();
		}
		
		render(result.toString())
	}
}
