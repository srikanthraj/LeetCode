
public class BloombergMat {

	
	/*
	 * 
	 * Given matrix is
    1     2     3     4
    5     6     7     8
    9    10    11    12
   13    14    15    16
   17    18    19    20

Diagonal printing of matrix is
    1
    5     2
    9     6     3
   13    10     7     4
   17    14    11     8
   18    15    12
   19    16
   20
	 * 
	 */
	
	boolean isValid(int i , int j,int m, int n) {
		
		return(i>=0 && j >= 0 && i<m && j <n);
	}
	void diagnolTraversalUp(int[][] a) {
		
		int m = a.length;
		int n = a[0].length;
		// Print First Col
		
		for(int k =0;k<m;k++) {
			
			int i = k;
			int j = 0;
			while(isValid(i,j,m,n)) {
			
				System.out.print(a[i][j]+"\t");
				i--;
				j++;
			}
			System.out.println();
		}
		
		for(int k = 1;k<n;k++){
			
			int i = m-1;
			int j = k;
			
			while(isValid(i,j,m,n)) {
				
				System.out.print(a[i][j]+"\t");
				i--;
				j++;
			}
			System.out.println();
		}
		
	}
	
	void diagnolTraversalBottom(int[][] a) throws Exception {
		
		int m = a.length;
		int n = a[0].length;
		
		for(int k = n-1;k>=0;k--) {
			
			int i = m-1;
			int j = k;
			
			while(isValid(i,j,m,n)) {
				
				System.out.print(a[i][j]+"\t");
				i--;
				j++;
			}
			
			System.out.println();
		}
		
		
		for(int k = m-2;k>=0;k--) {
			
			int i = k;
			int j = 0;
			
			while(isValid(i,j,m,n)) {
				
				System.out.print(a[i][j]+"\t");
				i--;
				j++;
			}
			
			System.out.println();
		
		
			if(i ==0)
				throw new ArithmeticException();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BloombergMat b = new BloombergMat();
		int[][] a= {{1, 2, 3, 4},
		        {5, 6, 7, 8},
		        {9, 10, 11, 12},
		        {13, 14, 15, 16},
		    };
		
		System.out.println("Diagnol Traversal from Top is");
		b.diagnolTraversalUp(a);
		
		System.out.println("Diagnol Traversal from Bottom is");
		b.diagnolTraversalBottom(a);
		
		
	}
	
}
