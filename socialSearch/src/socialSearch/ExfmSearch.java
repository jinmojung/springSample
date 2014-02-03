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
public class ExfmSearch {


	public static void main(String[] args) {
		ExFm exFm = new ExFmTemplate("http://ex.fm/api/v3");
		Page<Song> songs = exFm.songOperations().search("행복해",new Pageable() {
			
			public Sort getSort() {
				return null;
			}
			
			public int getPageSize() {
				return 10;
			}
			
			public int getPageNumber() {
				return 3;
			}
			
			public int getOffset() {
				int pageNumber = getPageNumber() - 1;
				return pageNumber * getPageSize();
			}
		});
		System.out.println(" getSize: " + songs.getSize());
		System.out.println(" getTotalPages: " + songs.getTotalPages());
		System.out.println(" getTotalElements: " + songs.getTotalElements());
		System.out.println(" hasNextPage: " + songs.hasNextPage());
		System.out.println(" isLastPage: " + songs.isLastPage());
		for (Song song : songs) {
			System.out.println(" getId: " + song.getId());
			System.out.println(" getTitle Id: " + song.getTitle());
			System.out.println(" Url: " + song.getUrl());
			System.out.println("\n-------------------------------------------------------------\n");
		}
	}
	

}
