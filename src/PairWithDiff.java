import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PairWithDiff {

	void findKDiff(int[] nums, int k) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int num: nums)
			hm.put(num, hm.getOrDefault(num, 0)+1);
		
		for(Map.Entry<Integer, Integer> e: hm.entrySet()) {
			
			if(k == 0) {
				
				if(e.getValue() >= 2)
					System.out.println(e.getKey() + "\t" + e.getKey());
			}
			
			else {
				
				if(hm.containsKey(e.getKey()+k))
					System.out.println(e.getKey() + "\t" + (e.getKey()+k));
			}
		}
		
	}
	public static void main(String[] args) {
		
		
		PairWithDiff p = new PairWithDiff();
		
		int nums[] = {8, 12, 16, 4, 0, 20};
		int k = 4;
		
		p.findKDiff(nums,k);
	}
}
