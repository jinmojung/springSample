package socialSearch;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.social.exfm.api.ExFm;
import org.springframework.social.exfm.api.Song;
import org.springframework.social.exfm.api.impl.ExFmTemplate;

/**
 * @author Michael Lavelle
 */
public class ExfmGet {


	public static void main(String[] args) {
		ExFm exFm = new ExFmTemplate("http://ex.fm/api/v3");
		Song song = exFm.songOperations().getSongById("1deba3");
		System.out.println(" getId: " + song.getId());
		System.out.println(" getTitle Id: " + song.getTitle());
		System.out.println(" Url: " + song.getUrl());
		System.out.println("\n-------------------------------------------------------------\n");
	}
	

}
