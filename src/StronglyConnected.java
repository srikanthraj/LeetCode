import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class StronglyConnected {

	Stack<Integer> s= new Stack<Integer>();
	HashSet<Integer> visited = new HashSet<Integer>();
	
	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	
	ArrayList<ArrayList<Integer>> findSol(LinkedHashMap<Integer,ArrayList<Integer>> hm) {
		
		for(Map.Entry<Integer,ArrayList<Integer>> e:hm.entrySet()){
			
			if(!visited.contains(e.getKey()))
			dfsUtil(hm,e.getKey(),e.getValue());
		}
		
		
		//Reverse LinkedHashMap
		LinkedHashMap<Integer,ArrayList<Integer>> revhm = new LinkedHashMap<Integer,ArrayList<Integer>>();
		
		for(Map.Entry<Integer,ArrayList<Integer>> e:hm.entrySet()){
			
			for(int num:e.getValue()) {
				
				if(revhm.containsKey(num))
					revhm.get(num).add(e.getKey());
				
				else
				{
					ArrayList<Integer> al = new ArrayList<Integer>();
					al.add(e.getKey());
					revhm.put(num, al);
				}
			}
		}
		
		
		visited.clear();
		
		
		while(!s.isEmpty()) {
			
			int num = s.pop();
			
			if(!visited.contains(num)) {
				
				ArrayList<Integer> al = dfsUtilReverse(revhm,num,revhm.get(num),new ArrayList<Integer>());
				res.add(new ArrayList<Integer>(al));
			}
			
			
		}
		
		
		return res;
	}
	
	ArrayList<Integer> dfsUtilReverse(LinkedHashMap<Integer,ArrayList<Integer>> revhm, int node, ArrayList<Integer> neigh, ArrayList<Integer> al) {
		
		if(visited.contains(node)) {
			return al;
		}
		
		visited.add(node);
		al.add(node);
		//System.out.println(al);
		
		for(int num:neigh) {
			
			if(!visited.contains(num))
				dfsUtilReverse(revhm,num,revhm.get(num),al);
		}
		
		return al;
	}
	
	void dfsUtil(LinkedHashMap<Integer,ArrayList<Integer>> hm, int node, ArrayList<Integer> neigh) {
		
			if(visited.contains(node))
				return;
			
			visited.add(node);
			
			for(int num:neigh) {
				
				if(!visited.contains(num))
					dfsUtil(hm,num,hm.get(num));
			}
		
			s.push(node);
	}
	public static void main(String[] args) {
		
		StronglyConnected s = new StronglyConnected();
		
		LinkedHashMap<Integer,ArrayList<Integer>> hm = new LinkedHashMap<Integer,ArrayList<Integer>>();
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(3);
		al1.add(4);
		hm.put(2, al1);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		hm.put(1, al);
		
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		hm.put(3, al2);
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(5);
		hm.put(4, al3);
		
		ArrayList<Integer> al4 = new ArrayList<Integer>();
		al4.add(6);
		hm.put(5, al4);
		
		ArrayList<Integer> al5 = new ArrayList<Integer>();
		al5.add(4);
		hm.put(6, al5);
		
		ArrayList<Integer> al8 = new ArrayList<Integer>();
		al8.add(10);
		hm.put(9, al8);
		
		ArrayList<Integer> al6 = new ArrayList<Integer>();
		al6.add(6);
		al6.add(8);
		hm.put(7, al6);
		
		ArrayList<Integer> al7 = new ArrayList<Integer>();
		al7.add(9);
		hm.put(8, al7);
		
		
		ArrayList<Integer> al9 = new ArrayList<Integer>();
		al9.add(7);
		al9.add(11);
		hm.put(10, al9);
		
		ArrayList<Integer> al10 = new ArrayList<Integer>();
		hm.put(11, al10);
		
		
		System.out.println(s.findSol(hm));
	}
}
