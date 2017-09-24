import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Sol {
	
	int fi;
	int si;
	
	Sol(int fi,int si){
		this.fi = fi;
		this.si = si;
	}
}

public class L599 {

	
	public String[] findRestaurant(String[] list1, String[] list2) {
        
		
		ArrayList<String> res = new ArrayList<String>();
		
	
		
		Map<String,Sol> hm = new HashMap<String,Sol>();
		
		int minSumIndex = Integer.MAX_VALUE;
		
		for(int i =0;i<list1.length;i++)
			
			hm.put(list1[i], new Sol(i,-1));
		
		
		for(int i =0;i<list2.length;i++) {
			
			if(hm.containsKey(list2[i])) { // Common found
				
				Sol tempSol = hm.get(list2[i]);
				int tempfi = tempSol.fi;
				tempSol.si = i;
				minSumIndex = Math.min(minSumIndex, (tempfi+i));
				hm.put(list2[i], tempSol);
			}
			
			else {
				hm.put(list2[i], new Sol(-1,i));
			}
		}
		
		
		for(Map.Entry<String, Sol> e : hm.entrySet()) {
			
			Sol tempSol = e.getValue();
			if(tempSol.fi != -1 && tempSol.si != -1 && (tempSol.fi + tempSol.si == minSumIndex))
				res.add(e.getKey());
		}
	
		return res.toArray(new String[res.size()]);
    }

	public static void main(String[] args) {
		
		L599 l = new L599();
		
		String[] list1 = {"rbp","hyzn","KFC"};
		String[] list2 = {"rbp","KFC"};
		
		String res[] = l.findRestaurant(list1, list2);
		
		for(int i =0;i<res.length;i++)
			System.out.println(res[i]);
	}
}
