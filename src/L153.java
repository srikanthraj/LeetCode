
public class L153 {

public int findMin(int[] nums) {
        
        int pivot = findPivot(nums, 0, nums.length-1);
        
        System.out.println(pivot);
        if(pivot == nums.length -1)
            return Math.min(nums[pivot],nums[0]);
        
        else if (pivot == 0)
        	return Math.min(nums[pivot+1],Math.min(nums[pivot],nums[nums.length-1]));
        
            else
            return nums[pivot+1];
    }
    
    int findPivot(int[] nums , int low, int high) {
        
        if(low > high)
        return -1;
    
        
        int mid = low + (high - low)/2;
        
        
        if((mid == high) || (nums[mid+1] < nums[mid]))
        return mid;
        
        else if(nums[mid] < nums[0])
        
        return findPivot(nums,low,mid);
         
        else  
        return findPivot(nums,mid+1,high);
        
    }
	
	public static void main(String[] args) {
		
		L153 l = new L153();
		int[] nums = {5,4,3,2,1};
		System.out.println(l.findMin(nums));
	}
}
