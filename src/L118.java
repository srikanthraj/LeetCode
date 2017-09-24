import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L118 {

	List<List<Integer>> result = new ArrayList<List<Integer>>();
	
	public List<Integer> getRow(int row) {
		 
		 List<Integer> res = new ArrayList<Integer>();
		 if(row == 0)
		 {
			 //System.out.println(1);
			 res.add(1);
			 return res;
		 }
		 int num[] = new int[row+1];
		 int temp[] = new int[row+1];
		 num[0] = 1;
		// res.add(0,1);
		 
		 for(int i =1;i<=row;i++) {
			 
			 for(int j =0;j<=i;j++)
			 {
				 //res.add(j,res.get(j)+res.get(j-1));
				 if(j == 0 || j == i)
					 temp[j] = 1;
				 
				 else
					 temp[j] = num[j] + num[j-1];
				 
			 }
			 
		num = Arrays.copyOf(temp, temp.length);
	
		 }
		
		 for(int i =0;i<= row;i++) {
		 
			 res.add(num[i]);
		 }
		 return res;
		 
	 }
	
	public List<List<Integer>> generate(int numRows) {
		
		for(int i =0;i<numRows;i++) {
			
			result.add(getRow(i));
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
	
		L118 l = new L118();
		System.out.println(l.generate(5));
		
	}
}
