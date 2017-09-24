import java.util.Map;
import java.util.TreeMap;

public class L220 {

public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        
TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();

	for(int i =0;i<nums.length;i++) {
		
		
		int floor = -1;
		
		if(tm.floorKey(nums[i]) != null) {
			
			if(tm.containsKey(nums[i]))
				floor = 0;
			
			else 
				floor = tm.floorKey(nums[i]);
		}
		
		
		int ceil = -1;
		
		if(tm.ceilingKey(nums[i]) != null) {
			
			if(tm.containsKey(nums[i]))
				ceil = 0;
			
			else 
				ceil = tm.ceilingKey(nums[i]);
		}
		
		
		
		boolean floorDiff = false;
		boolean ceilDiff = false;
		if(floor != -1 && (Math.abs(nums[i] - floor)) <= t)
			floorDiff = true;
		
		 if(ceil != -1 && (Math.abs(nums[i] - ceil)) <= t)
			ceilDiff = true;
		
		
		if(floorDiff) {
			
			for(Map.Entry<Integer,Integer> e : tm.entrySet()){
			
				if((i - e.getValue()) <=k)
				
					return true;
			}
		}
		
		if(ceilDiff) {
				
				for(int j =1;j <= t;j++) {
					
					if(tm.containsKey(nums[i] + j) && (i - tm.get(nums[i]+j)) <=k) 
						return true;
				
			}
		}
		/*
		if(floorDiff && Math.abs(i - tm.get(floor)) <= k)
			return true;
		
		if(ceilDiff && Math.abs(i - tm.get(ceil)) <= k)
			return true;
		*/
		
			tm.put(nums[i], i);

	}


	return false;
}

	public static void main(String[] args) {
		
		int nums[] = {0,2147483647};//{27,5,12,16,19,26,14,28,45};
		
		int k  = 1;
		int t = 2147483647;
		
		L220 l = new L220();
		
		int x = 'e' - 97 ;
		System.out.println(x);
		int n = x  + 97;
		System.out.println(Character.toString ((char) n));
		
		System.out.println(l.containsNearbyAlmostDuplicate(nums, k, t));
		
	}
}
