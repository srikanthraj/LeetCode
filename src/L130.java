import java.util.Arrays;

public class L130 {

	public void solve(char[][] mat) {
    
		int n =0;
		int m = mat.length;
		
		if(m==0)
			return;
		if(m>0)
			n = mat[0].length;
		
		if(m==1 || n ==1)
			return;
		
		for(int i =0;i<m;i++) {
			
			for(int j=0;j<n;j++){
				
				if((i==0||j==0||i==m-1||j==n-1))
					dfsMarkO(mat,i,j,m,n);
			}
		}
		
for(int i =0;i<m;i++) {
			
			for(int j=0;j<n;j++){
		
				
				if(mat[i][j] == 'M')
					mat[i][j] = 'O';
				
				else if(mat[i][j] != 'X')
					mat[i][j] = 'X';
			}
}


	
	}
	
	void dfsMarkO(char[][] mat, int i, int j, int m, int n) {
		
		if(i<0 || i>=m || j<0 || j>=n)
			return;
		
		if(mat[i][j] == 'X')
			return;
		
		if(mat[i][j] == 'M')
			return;
		
		mat[i][j] = 'M';
		
		if(i+1<m) dfsMarkO(mat,i+1,j,m,n);
		if(j+1<n) dfsMarkO(mat,i,j+1,m,n);
		if(i-1>0) dfsMarkO(mat,i-1,j,m,n);
		if(j-1>0) dfsMarkO(mat,i,j-1,m,n);
	}

	public static void main(String[] args) {
		
		L130 l = new L130();
		
		char[][]mat = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		
		l.solve(mat);
		
		for(int i =0;i<mat.length;i++)
			System.out.println(Arrays.toString(mat[i]));
	}
}
