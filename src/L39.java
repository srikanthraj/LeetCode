import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L39 {

	List<List<Integer>> res = new ArrayList<List<Integer>>();
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
		Arrays.sort(candidates);
		
		combinationUtil(candidates,0,0,target, new ArrayList<Integer>());
		
        return res;
        
    }
	
	
	void combinationUtil(int[] a,int pos,int currSum,int target, ArrayList<Integer> al)
	{
		if(currSum==target) 
		{
			res.add(new ArrayList<Integer>(al));
			return;
		}
		
		if(currSum > target)
			return;
		
		for(int i = pos;i<a.length;i++) {
			al.add(a[i]);
			combinationUtil(a, i, currSum+ a[i], target, al);
			if(al.size() > 0)
				al.remove(al.size()-1);
			
		}
		
		
	}
	
public static void main(String[] args) {
		
		
		L39 l = new L39();
		int a[] = {2,3,1,6,7};
		int target = 7;
		System.out.println(l.combinationSum(a, target));
	}
	
}
