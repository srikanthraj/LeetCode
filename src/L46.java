import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L46 {

List<List<Integer>> res = new ArrayList<List<Integer>>();
	
void swap(int [] nums , int i, int j) {
	/*
	nums[i] ^= nums[j];
	nums[j] ^= nums[i];
	nums[i] ^= nums[j];
	*/
	
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }



public List<List<Integer>> permute(int[] nums) {
    
    permUtil(nums,0,nums.length); 
    return res;
}

void permUtil(int[] nums,int low, int high) {
        
        if(low == high) {
           ArrayList<Integer> al = new ArrayList<Integer>();
           for(int num: nums)
        	   al.add(num);
            
            res.add(al);
            //System.out.println(Arrays.toString(nums));
            return;
        }
        
        for(int i = low;i< high;i++) {
            
            swap(nums,low,i);
            permUtil(nums,low+1,high);
            swap(nums,low,i);
        }
    }

	public static void main(String[] args) {
		
		L46 l = new L46();
		
		double sum = 5;
		int len = 2;
		double res = sum/len;
		System.out.println(res);
		int nums[] = {1,2,3};
		System.out.println(l.permute(nums));
	}
}
