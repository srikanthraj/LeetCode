
public class L34 {

public int[] searchRange(int[] nums, int target) {
        
        int res[] = new int[2];
        
        res[0] = findStart(nums,0,nums.length-1,target);
        res[1] = findEnd(nums,0,nums.length-1,target);
        
        return res;
    }
    
    int findStart(int[] a, int low, int high, int x){
        
        if(low > high)
        return -1;
        
        int mid = low + (high-low)/2;
        
        if(a[mid] == x && (mid == low || a[mid-1] < x))
        return mid;
        
        else if (a[mid] < x)
        return findStart(a,mid+1,high,x);
        
        else
        return findStart(a,low,mid-1,x);
    }
    
    int findEnd(int[] a, int low, int high, int x){
        
        if(low > high)
        return -1;
        
        int mid = low + (high-low)/2;
        
        if(a[mid] == x && (mid == high || a[mid+1] > x))
        return mid;
        
        else if (a[mid] > x)
        return findEnd(a,low,mid-1,x);
        
        else
        return findEnd(a,mid+1,high,x);
    }
    
}
