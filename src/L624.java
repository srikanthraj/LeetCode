import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class L624 {

public int maxDistance(List<List<Integer>> arrays) {
        
	HashSet<Integer> hs = new HashSet<Integer>();
	
	HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	

        int max = arrays.get(0).get(arrays.get(0).size()-1);
        int min = arrays.get(0).get(0);
        int res = Integer.MIN_VALUE;
        
        for(int i =1;i<arrays.size();i++) {
        	
        	res = Math.max(res, Math.abs(arrays.get(i).get(arrays.get(i).size()-1) - min));
        	res = Math.max(res, Math.abs(max - arrays.get(i).get(0)));
        	
        	max = Math.max(max, arrays.get(i).get(arrays.get(i).size()-1));
        	min = Math.min(min , arrays.get(i).get(0));
        }
        
        return res;
}
	
	public static void main(String[] args) {
		
		L624 l = new L624();
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		//al1.add(3);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		//al2.add(5);
		//al2.add(6);
		
		/*
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(7);
		al3.add(8);
		*/
		res.add(al1);
		res.add(al2);
		//res.add(al3);
		System.out.println(l.maxDistance(res));
		
	}
}
