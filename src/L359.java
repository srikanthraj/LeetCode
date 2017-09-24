import java.util.HashMap;


public class L359 {

	


	 HashMap<String,Integer> hm = new HashMap<String,Integer>();
	    
	    /** Initialize your data structure here. */
	     L359() {
	        
	    }
	    
	    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
	        If this method returns false, the message will not be printed.
	        The timestamp is in seconds granularity. */
	    public boolean shouldPrintMessage(int timestamp, String message) {
	        
	    	if((hm.containsKey(message) && (timestamp - hm.get(message) >= 10)) || !hm.containsKey(message)) {
	    		hm.put(message, timestamp);
	    		return true;
	    	}
	   
	    	else
	    		return false;
	    }
	    
}
