import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L90 {


	List<List<Integer>> res = new ArrayList<List<Integer>>();
	
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
	        
		 Arrays.sort(nums);
		 findSolUtil(nums,0,new ArrayList<Integer>());
		 
		 return res;
	    }
	 
	 void findSolUtil(int[] a , int pos , ArrayList<Integer> al) {
		 
		 
		 res.add(new ArrayList<Integer>(al));
		 
		 if(pos == a.length) {
			 
			 
			return;
			 
		 }
		 
		 for(int i = pos;i< a.length;i++) {
			 
			 al.add(a[i]);
			 findSolUtil(a,i+1,al);
			 if(al.size() > 0)
					al.remove(al.size()-1);
			 
			 while(i < a.length-1  && a[i] == a[i+1]) i++;
			 
		 }
		 
	 }
	 
	 
	 public static void main(String[] args) {
			
			
			L90 l = new L90();
			int a[] = {1,2,2};
			System.out.println(l.subsetsWithDup(a));
		}
	 
}
