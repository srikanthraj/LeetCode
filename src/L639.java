import java.util.Arrays;

public class L639 {

	int findSol(String s) {
		
		int M = 1000000007;
		
		if(s== null || s.length()==0)
			return 0;
		
		int[] dp = new int[s.length()+1];
		dp[s.length()] =1;
		
		for(int i=s.length()-1;i>=0;i--){
			
			char ch = s.charAt(i);
			
			if(ch != '*')
			{
				//&& ((i == 0) || (s.charAt(i-1) != '*')) 
			if(ch == '0')// && ((i == s.length()-1) || (s.charAt(i+1) != '*')))
				continue;
			
			else if ((i == s.length()-1) || (s.charAt(i+1) != '*'))
			{
			
				dp[i] = dp[i+1];
				
				if(i != s.length()-1) {
					
					int num = Integer.parseInt(s.substring(i, i+2));
					
					if(num > 0 && num <27)
						dp[i]+=dp[i+2];
				}
			}
			
			else {
				
				int num = Character.getNumericValue(ch);
				dp[i] = dp[i+1];
				
				if(num ==2)
				dp[i] += 6*dp[i+2];
				
				else if(num==1)
					dp[i] += 9*dp[i+2];
					
				
			}
			
			
		} // ch!= *
		
			else {
				
				// curr = *, next char is not *, Not last
				
				if(i!=s.length()-1 && s.charAt(i+1) != '*') {
					
					dp[i] = 9*dp[i+1];
					
					int num = Character.getNumericValue(s.charAt(i+1));
					
					if(num <7)
						dp[i] += 2*dp[i+2];
					
					else
						dp[i] += dp[i+2];
				}
				
				// curr* , next char is * , Not last
				
				else if(i!=s.length()-1 && s.charAt(i+1) == '*') {
				
					dp[i] = 9* dp[i+1];
					dp[i] += 15*dp[i+2];
					
				}
				// curr *, Last
				else if(i == s.length()-1)
					dp[i] = 9;
				
				
			}
			
			dp[i] = dp[i]%M;
			/*
			if(ch == '0')
				continue;
			
			dp[i] = dp[i+1];
			
			if(i != s.length()-1) {
				
				int num = Integer.parseInt(s.substring(i, i+2));
				
				if(num > 0 && num <27)
					dp[i]+=dp[i+2];
			}
			
			*/
		}
		
		System.out.println(Arrays.toString(dp));
		return dp[0];
		
	}
	public static void main(String[] args) {
		L639 l = new L639();
		String s= "*********";
		System.out.println(l.findSol(s));
	}
}
