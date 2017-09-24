import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L78_2 {

	List<List<Integer>> res = new ArrayList<List<Integer>>();
	
	public List<List<Integer>> subsets(int[] nums) {
		
		Arrays.sort(nums);
		
		
		for(int i =0;i< Math.pow(2, nums.length);i++) {
			
			ArrayList<Integer> al = new ArrayList<Integer>();
			
			for(int j =0; j< nums.length;j++) {
				
				if((i & (1<<j)) !=0)
					al.add(nums[j]);
					
			}
			
			res.add(new ArrayList<Integer>(al));
		}
		
		return res;
		
		
	}
	
	public static void main(String[] args) {
		
		L78_2 l = new L78_2();
		int nums[] = {3,2,1};
		
		int [] heaters = {2,5,7,15};
		int[] houses = {1,3,5,10,16};
		
		for(int house : houses){
			
			System.out.println(Arrays.binarySearch(heaters, house));
		}
		//System.out.println(l.subsets(nums));
	}
}
