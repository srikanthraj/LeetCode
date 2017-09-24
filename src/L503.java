import java.util.Arrays;
import java.util.Stack;

public class L503 {

public int[] nextGreaterElements(int[] nums) {

	int [] res = new int[nums.length];
	Arrays.fill(res, -1);
	
	Stack<Integer> s = new Stack<Integer>();
	
	for(int i =0;i<nums.length * 2;i++){
		
		int num = nums[i%nums.length];
		if(!s.isEmpty() && nums[s.peek()] < num){
			
			while(!s.isEmpty() && nums[s.peek()] < num) {
				res[s.pop()] = num;
			}
			if(i<nums.length)
			s.push(i);
		}
		
		else
		{
			if(i<nums.length)
			s.push(i);
		}
	}
	
	while(!s.isEmpty()){
		res[s.pop()] = -1;
	}
	
	return res;
	
}

	public static void main(String[] args) {
		
		L503 l = new L503();
		
		int nums[] = {1,4,2,5,3,1};
		
		System.out.println(Arrays.toString(l.nextGreaterElements(nums)));
	}
}
