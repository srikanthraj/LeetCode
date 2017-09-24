import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class L506 {

public String[] findRelativeRanks(int[] nums) {

	TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
	
	String[] res = new String[nums.length];
	
		int i;
		
		for(i =0;i<nums.length;i++)
			tm.put(nums[i], i);
			
		System.out.println(tm);
		i =0;
		
		for(Map.Entry<Integer,Integer> e: tm.entrySet()){
			
			int index = nums.length - i;
			if(index ==1)
				res[e.getValue()] = "Gold Medal";
			
			else if(index ==2)
				res[e.getValue()] = "Silver Medal";
			
			else if(index ==3)
				res[e.getValue()] = "Bronze Medal";
			
			
			else
				
				res[e.getValue()] = "" + index;
			
			i++;
		}
			
			
		return res;
	
    }

	public static void main(String[] args) {
		
		L506 l = new L506();
		
		int nums[] = {10,3,8,9,4};
		
		System.out.println(Arrays.toString(l.findRelativeRanks(nums)));
				
		
	}
}
