import java.util.List;
import java.util.ArrayList;

public class L77 {

	List<List<Integer>> res = new ArrayList<List<Integer>>();
	
public List<List<Integer>> combine(int n, int k) {
       
	
	findSolUtil(n,k,new ArrayList<Integer>(), 0,0);
	
	return res;
    }

void findSolUtil(int n , int k , ArrayList<Integer> al, int steps, int index) {
	
	if(steps == k) {
		res.add(new ArrayList<Integer>(al));
		return;
	}
	
	for(int i = index;i<n;i++){
		
		al.add(i+1);
		findSolUtil(n,k,al,steps+1,i+1);
		if(al.size() > 0)
			al.remove(al.size()-1);
	}
}
	
	public static void main(String[] args) {
		
		
		L77 l = new L77();
		System.out.println(l.combine(4, 5));
	}
}
