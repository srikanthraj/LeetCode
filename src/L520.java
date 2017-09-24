import java.time.chrono.IsoChronology;
import java.util.HashSet;
import java.util.Set;

public class L520 {

	
	boolean isCapital(char c) {
        
        int ascii = c ;
        
        if(ascii >= 65 && ascii <= 90)
        return true;
        
        return false;
    }
    
    public boolean detectCapitalUse(String word) {
    
        Set<Integer> capitalSet =  new HashSet<Integer>();
        
        
        for(int i =0;i<word.length();i++) 
            
            if(isCapital(word.charAt(i)))
            capitalSet.add(i);
        
        System.out.println(capitalSet);
        
        if(capitalSet.size() == word.length() || capitalSet.size() == 0 || (capitalSet.size() == 1 && capitalSet.contains(0)))
        return true;
        
        return false;    
    }
    
	public static void main(String[] args) {
		
		L520 l = new L520();
		
		String word = "FLaG";
		
		System.out.println(l.detectCapitalUse(word));
	}
}
