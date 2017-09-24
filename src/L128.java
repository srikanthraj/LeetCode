import java.util.HashMap;

public class L128 {

public int longestConsecutive(int[] nums) {
        
        if(nums == null || nums.length ==0)
            return 0;
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int maxLen = 1;
        for(int num:nums){
            
            if(!hm.containsKey(num)) {
            int left = hm.containsKey(num-1)?hm.get(num-1):0;
            
            int right = hm.containsKey(num+1)?hm.get(num+1):0;
            
            int sum = left+right+1;
            maxLen = Math.max(sum,maxLen);    
            
            hm.put(num,sum);
            
            hm.put(num-left,sum);
            hm.put(num+right,sum);
            }
        }
        
        return maxLen;
    }
	public static void main(String[] args) {
	
		L128 l = new L128();
		int []a = {5,4,3};
		System.out.println(l.longestConsecutive(a));
	}
}
