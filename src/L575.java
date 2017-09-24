import java.util.HashSet;

public class L575 {

	
	int distributeCandies(int candies[]) {
	
		HashSet<Integer> s = new HashSet<Integer>();
		
		
		for(int i =0; i < candies.length;i++) {
			
			
			if(!s.contains(candies[i]) && s.size() < candies.length/2)
				s.add(candies[i]);
			
			if(s.size() == candies.length/2)
				break;
			
		}
		
		return s.size();
	}
	
	public static void main(String[] args) {
		
		L575 l = new L575();
		
		//int [] candies = {1,1,2,2,3,3};
		
		int [] candies = {1,1,2,3};
		System.out.println(l.distributeCandies(candies));
	}
}
