import java.util.HashMap;
import java.util.HashSet;

public class L246 {

	
    
    public boolean isStrobogrammatic(String num) {
        
        HashMap<Character,Character> hm = new HashMap<Character,Character>();
        
        hm.put('0','0');
        hm.put('1','1');
        hm.put('6','9');
        hm.put('8','8');
        hm.put('9','6');
        
      StringBuilder sb = new StringBuilder();
      
      	for(int i = num.length()-1;i>=0;i--) {
      		
      		sb.append(hm.get(num.charAt(i)));
      	}
      
      	return num.equals(sb.toString());
    }
    
	public static void main(String[] args) {
		
		L246 l = new L246();
		System.out.println(l.isStrobogrammatic("868"));
		
	}
}
