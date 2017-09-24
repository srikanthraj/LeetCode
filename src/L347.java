import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class L347 {

public List<Integer> topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int num:nums)
            hm.put(num,hm.getOrDefault(num,0)+1);
            
        TreeMap<Integer,ArrayList<Integer>> tm = new TreeMap<Integer,ArrayList<Integer>>();
        
        for(int num: hm.keySet()){
            
            int freq = hm.get(num);
            
            if(!tm.containsKey(freq)) { // not present in TM
                
                tm.put(freq,new ArrayList<Integer>());
            }
            
            tm.get(freq).add(num);
        }
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        while(res.size() < k)
        {
           Map.Entry<Integer,ArrayList<Integer>> e = tm.pollLastEntry();
           res.addAll(e.getValue());
           
        }
        return res;
    }

	public static void main(String[] args) {
		
		L347 l = new L347();
		
		int[] nums = {1,1,1,2,2,2,3};
		int k =3;
		System.out.println(l.topKFrequent(nums, k));
	}
}
