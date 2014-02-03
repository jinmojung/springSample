package socialSearch;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.URLEntity;

import com.withanq.web.reader.DefaultReader;
import com.withanq.web.reader.YoutubeReader;

public class TwittSearch {
	static DefaultReader defaultReader = new DefaultReader();
	static YoutubeReader youtubeReader = new YoutubeReader();
	public static void main(String[] args) throws Exception {

		Twitter twitter = new TwitterFactory().getInstance();
		youtubeReader.setSuccessor(defaultReader);
		try {
			Query query = new Query("크리넥스");
			query.setResultType(Query.RECENT);
			query.setCount(2);
			query.setMaxId(426241011551965184L);
			QueryResult result;
			result = twitter.search(query);
			List<Status> tweets = result.getTweets();
			for (Status tweet : tweets) {
				System.out.println("id = " + tweet.getId());
				System.out.println("@" + tweet.getUser().getScreenName()+ " - " + tweet.getText());
				URLEntity[] urlEntities = tweet.getURLEntities();
				for(URLEntity urlEntiti:urlEntities){ 
					youtubeReader.findReader(urlEntiti.getURL());
				}
				 
			}
			System.out.println("getMaxId = " + result.getMaxId());
			System.out.println("getSinceId = " + result.getSinceId());
			System.out.println("nextQuery = " + result.nextQuery().getMaxId());
			
			System.out.println("1111111111111111111111111111111111111111111111111111111111111");
			result = twitter.search(query);
			query.setCount(1);
			query.setCount(1);
			List<Status> tweetsNext = result.getTweets();
			for (Status tweet : tweetsNext) {
				System.out.println("id1 = " + tweet.getId());
				System.out.println("@1" + tweet.getUser().getScreenName()+ " - " + tweet.getText());
				URLEntity[] urlEntities = tweet.getURLEntities();
				for(URLEntity urlEntiti:urlEntities){ 
					youtubeReader.findReader(urlEntiti.getURL());
				}
				 
			}
			System.exit(0);
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to search tweets: " + te.getMessage());
			System.exit(-1);
		}
	}
}
