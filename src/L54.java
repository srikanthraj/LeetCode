
public class L54 {

	void printSpiral(int [][] a) {
		
		int m = a.length;
		int n = a[0].length;

		int top = 0;
		int right = n-1;
		int bottom = m-1;
		int left = 0;
		
		int i ;
		
		while(left <= right && top <= bottom) {
			
			// top row
			//
			for(i = left;i<=right;i++)
				System.out.println(a[top][i]);
			
			top++;
			
			// right col
			//if(top < bottom)
			for(i = top;i<=bottom;i++)
				System.out.println(a[i][right]);
			
			right--;
			
			// bottom row
			
			if(top <= bottom) {
			for(i = right;i >= left;i--)
				System.out.println(a[bottom][i]);
			bottom--;
			}
			
			// left row
			if(left <= right) {
						for(i = bottom;i >= top;i--)
							System.out.println(a[i][left]);
			left++;
			}
			
			
			
		}
	}
	public static void main(String[] args) {
		
		L54 l = new L54();
		
		int [][]a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		//int [][]a = {{1,2,3},{4,5,6}};
		l.printSpiral(a);
	}
}
