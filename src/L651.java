
public class L651 {

	 int res =0;
	 public int maxA(int N) {
	        
		int dp[] = new int[N+1];
		
		 for(int i =1;i<=N;i++)
		 {
			 
			 dp[i] = i;
			 for(int j =1;j<=i-3;j++) {
				 
				 res = Math.max(res, (j) * dp[i-j-1]);
			 }
			 
		 }
		 
		 return res;
}
	 
	public static void main(String[] args) {
		
		L651 l = new L651();
		int N = 7;
		
		System.out.println(l.maxA(N));
	}
}
