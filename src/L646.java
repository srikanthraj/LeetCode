import java.util.Arrays;
import java.util.Comparator;

public class L646 {

	public static void main(String[] args) {
		
		int[][] mat = {{1,2},{3,6},{3,4}};
		Arrays.sort(mat,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				
				if(o1[0] == o2[0])
					return o1[1] - o2[1];
				
				return o1[0] - o2[0];
			}
			
		});
		
		for(int i =0;i<mat.length;i++)
		{
			System.out.println(Arrays.toString(mat[i]));
		}
	}
}
