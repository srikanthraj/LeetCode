import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class L355 {

	private int timestamp = 0;
	private HashMap<Integer,User> userMap;
	
	class Tweet {
		
		int tweetid;
		int time;
		Tweet next;
		
		Tweet(int id){
			tweetid = id;
			time = timestamp++;
			next = null;
		}
		
	}
	
	class User {
		
		int uid;
		Set<Integer> followed;
		Tweet tweethead;
		
		User(int id) {
			
			uid = id;
			followed = new HashSet<Integer>();
			followed.add(id);
			tweethead = null;
		}		
	}
	
	L355() {
		userMap = new HashMap<Integer,User>();
		
	}
	void postTweet(int userId, int tweetId) {
		
		User u;
		if(!userMap.containsKey(userId)){
			
			u = new User(userId);
			userMap.put(userId, u);
		}
		
		else
			u = userMap.get(userId);
		
			Tweet t = new Tweet(tweetId);
			t.next = u.tweethead;
			u.tweethead = t;
		
	}
	
	void follow(int followerId, int followeeId) {
		
		
		if(!userMap.containsKey(followerId)) {
			
			User follower = new User(followerId);
			userMap.put(followerId, follower);
		}
		
		if(!userMap.containsKey(followeeId)) {
			
			User followee = new User(followeeId);
			userMap.put(followeeId, followee);
		}
		
		userMap.get(followerId).followed.add(followeeId);
		
	}
	
	void unfollow(int followerId, int followeeId) {
		
		
		if(!userMap.containsKey(followeeId) || followerId == followeeId) {
			
			return;
		}
		
		userMap.get(followerId).followed.remove(followeeId);
	}
	
	List<Integer> getNewsFeed(int userId) {
		
		List<Integer> res = new ArrayList<Integer>();
		
		if(!userMap.containsKey(userId))
			return res;
		
		Set<Integer> users = userMap.get(userId).followed;
		
		PriorityQueue<Tweet> q = new PriorityQueue<Tweet>(users.size(),(a,b)-> (b.time - a.time));
		
		for(int user: users) {
			
			Tweet t = userMap.get(user).tweethead;
			
			if(t!= null)
				q.add(t);
		}
		
		
		int n =0;
		while(!q.isEmpty() && n < 10) {
			
			Tweet t = q.poll();
			res.add(t.tweetid);
			n++;
			if(t.next != null)
				q.add(t.next);			
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
	
		/*
		 * void postTweet(int userId, int tweetId)
		 * List<Integer> getNewsFeed(int userId)
		 * follow(int followerId, int followeeId)
		 * follow(int followerId, int followeeId)
		 * 
		 */
	}
}
