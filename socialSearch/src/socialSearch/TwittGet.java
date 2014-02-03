package socialSearch;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.URLEntity;

import com.withanq.web.reader.DefaultReader;
import com.withanq.web.reader.YoutubeReader;

public class TwittGet {
	static DefaultReader defaultReader = new DefaultReader();
	static YoutubeReader youtubeReader = new YoutubeReader();
	public static void main(String[] args) throws Exception {

		Twitter twitter = new TwitterFactory().getInstance();
		youtubeReader.setSuccessor(defaultReader);
		try {
			Status showStatus = twitter.showStatus(Long.parseLong("425522273400156160"));
			System.out.println("id = " + showStatus.getId());
			System.out.println("@" + showStatus.getUser().getScreenName()+ " - " + showStatus.getText());
			URLEntity[] urlEntities = showStatus.getURLEntities();
			for(URLEntity urlEntiti:urlEntities){ 
				youtubeReader.findReader(urlEntiti.getURL());
			}
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to search tweets: " + te.getMessage());
			System.exit(-1);
		}
	}
}
