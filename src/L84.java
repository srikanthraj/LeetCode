import java.util.Stack;

public class L84 {

	public int largestRectangleArea(int[] heights) {
    
		if(heights == null || heights.length == 0)
			return 0;
		int maxArea = Integer.MIN_VALUE;
		int top = 0;
		int i =0;
		Stack<Integer> s= new Stack<Integer>();
		
		while(i< heights.length)
		{
			if(s.isEmpty() || heights[i] >= heights[s.peek()])
				s.push(i++);
			
			else {
				top = s.pop();
				
				if(s.isEmpty())
					maxArea = Math.max(maxArea, i*heights[top]);
				
				else
					maxArea = Math.max(maxArea, (i-s.peek()-1)* heights[top]);
			}
		}
		
		
		while(!s.isEmpty()) {
			
			top = s.pop();
			
			if(s.isEmpty())
				maxArea = Math.max(maxArea, i*heights[top]);
			
			else
				maxArea = Math.max(maxArea, (i-s.peek()-1)* heights[top]);
		}
	
		return maxArea;
	
    }

	public static void main(String[] args) {
		
		L84 l = new L84();
		int [] heights = {2,1,5,6,2,3};
		System.out.println(l.largestRectangleArea(heights));
	}
}
