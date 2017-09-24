import java.util.ArrayList;

public class L408 {

	 public boolean validWordAbbreviation(String word, String abbr) {
	        
		 int i = 0, j = 0;
	        while (i < word.length() && j < abbr.length()) {
	            if (word.charAt(i) == abbr.charAt(j)) {
	                ++i;++j;
	                continue;
	            }
	            if (abbr.charAt(j) <= '0' || abbr.charAt(j) > '9') {
	                return false;
	            }
	            int start = j;
	            while (j < abbr.length() && abbr.charAt(j) >= '0' && abbr.charAt(j) <= '9') {
	                ++j;
	            }
	            int num = Integer.valueOf(abbr.substring(start, j));
	            i += num;
	        }
	        return i == word.length() && j == abbr.length();
	    }

	public static void main(String[] args) {
		
		L408 l = new L408();
		System.out.println(l.validWordAbbreviation("internationalization","i12iz4n"));
	}
}
