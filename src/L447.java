import java.util.HashMap;

public class L447 {

	public int numberOfBoomerangs(int[][] points) {
	     
	     HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	     int res = 0;
	     
	     for(int i =0;i<points.length;i++) {
	     
	        for(int j =0;j<points.length;j++) {
	            
	            if(i == j)
	            continue;
	        
	        int d =  getDistance(points[i],points[j]);
	        hm.put(d,hm.getOrDefault(d,0)+1);
	        
	     }
	        
	        for(int val:hm.values())
	   	     res += val * (val-1);
	        hm.clear();
	     
	    }
	   
	    
	    
	    return res;
	}
	private int getDistance(int[] a, int[] b) {
	    int dx = a[0] - b[0];
	    int dy = a[1] - b[1];
	    
	    return dx*dx + dy*dy;
	}
	
	public static void main(String[] args) {
		
		L447 l = new L447();
		
		int[][] points = {{0,0},{1,0},{2,0}};
		System.out.println(l.numberOfBoomerangs(points));
	}
	
}
