package socialSearch;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.photos.Photo;
import com.flickr4java.flickr.photos.PhotosInterface;


public class FlickerGet {

	public static void main(String[] args) throws FlickrException {
		String apiKey = "0b95114c9c34e6086e65249e68ae84db";
		String secret = "e7beaf638c013645";
		REST transport = new REST();
		Flickr f = new Flickr(apiKey,secret,transport);
		PhotosInterface photosInterface = f.getPhotosInterface();
		Photo photo = photosInterface.getPhoto("10958853223");
		System.out.println(" getId: " + photo.getId());
        System.out.println(" getSmallSquareUrl: " + photo.getSmallSquareUrl());
        System.out.println(" getLargeUrl: " + photo.getLargeUrl());
        System.out.println(" getUrl: " + photo.getUrl());
        System.out.println(" getComments: " + photo.getComments());
        System.out.println(" getDescription: " + photo.getDescription());
        System.out.println(" getTitle: " + photo.getTitle());
        System.out.println(" getSecret: " + photo.getSecret());
        System.out.println("\n-------------------------------------------------------------\n");
	}
}
