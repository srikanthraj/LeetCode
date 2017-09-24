import java.util.Arrays;

public class L576 {

	static final int M = 1000000007;
	
	int findPaths(int m, int n, int N, int i , int j) {
	
		int[][][] dp = new int[m][n][N+1];
		
		for(int[][] l:dp)
            for(int[] sl:l)
                Arrays.fill(sl,-1);
		
		return findPathsUtil(m,n,N,i ,j,dp);
	}
	
	int findPathsUtil(int m, int n, int N, int i , int j, int[][][]dp) {
		
		if(i< 0 || i>=m || j <0 || j>=n)
			return 1;
		
		if(N ==0)
			return 0;
		
		
		
		if(dp[i][j][N] != -1)
			return dp[i][j][N];
		
		
		
		dp[i][j][N] = ((findPathsUtil(m,n,N-1,i+1,j,dp) + findPathsUtil(m,n,N-1,i-1,j,dp))%M + (findPathsUtil(m,n,N-1,i,j+1,dp) + findPathsUtil(m,n,N-1,i,j-1,dp))%M)%M;
		
		return dp[i][j][N];
	}
	
	public static void main(String[] args) {
		
		L576 l = new L576();
		int m = 1, n = 3, N = 3, i = 0, j = 1;
		
		System.out.println(l.findPaths(m, n, N, i, j));
		
			
	}
}
