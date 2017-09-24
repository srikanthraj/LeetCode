import java.util.HashSet;

public class L345 {

	 public String reverseVowels(String s) {
	        
	        if(s== null || s.length() == 0)
	        return s;
	        
	        int i =0;
	        int j = s.length()-1;
	        
	        HashSet<Character> hs = new HashSet<Character>();
	        hs.add('a');
	        hs.add('e');
	        hs.add('i');
	        hs.add('o');
	        hs.add('u');
	        hs.add('A');
	        hs.add('E');
	        hs.add('I');
	        hs.add('O');
	        hs.add('U');
	        
	        char[] str = s.toCharArray();
	        
	        while(i <j) {
	            
	            char start = str[i];
	            char end = str[j];
	            
	            if(hs.contains(start) && hs.contains(end))
	            {
	            	
	                char temp = str[i];
	                str[i] = str[j];
	                str[j] = temp;
	                i++;
	                j--;
	                
	            }
	            
	            else if(!hs.contains(start))
	                i++;
	            
	            else if(!hs.contains(end))
	                j--;
	            
	            else
	            {
	                i++;
	                j--;
	            }
	        }
	        
	        return new String(str);
	    }
	 
	public static void main(String[] args) {
		
		L345 l = new L345();
		System.out.println(l.reverseVowels("hello"));
	}
}
