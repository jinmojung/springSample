package socialSearch;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.YouTube.Search;
import com.google.api.services.youtube.YouTube.Videos;
import com.google.api.services.youtube.model.ResourceId;
import com.google.api.services.youtube.model.SearchListResponse;
import com.google.api.services.youtube.model.SearchResult;
import com.google.api.services.youtube.model.Thumbnail;
import com.google.api.services.youtube.model.Video;
import com.google.api.services.youtube.model.VideoListResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class YoutubeGet {

	/** Global instance properties filename. */
	private static String PROPERTIES_FILENAME = "youtube.properties";

	/** Global instance of the HTTP transport. */
	private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();

	/** Global instance of the JSON factory. */
	private static final JsonFactory JSON_FACTORY = new JacksonFactory();

	/**
	 * Global instance of the max number of videos we want returned (50 = upper
	 * limit per page).
	 */
	private static final long NUMBER_OF_VIDEOS_RETURNED = 5;

	/** Global instance of Youtube object to make all API requests. */
	private static YouTube youtube;

	/**
	 * Initializes YouTube object to search for videos on YouTube
	 * (Youtube.Search.List). The program then prints the names and thumbnails
	 * of each of the videos (only first 50 videos).
	 * 
	 * @param args
	 *            command line args.
	 */
	public static void main(String[] args) {
		// Read the developer key from youtube.properties
		Properties properties = new Properties();
		try {
			InputStream in = Search.class.getResourceAsStream("/"
					+ PROPERTIES_FILENAME);
			properties.load(in);

		} catch (IOException e) {
			System.err.println("There was an error reading "
					+ PROPERTIES_FILENAME + ": " + e.getCause() + " : "
					+ e.getMessage());
			System.exit(1);
		}

		try {
			/*
			 * The YouTube object is used to make all API requests. The last
			 * argument is required, but because we don't need anything
			 * initialized when the HttpRequest is initialized, we override the
			 * interface and provide a no-op function.
			 */
			youtube = new YouTube.Builder(HTTP_TRANSPORT, JSON_FACTORY,
					new HttpRequestInitializer() {
						public void initialize(HttpRequest request)
								throws IOException {
						}
					}).setApplicationName("youtube-cmdline-search-sample")
					.build();


			com.google.api.services.youtube.YouTube.Videos.List list = youtube.videos().list("elKxgsrJFhw", "snippet");
			//list.setFields("items(id,snippet,statistics)");
			
			/*
			 * It is important to set your developer key from the Google
			 * Developer Console for non-authenticated requests (found under the
			 * API Access tab at this link: code.google.com/apis/). This is good
			 * practice and increased your quota.
			 */
			String apiKey = properties.getProperty("youtube.apikey");
			System.out.println("apiKey " + apiKey);
			list.setKey(apiKey);
			// search.setPageToken("1");
			/*
			 * We are only searching for videos (not playlists or channels). If
			 * we were searching for more, we would add them as a string like
			 * this: "video,playlist,channel".
			 */
			/*
			 * This method reduces the info returned to only the fields we need
			 * and makes calls more efficient.
			 */
			// search.setFields("items(id/kind,id/videoId,snippet/title,snippet/thumbnails/default/url)");
			VideoListResponse listResponse = list.execute();

			List<Video> resultList = listResponse.getItems();
			if (resultList != null) {
				prettyPrint(resultList.iterator());
			}
		} catch (GoogleJsonResponseException e) {
			System.err.println("There was a service error: "
					+ e.getDetails().getCode() + " : "
					+ e.getDetails().getMessage());
		} catch (IOException e) {
			System.err.println("There was an IO error: " + e.getCause() + " : "
					+ e.getMessage());
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}


	/*
	 * Prints out all SearchResults in the Iterator. Each printed line includes
	 * title, id, and thumbnail.
	 * 
	 * @param iteratorSearchResults Iterator of SearchResults to print
	 * 
	 * @param query Search query (String)
	 */
	private static void prettyPrint(
			Iterator<Video> iteratorSearchResults) {


		if (!iteratorSearchResults.hasNext()) {
			System.out.println(" There aren't any results for your query.");
		}

		while (iteratorSearchResults.hasNext()) {
			Video singleVideo = iteratorSearchResults.next();
			singleVideo.getId();
			Thumbnail thumbnail = singleVideo.getSnippet().getThumbnails().get("default");
			System.out.println(" Video Id: " + singleVideo.getId());
			System.out.println(" Title: "
					+ singleVideo.getSnippet().getTitle());
			System.out.println(" Thumbnail: " + thumbnail.getUrl());
			System.out
					.println("\n-------------------------------------------------------------\n");
		}
	}
}
