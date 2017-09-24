import java.util.ArrayList;
import java.util.List;

public class L139 {

public boolean wordBreak(String s, List<String> wordDict) {
     
	boolean f[] = new boolean[s.length()+1];
	f[0] = true;
	
	for(int i=1; i<=s.length();i++) {
		
		for(int j =0;j<i;j++) {
			
			if(f[j] && wordDict.contains(s.substring(j, i)))
			{
				f[i] = true;
				break;
			}
		}
	}
	
	return f[s.length()];
	
    }

	public static void main(String[] args) {
		
		L139 l = new L139();
		String s = "leetcode";
		
		List<String> wd = new ArrayList<String>();
		wd.add("leet");
		wd.add("code");
		
		System.out.println(l.wordBreak(s,wd));
		
	}
}
