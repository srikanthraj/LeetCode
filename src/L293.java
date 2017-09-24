import java.util.ArrayList;
import java.util.List;

public class L293 {

public List<String> generatePossibleNextMoves(String s) {
        
        List<String> res = new ArrayList<String>();
        if(s.length() < 2)
        return res;
        
        for(int i =0;i<= s.length() -2;i++) {
            
        	
            if(s.substring(i,i+2).equals("++"))
            	
            	res.add(s.substring(0,i) + "--" + s.substring(i+2,s.length()));
          
        }
        
        return res;
    }

	public static void main(String[] args) {
		
		L293 l = new L293();
		String s = "++++";
		
		System.out.println(l.generatePossibleNextMoves(s));
	}
}
