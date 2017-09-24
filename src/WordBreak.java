import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {

	boolean findSol(String s , List<String> dict) {
	
		boolean [] dp = new boolean[s.length()+1];
		dp[0] = true;
		
		for(int i =1;i<=s.length();i++)
		{
			
			for(int j =0;j<=i;j++) {
				
				if(!dp[i]){
					dp[i] = dp[j] && dict.contains(s.substring(j, i));
					
					if(dp[i])
						System.out.println(s.substring(j,i));
				}
				else
					break;
			}
		}
		
		//System.out.println(Arrays.toString(dp));
		return dp[s.length()];
	}
	
	
	public static void main(String[] args) {
		
		WordBreak w = new WordBreak();
		String s = "catsanddog";
		List<String> dict = new ArrayList<String>();
		dict.add("cat");
		dict.add("cats");
		dict.add("and");
		dict.add("sand");
		dict.add("dog");
		
		System.out.println(w.findSol(s,dict));
	}
}
