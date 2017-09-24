import java.util.Arrays;
import java.util.List;


class SpecialNode {
	
	SpecialNode left;
	SpecialNode right;
	int val;
	int dup =1;
	int sum;
	
	SpecialNode(int val, int sum) {
		this.val = val;
		this.sum = sum;
	}
}
public class L315 {

	SpecialNode root = null;
	    public List<Integer> countSmaller(int[] nums) {
	        
	    	Integer[] res = new Integer[nums.length];
	    	
	    	for(int i = nums.length-1;i>=0;i--)
	    	{
	    		
	    		insert(nums,res,nums[i],root,0);
	    	}
	    	
	    	
	    	return Arrays.asList(res);
	    }
	
	    void insert(int[] nums, Integer[] res, int num, SpecialNode root, int prevSum){
	    	
	    	if(root == null)
	    	
	    	
	    	
	    }
	
	public static void main(String[] args) {
		
		L315 l = new L315();
		int[] nums = {3,2,2,6,1};
		System.out.println(l.countSmaller(nums));
		
	}
}
