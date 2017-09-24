
public class L329 {

	 int up =0;
	 int down = 0;
	 int left = 0;
	 int right = 0;
	 public int longestIncreasingPath(int[][] mat) {
	     
		 int res = Integer.MIN_VALUE;
		 if(mat == null || mat.length == 0)
			 return 0;
		 
		 int row = mat.length;
		 int col = mat[0].length;
	
		 int[][]dp = new int[row][col];
		
		 for(int i =0;i<row;i++) {
			 
			 for(int j =0;j<col;j++) {
				 
				 dp[i][j] = -1;
			 }
		 }
				 
		 
		 for(int i =0;i<row;i++) {
			 
			 for(int j =0;j<col;j++) {
				 
				 
				 
				 
				 dp[i][j] = dfs(mat,dp,row,col,i,j,0)+1;
				 System.out.print(dp[i][j] + "\t");
				 
				 res = Math.max(res, dp[i][j]);
				 
			 }
			 
			 System.out.println();
		 }
		 
		 return res;
		 
	}
	 
	 
	 boolean isSafe(int[][]mat, int row, int col , int i , int j)
	 {
		 
		 return (i< row && j < col && i >=0 && j >=0);
	 }
	 
	 int dfs(int[][] mat,int[][]dp, int row, int col, int i , int j, int count) {
		 
		 if(!isSafe(mat,row,col,i,j))
			 return count;
		 
		
		 
		 //Up
		 if(isSafe(mat,row,col,i-1,j)) {
		 if(dp[i][j] != -1 && mat[i][j] < mat[i-1][j])
			 up = dp[i-1][j];
		 
		 else if(mat[i][j] < mat[i-1][j])
			 up = dfs(mat,dp,row,col,i-1,j,count+1);
		 }
		// right
		 
		 if(isSafe(mat,row,col,i,j+1)) {
			 
			 if(dp[i][j] != -1 && mat[i][j] < mat[i][j+1])
				 right = dp[i][j+1];
			 
			 else if(mat[i][j] < mat[i][j+1])
				 right = dfs(mat,dp,row,col,i,j+1,count+1);
			 
		 }
		 
		 //		 	left
		 
		 if(isSafe(mat,row,col,i,j-1)) {
			 
			 if(dp[i][j] != -1 && mat[i][j] < mat[i][j-1])
				 left = dp[i][j-1];
			 
			 else if(mat[i][j] < mat[i][j-1])
				 left = dfs(mat,dp,row,col,i,j-1,count+1);
			 
			 
		 }
		 
		 //Down
		 if(isSafe(mat,row,col,i+1,j)) {
			 
			 if(dp[i][j] != -1 && mat[i][j] < mat[i+1][j])
				 down = dp[i+1][j];
			 
			 else if(mat[i][j] < mat[i+1][j])
				 down = dfs(mat,dp,row,col,i+1,j,count+1);
			 
		 }
		 
		 return max(up,down,left,right);
		 
	 }
	 
	 int max(int a, int b, int c, int d) {
		 
		 int temp =Math.max(a, b);
		 int ttemp = Math.max(c, d);
		 return Math.max(temp, ttemp);
	 }
	 
	public static void main(String[] args) {
	
		L329 l = new L329();
		int[][] matrix = {{9,9,4},{6,6,8},{2,1,1}};
		
		System.out.println(l.longestIncreasingPath(matrix));
		
	}
}
