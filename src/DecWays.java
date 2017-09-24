
public class DecWays {

	int findSol(String s) {
		
		if(s== null || s.length()==0)
			return 0;
		
		int[] dp = new int[s.length()+1];
		dp[s.length()] =1;
		
		for(int i=s.length()-1;i>=0;i--){
			
			char ch = s.charAt(i);
			
			if(ch == '0')
				continue;
			
			dp[i] = dp[i+1];
			
			if(i != s.length()-1) {
				
				int num = Integer.parseInt(s.substring(i, i+2));
				
				if(num > 0 && num <27)
					dp[i]+=dp[i+2];
			}
		}
		
		return dp[0];
	}
	public static void main(String[] args) {
		
		DecWays d = new DecWays();
		String s = "100";
		System.out.println(d.findSol(s));
	}
}
