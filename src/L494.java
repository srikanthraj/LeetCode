
public class L494 {

	int count =0;
	 public int findTargetSumWays(int[] nums, int sum) {
	        
		 findUtil(nums,sum,0, 0);
		 
		 return count;
	 }
	 
	public static void main(String[] args) {
	
		L494 l = new L494();
		int []nums = {1,1,1,1,1};
		int sum = 3;
		
		System.out.println(l.findTargetSumWays(nums, sum));
	}
}
