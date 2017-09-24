import java.awt.List;
import java.util.ArrayList;
import java.util.Stack;

public class L85 {

	int findLargest(int num[]) {
		
		Stack<Integer> s = new Stack<Integer>();
		int maxArea = 0;
		int i =0;
		int top =0;
		while(i< num.length)
		{
			if(s.isEmpty() || num[i] >= num[s.peek()])
				s.push(i++);
			
			else {
				top = s.pop();
				
				if(s.isEmpty())
					maxArea = Math.max(maxArea, i*num[top]);
				
				else
					maxArea = Math.max(maxArea, (i-s.peek()-1)* num[top]);
			}
		}
		
		
		while(!s.isEmpty()) {
			
			top = s.pop();
			
			if(s.isEmpty())
				maxArea = Math.max(maxArea, i*num[top]);
			
			else
				maxArea = Math.max(maxArea, (i-s.peek()-1)* num[top]);
		}
	
		return maxArea;
		
		 
	}
	public int maximalRectangle(char[][] matrix) {
	        
	int m =0;
	int n = 0;
	
	m = matrix.length;
	if(m > 0)
		n = matrix[0].length;
	
	int i =0;
	
	int[] num = new int[n];
	
	int maxArea = 0;
	
	for(i = 0;i<n;i++)
		num[i] = Character.getNumericValue(matrix[0][i]);
	
	maxArea = Math.max(maxArea, findLargest(num));
	
	for(i =1;i<m;i++){
		
		for(int j =0;j<n;j++){
			
			if(matrix[i][j] == '1')
				num[j] += 1;
			
			else
				num[j] = 0;
		}
		
		maxArea = Math.max(maxArea, findLargest(num));
	}
	
	
	return maxArea;
	}

	public static void main(String[] args) {
		
		L85 l = new L85();
		char [][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		//System.out.println(l.maximalRectangle(matrix));
		
		
		
	}
}
