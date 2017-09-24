import java.util.HashMap;
import java.util.Map;

public class CCIOneFour {
	
	static boolean findSol(String s) {
		
		s= s.toLowerCase();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch != ' ')
			hm.put(ch, hm.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(hm);
		int oddCount = 0;
		int evenCount =0;
		
		for(Map.Entry<Character, Integer> e: hm.entrySet()) {
			
			if(e.getValue() % 2 == 0)
				evenCount++;
			
			if(e.getValue() % 2 != 0)
				oddCount++;
			
		}
		
		if(oddCount == 0 || oddCount == 1)
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		
		String s = "Tact coa";
		System.out.println(findSol(s));
	}
}
