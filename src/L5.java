
public class L5 {

	
public String longestPalindrome(String str) {
        
        int n = str.length();
		
		
		if(n == 0 || str == null)
			return null;
		
		int maxLen = 1;
		
		int startIndex = 0;
		int endIndex = 0;
		int mat[][] = new int[n][n];
		
		for(int i =0;i<n;i++)
			mat[i][i] = 1;
		
		for(int l = 2;l<= n;l++) {
            
            for(int i =0;i <= n-l;i++) {
            	int j = i +l -1;
          
		 if(str.charAt(i) == str.charAt(j) && (l ==2))
             mat[i][j] = 2;
             
             else if(str.charAt(i) == str.charAt(j) && mat[i+1][j-1] > 0)
             mat[i][j] = l;
             
             
         
             if(mat[i][j] > maxLen) {
            	 
            	 maxLen = mat[i][j];
            	 startIndex = i;
            	 endIndex = j;
             }
            }
		}
				
		System.out.println("Matrix is \n\n");
		
		for(int i =0;i<str.length();i++) {
			
			for(int j =0;j<str.length();j++) {
				
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println(maxLen);
		return str.substring(startIndex,endIndex+1);
    }

	public static void main(String[] args) {
		
		
		L5 l = new L5();
		System.out.println(l.longestPalindrome("abcda"));
	}
}
