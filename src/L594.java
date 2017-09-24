import java.util.HashMap;
import java.util.Map;

public class L594 {

public int findLHS(int[] nums) {
        
	int max = 0;
	HashMap<Long,Integer> hm = new HashMap<Long,Integer>();
	
	for(long num:nums) 
		hm.put(num, hm.getOrDefault(num, 0)+1);
		
	for(long key: hm.keySet()) {
		
		if(hm.containsKey(key+1))
			max = Math.max(max, hm.get(key+1)+hm.get(key));
		
	}
	
	
	return max;
  }

public static void main(String[] args) {
	
	L594 l = new L594();
	int a[] = {1,3,2,2,5,2,4,4,4,4,4,4,4,3,7};
	System.out.println(l.findLHS(a));
	
}
	
}
