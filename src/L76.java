import java.util.TreeMap;

public class L76 {

public String minWindow(String s, String t) {
  
	if (s.length() < t.length()) return "";
	Integer minimum = Integer.MAX_VALUE;

	    int[] hash = new int[256];
	    for (char c : t.toCharArray()) hash[c]++;
	    int leftPoint = 0, rightPoint = 0, count = t.length();
	    int resRight = 0, resLeft = 0;

	    while (rightPoint < s.length()) {
	        char cRight = s.charAt(rightPoint);
	        hash[cRight]--;
	        if (hash[cRight] >= 0) count--;
	        rightPoint++;
	        while (count == 0) {
	            if (rightPoint - leftPoint < minimum) {
	                minimum = rightPoint - leftPoint;
	                resRight = rightPoint; resLeft = leftPoint;
	            }

	            char cLeft = s.charAt(leftPoint);
	            hash[cLeft]++;
	            if (hash[cLeft] > 0) count++;
	            leftPoint++;
	        }
	    }
	    return minimum == Integer.MAX_VALUE ? "" : s.substring(resLeft, resRight); 
		
	
  }

	public static void main(String[] args) {
		
		L76 l = new L76();
		String s = "ZABOCECODEBANC";
		String t = "ABC";
		System.out.println(l.minWindow(s, t));
	}
}
