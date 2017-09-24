
public class L540 {

public int singleNonDuplicate(int[] nums) {
        
        int low = 0;
int high = nums.length-1;

    while(low < high) {
        int mid = low + (high - low)/2;
        if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])
            return nums[mid];
        else if(nums[mid] == nums[mid+1] && mid % 2 == 0)
            high = mid-1; 
        else if(nums[mid] == nums[mid-1] && mid % 2 == 1)
            high = mid-1;
        else
            low = mid+1;
    }
    return nums[high];
    }

public static void main(String[] args) {
		
		L540 l = new L540();
		int [] a = {1,1,2};
		System.out.println(l.singleNonDuplicate(a));
		
	}

}
