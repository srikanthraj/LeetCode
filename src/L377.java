import java.util.ArrayList;
import java.util.Arrays;

public class L377 {

	int count =0;
	
	 public int combinationSum4(int[] nums, int target) {
	  
		int[] dp = new int[target+1];
		Arrays.fill(dp,-1);
		
		
		 return findSol(nums,target,0,0,dp);
		
	  }
	 
	 /*
	 void findSol(int[] nums , int target, int currSum, int pos) {
		 
		 if(currSum > target)
			 return;
		 
		 if(currSum == target)
		 {
			 count++;
			 return;
		 }
		 
		 
		 for(int i =0;i<nums.length;i++) 
			 findSol(nums,target,currSum+nums[i],i);
			
	 }
	 */
	 
	 int findSol(int[] nums , int target, int currSum, int pos, int[]dp) {
		 
		 if(currSum > target)
			 return 0;
		 
		 if(dp[currSum] != -1)
			 return dp[currSum];
		 
		 
		 for(int i =0;i<nums.length;i++) 
			 dp[currSum] = findSol(nums,target,currSum+nums[i],i);
			
	 }
	 
	public static void main(String[] args) {
	
		L377 l = new L377();
		
		int[] nums = {1,2,3};
		int target = 32;
		
		System.out.println(l.combinationSum4(nums, target));
		
	}
}
