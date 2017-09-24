import java.util.ArrayList;
import java.util.List;

public class L131 {

public List<List<String>> partition(String s) {
        
	List<List<String>> res = new ArrayList<List<String>>();
	
	boolean [][] temp = new boolean[s.length()][s.length()];
	
	for(int i = 0; i < s.length(); i++) {
        for(int j = 0; j <= i; j++) {
            if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || temp[j+1][i-1])) {
                temp[j][i] = true;
            }
        }
    }
	
	helper(res,new ArrayList<String>(),temp,s,0);
	
	return res;
   }

private void helper(List<List<String>> res, List<String> path, boolean[][] dp, String s, int pos) {
    if(pos == s.length()) {
        res.add(new ArrayList<>(path));
        return;
    }
    
    for(int i = pos; i < s.length(); i++) {
        if(dp[pos][i]) {
            path.add(s.substring(pos,i+1));
            helper(res, path, dp, s, i+1);
            path.remove(path.size()-1);
        }
    }
}



	public static void main(String[] args) {
		
		String s = "srikanth";
		System.out.println(s.substring(0, s.length()));
		L131 l = new L131();
		System.out.println(l.partition("aab"));
	}
}
