import java.util.HashMap;

public class L290 {

	public boolean wordPattern(String pattern, String str) {
        
		String words[] = str.split(" ");
		
		if(pattern.length() != words.length)
			return false;
		
		HashMap<Character,String> hm = new HashMap<Character,String>();
		
		for(int i =0;i<pattern.length();i++){
			
			if(!hm.containsKey(pattern.charAt(i)) && !hm.containsValue(words[i]))
				hm.put(pattern.charAt(i), words[i]);
			
			else if (!hm.containsKey(pattern.charAt(i)))
				return false;
			else {
				
				String s= hm.get(pattern.charAt(i));
				
				if(!s.equals(words[i]))
					return false;
			}
		}
		
		return true;
    }

	public static void main(String[] args) {
	
		L290 l = new L290();
		System.out.println(l.wordPattern("abba", "dog bbb bbb dog"));
	}
}
