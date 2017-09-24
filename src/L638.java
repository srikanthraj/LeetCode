import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L638 {

	int findPrice(List<Integer> price,List<Integer> needs) {
		
		int sum =0;
		
		for(int i=0;i<price.size();i++) 
			sum += price.get(i) * needs.get(i);
		
		return sum;
	}
	
	boolean satisfies(List<Integer> qty, List<Integer> needs) {
		
		for(int i =0;i<qty.size()-1;i++){
			
			if(qty.get(i) > needs.get(i))
				return false;
		}
		
		return true;
	}
	
	List<Integer> reduce(List<Integer> qty, List<Integer> needs) {
		
		List<Integer> al = new ArrayList<Integer>();
		
		for(int i =0;i<qty.size()-1;i++){

			al.add(needs.get(i)- qty.get(i));
		}
		return al;
	}
	
	HashMap<List<Integer>, Integer> hm = new HashMap<List<Integer>, Integer>();
	
	public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {

		
		if(hm.containsKey(needs))
			return hm.get(needs);
		
		int res = findPrice(price,needs);
			
		/*
		List<Integer> temp = new ArrayList<Integer>();
		for(int i =0;i<needs.size();i++)
			temp.set(i, needs.get(i));
		*/
		
		for(int i =0;i<special.size();i++) {
			
			if(satisfies(special.get(i),needs)){
				
				List<Integer> al = special.get(i);
				List<Integer> temp = reduce(al,needs);
				
				res = Math.min(res, special.get(i).get(al.size()-1) + shoppingOffers(price,special,temp));
			}
		}
	
		hm.put(needs, res);
		return res;
    }

	public static void main(String[] args) {
		
		L638 l = new L638();
		
		List<Integer> price = new ArrayList<Integer>();
		
		price.add(2);
		price.add(3);
		price.add(4);
		
		List<List<Integer>> special = new ArrayList<List<Integer>>();
		
		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(1);
		al1.add(0);
		al1.add(4);
		
		List<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		al2.add(1);
		al2.add(1);
		al2.add(5);
		
		List<Integer> al3 = new ArrayList<Integer>();
		al3.add(2);
		al3.add(2);
		al3.add(1);
		al3.add(9);
		
		special.add(al1);
		special.add(al2);
		special.add(al3);
		
		List<Integer> needs = new ArrayList<Integer>();
		
		needs.add(1);
		needs.add(2);
		needs.add(1);
		
		System.out.println(l.shoppingOffers(price, special, needs));
	}
}
