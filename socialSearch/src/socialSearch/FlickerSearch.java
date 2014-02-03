package socialSearch;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.photos.Photo;
import com.flickr4java.flickr.photos.PhotoList;
import com.flickr4java.flickr.photos.PhotosInterface;
import com.flickr4java.flickr.photos.SearchParameters;


public class FlickerSearch {

	public static void main(String[] args) throws FlickrException {
		String apiKey = "0b95114c9c34e6086e65249e68ae84db";
		String secret = "e7beaf638c013645";
		REST transport = new REST();
		Flickr f = new Flickr(apiKey,secret,transport);
		PhotosInterface photosInterface = f.getPhotosInterface();
		SearchParameters searchParameters = new SearchParameters();
		searchParameters.setText("풍경");
		searchParameters.setSort(SearchParameters.RELEVANCE);
		PhotoList<Photo> photoList = null;
		photoList = photosInterface.search(searchParameters, 5, 2);
		for(Photo photo:photoList){
			System.out.println(" getId: " + photo.getId());
	        System.out.println(" getSmallSquareUrl: " + photo.getSmallSquareUrl());
	        System.out.println(" getLargeUrl: " + photo.getLargeUrl());
	        System.out.println(" getUrl: " + photo.getUrl());
	        System.out.println(" getComments: " + photo.getComments());
	        System.out.println(" getDescription: " + photo.getDescription());
	        System.out.println(" getTitle: " + photo.getTitle());
	        System.out.println("\n-------------------------------------------------------------\n");
		}
	}
}
