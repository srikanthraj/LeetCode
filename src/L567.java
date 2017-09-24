
public class L567 {

public boolean allZeros(int[] count) {
        
        for(int i =0;i<26;i++)
        {
            if(count[i] != 0)
            return false;
        }
        
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        
        int len1 = s1.length();
        int len2 = s2.length();
        
        if(len2 < len1)
            return false;
        
        int count[] = new int[26];
        
        for(int i =0;i<s1.length();i++)
        {
            count[s1.charAt(i) - 97]++;
            count[s2.charAt(i) - 97]--;
        }
        
        if(allZeros(count))
        return true;
        
        for(int i =len1;i<len2;i++) {
            
            count[s2.charAt(i) - 97]--;
            count[s2.charAt(i-len1) - 97]++;
            
            if(allZeros(count))
            return true;
        }
        
        return false;
    }
    
	public static void main(String[] args) {
		
		L567 l = new L567();
		System.out.println(l.checkInclusion("abab", "eibadbaaboo"));
	}
}
