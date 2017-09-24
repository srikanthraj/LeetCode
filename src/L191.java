import java.util.ArrayList;
import java.util.List;

public class L191 {

public int hammingWeight(long n) {
        
        int res = 0;
        if(n == 0)
        return res;
        if(n >= Integer.MAX_VALUE)
        	return 32;
        
        res = 0;
        while(n != 0) {
            n &= n-1;
        	res++;
            
        }
        
        return res;
    }

public Integer[] findSol() {
	
	
	List<Integer> al = new ArrayList<Integer>();
	
	al.add(1);
	al.add(5);
	al.add(2);
	al.add(3);
	al.add(7);
	 
	return al.toArray(new Integer[al.size()]);
}

	public static void main(String[] args) {

		L191 l = new L191();
		System.out.println(l.hammingWeight(7));
		
		Integer[] res = l.findSol();
		for(int num:res)
			System.out.println(num);
	}
}
