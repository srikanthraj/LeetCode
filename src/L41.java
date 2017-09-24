
public class L41 {

	
	public int firstMissingPositive(int[] A) {
        
		int n = A.length;
	        for(int i = 0; i < n; ++ i)
	            while(A[i] > 0 && A[i] <= n && A[A[i] - 1] != A[i])
	                swap(A,i, A[i] - 1);
	        
	        for(int i = 0; i < n; ++ i)
	        	System.out.println(A[i] + "\t");
	        
	        for(int i = 0; i < n; ++ i)
	            if(A[i] != i + 1)
	                return i + 1;
	        
	        return n + 1;
	
        
    }
    
    void swap(int[] nums, int i , int j) {
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
	public static void main(String[] args) {
		
		L41 l = new L41();
		//int nums[] = {0,1,2};
		int nums[] = {3,4,-1,1};
		System.out.println(l.firstMissingPositive(nums));
	}
}
