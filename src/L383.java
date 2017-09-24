import java.util.HashMap;
import java.util.Map;

public class L383 {

	public boolean canConstruct(String ransomNote, String magazine) {
    
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		int i ;
		for(i =0;i<ransomNote.length();i++) {
			
			char c = ransomNote.charAt(i);

			if(!hm.containsKey(c))
				hm.put(c, 1);
			
			else
				hm.put(c, hm.get(c)+1);
			
		}
		
		System.out.println(hm);
		
		for(i =0;i<magazine.length();i++){
			
			char c = magazine.charAt(i);
			
			if(hm.containsKey(c) && hm.get(c) > 0)
				hm.put(c, hm.get(c)-1);
		}
		
		
		for(Map.Entry e : hm.entrySet()){
			
			if((int)e.getValue() != 0)
				return false;
		}
		
		return true;
    }
	
	public static void main(String[] args) {
	
		L383 l = new L383();
		
		System.out.println(l.canConstruct("aaa", "aab"));
	}
}
