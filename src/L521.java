
public class L521 {

	
public int findLUSlength(String a, String b) {
        
        int[] count = new int[26];
        int res = 0;
        int i;
        for(i =0;i<b.length();i++)
            count[b.charAt(i)- 97]++;
        
        for(i = 0;i<a.length();i++)
        {
            if(count[a.charAt(i)- 97] == 0)
            res++;
        }
        
        if(res == 0)
        	return -1;
        return res;
    }

public static void main(String[] args) {
	
	L521 l = new L521();
	System.out.println(l.findLUSlength("aba", "cdc"));
}
}
