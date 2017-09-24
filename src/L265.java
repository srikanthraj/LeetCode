
public class L265 {

	
	public int minCostII(int[][] costs) {
	    if (costs.length == 0) {
	        return 0;
	    }
	    int min1 = 0, min2 = 0, index1 = -1;
	    
	    for (int i = 0; i < costs.length; i++) {
	        int m1 = Integer.MAX_VALUE, m2 = Integer.MAX_VALUE, idx1 = -1;
	        
	        for (int j = 0; j < costs[0].length; j++) {
	            int cost = costs[i][j] + (j != index1 ? min1 : min2);

	             if (cost < m1) {           // cost < m1 < m2
	                m2 = m1; m1 = cost; idx1 = j; 
	            
	            } else if (cost < m2) {    // m1 < cost < m2
	                m2 = cost;
	            }
	        }
	        
	        min1 = m1; min2 = m2; index1 = idx1;
	    }
	    return min1;
	}
	
	public static void main(String[] args) {
	
		L265 l = new L265();
		int[][] costs = {{1,3,5},{3,4,7},{8,1,6}};
		
		System.out.println(l.minCostII(costs));
	}
}
