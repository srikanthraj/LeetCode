
public class L33 {

	    
	    public int findPivot(int arr[] , int low, int high) {
	        
	    	// base cases
	        if (high < low)  
	             return -1;
	        if (high == low) 
	             return low;
	         
	        /* low + (high - low)/2; */
	        int mid = (low + high)/2;   
	        if (mid < high && arr[mid] > arr[mid + 1])
	            return mid;
	        if (mid > low && arr[mid] < arr[mid - 1])
	            return (mid-1);
	        if (arr[low] >= arr[mid])
	            return findPivot(arr, low, mid-1);
	        return findPivot(arr, mid + 1, high);
	    }
	    
	    public int findIndex(int[] a , int l, int h, int x) {
	        
	        if(l > h)
	        return -1;
	        
	        int mid = l + (h-l)/2;
	        
	        if(x == a[mid])
	        return mid;
	        
	        else if (a[mid] > x)
	        return findIndex(a,l,mid-1,x);
	        
	        else
	        return findIndex(a,mid+1,h,x);
	    }
	    
	    public int search(int[] nums, int target) {
	        
	        if(nums == null || nums.length == 0)
	        return -1;
	        
	        int pivot = findPivot(nums,0,nums.length-1);
	        System.out.println("Pivot " + pivot);
	        
	        if(target  >= nums[0])
	        return findIndex(nums,0,pivot,target);
	        
	        else
	        return findIndex(nums,pivot+1,nums.length-1,target);        
	        
	    }

	
	public static void main(String[] args) {
		
		L33 l = new L33();
		int nums[] = {4,3,2,1};
		System.out.println(l.search(nums, 1));
	}
}
