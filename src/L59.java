
public class L59 {

public int[][] generateMatrix(int x) {

	
	int [][]a = new int[x][x];
	int top = 0;
	int right = x-1;
	int bottom = x-1;
	int left = 0;
	
	int i ;
	int count = 1;
	
	while(left <= right && top <= bottom) {
		
		// top row
		//
		for(i = left;i<=right;i++)
			a[top][i] = count++;
		
		top++;
		
		// right col
		//if(top < bottom)
		for(i = top;i<=bottom;i++)
			a[i][right] = count++;
		
		right--;
		
		// bottom row
		
		if(top <= bottom) {
		for(i = right;i >= left;i--)
			a[bottom][i] = count++;
		bottom--;
		}
		
		// left row
		if(left <= right) {
					for(i = bottom;i >= top;i--)
						a[i][left] = count++;
		left++;
		}
		
	}
	
	return a;
}

void printMatrix(int [][]a) {
	
	for(int i =0;i<a.length;i++) {
		for(int j = 0;j<a[0].length;j++) {
			System.out.print(a[i][j] +"\t");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		L59 l = new L59();
		
		l.printMatrix(l.generateMatrix(4));
	}
}
