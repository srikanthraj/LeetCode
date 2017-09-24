import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class L378 {

public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k,new Comparator<Integer>() {
            
            
			
public int compare(Integer a, Integer b) {
                
                if(a > b)
                    return 1;
                
                else if(a < b)
                    return -1;
                
                else
                    return 0;
            }
        });
        
        int n = matrix.length;
        
       
        
        
        for(int i =0;i<n;i++)
        {
            
            for(int j =0;j<n;j++) {
                
                pq.add(matrix[i][j]);
            }
        }
     
        return pq.peek();
    }
	
	public static void main(String[] args) {
		
		
		
	}
}
