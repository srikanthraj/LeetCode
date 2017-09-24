import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L78 {

	List<List<Integer>> res = new ArrayList<List<Integer>>();
	
	public List<List<Integer>> subsets(int[] nums) {
	
		Arrays.sort(nums);
		
		subUtil(nums,0,new ArrayList<Integer>());
		
		return res;
		
	}
	
	void subUtil(int[] a, int pos ,ArrayList<Integer> al) {
	
		
		res.add(new ArrayList<Integer>(al));
		
		if(pos == a.length)
			return;
		
		for(int i =pos;i<a.length;i++) {
			al.add(a[i]);
			
			subUtil(a,i+1,al);
			
			if(al.size() > 0)
				al.remove(al.size()-1);
			
		}
	}
	
	
	public static void main(String[] args) {
	
		L78 l = new L78();
		
		int nums[] = {3,2,1};
		
		System.out.println(l.subsets(nums));
	}
}
