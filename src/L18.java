import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L18 {

	
	
public List<List<Integer>> fourSum(int[] a, int target) {
        
	List<List<Integer>> res =  new ArrayList<List<Integer>>();
	for(int i =0;i<a.length-3;i++) {
		for(int j =0;j<a.length-2;j++) {
		int l = a.length-1;
		int k = a.length-2;
		
		while(k<l) {
			
			int sum = a[i] + a[j] + a[k] + a[l];
			if(sum == target)
			{
				ArrayList<Integer> al = new ArrayList<Integer>();
				al.add(a[i]);
				al.add(a[j]);
				al.add(a[k]);
				al.add(a[l]);
				res.add(al);
				k++;
				l--;
			}
			
			else if(sum > target)
				l--;
			else
				k++;
		}
		
		
		}	
	}	
	
	return res;
    }
	
		public static void main(String[] args) {
			L18 l = new L18();
			int a[]= {1,0,-1,0,-2,2};
			Arrays.sort(a);
			
			
		
			System.out.println(l.fourSum(a, 0));
		}
	}

