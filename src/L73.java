
public class L73 {

void nullifyRow(int[][] matrix, int m , int n , int rowNum) {
        
        for(int i =0;i<n;i++)
            matrix[rowNum][i] = 0;
    }
    
    void nullifyCol(int[][] matrix, int m , int n , int colNum) {
        
        for(int i =0;i<m;i++)
            matrix[i][colNum] = 0;
    }
    
    public void setZeroes(int[][] matrix) {
        
        boolean rowHZ = false;
        boolean colHZ = false;
        int i ;
        int j;
        
        int m = matrix.length;
        int n =0;
        if(m>0)
            n = matrix[0].length;
        //Step 1: set rowHZ and colHZ
        for(i = 0;i<m;i++)
            if(matrix[i][0] == 0)
                colHZ = true;
        
        for(i = 0;i<n;i++)
            if(matrix[0][i] == 0)
                rowHZ = true;
        
        // Step 2: Set first row and col to 0 if any element in that corr row, col is 0
        
        for(i =1;i<m;i++) {
            
            for(j = 1;j<n;j++) {
                
                if(matrix[i][j] == 0)
                {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        
        for(i = 0;i<m;i++)
            if(matrix[i][0] == 0)
                nullifyRow(matrix,m,n,i);
        
        for(i = 0;i<n;i++)
            if(matrix[0][i] == 0)
                nullifyCol(matrix,m,n,i);
        
        if(colHZ)
            nullifyCol(matrix,m,n,0);
        
        if(rowHZ)
            nullifyRow(matrix,m,n,0);
          
    }
    
    void printMatrix (int[][] matrix, int m , int n) {
    	
    	for(int i =0;i<m;i++) {
    		for(int j =0;j<n;j++) {
    			System.out.print(matrix[i][j] + "\t");
    		}
    		System.out.println();
    	}
    }
    public static void main(String[] args) {
		
    	L73 l = new L73();
    	int [][]matrix = {{2,1,7,8},{5,6,6,9},{1,9,5,0},{0,8,2,1},{3,4,5,1}};
    	l.setZeroes(matrix);
    	l.printMatrix(matrix,matrix.length,matrix[0].length);
	}
}
