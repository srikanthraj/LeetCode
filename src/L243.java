
public class L243 {

public int shortestDistance(String[] words, String word1, String word2) {
        
    int i = -1;
    int j = -1;
    int min = Integer.MAX_VALUE;
    int k =0;
    for(k = 0;k<words.length;k++) {
    	
    	if(words[k].equals(word1)) {
    		
    		i = k;
    		
    		if(j >=0)
    			min = Math.min(min, Math.abs(i-j));
    		
    	}
    	
    	else if(words[k].equals(word2)) {
    		
    		j = k;
    		
    		if(i >=0)
    			min = Math.min(min, Math.abs(i-j));
    		
    	}

    		
    }
    return min;
	
    }

	public static void main(String[] args) {
		
		L243 l = new L243();
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		String word1 = "makes";
		String word2 = "coding";
		System.out.println(l.shortestDistance(words, word1, word2));
	}
}
