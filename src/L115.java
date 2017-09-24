
public class L115 {

	
	int findSol(String s , String t) {
	
		if((s == null || s.length()==0) && (t == null || t.length()==0))
			return 1;
		
		else if(t == null || t.length() ==0)
			return 0;
		
		int mat[][] = new int[s.length()+1][t.length()+1];
		
		
		mat[0][0] =1;
		
		
		for(int i =1;i<=s.length();i++) {
			
			for(int j =0;j<=t.length();j++) {
				
				if(j ==0) {
					mat[i][j]=1;
					continue;
				}
				
				if(j>i)
					continue;
				
				if(s.charAt(i-1) == t.charAt(j-1)) {
					
					mat[i][j] = mat[i-1][j-1]+mat[i-1][j];
					//dp[j] = Math.max(dp[j-1], dp[j]+1);
				}
				
				else
					mat[i][j] = mat[i-1][j];
				
			}
		}
		
for(int i =0;i<=s.length();i++) {
			
			for(int j =0;j<=t.length();j++) {
			
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
}

return mat[s.length()][t.length()];
		
	}
	
	
	public static void main(String[] args) {
		
		L115 l = new L115();
		String s = "rabbbit";
		String t = "rabbit";
		
		System.out.println(l.findSol(s,t));
	}
}
