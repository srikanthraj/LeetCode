import java.util.HashSet;

public class L202 {

	/*
	boolean isHappy(int n, HashSet<Integer> hs) {
		
		if(n ==1)
			return true;
		
		if(hs.contains(n)){
			System.out.println(n);
			return false;
		}
		hs.add(n);
		int s = sumSquares(n); 
		
		return isHappy(s,hs);
	}
	*/
	
	public boolean isHappy(int n) {
        int x = n;
        int y = n;
        while(x>1){
            x = sumSquares(x) ;
            if(x==1) return true ;
            y = sumSquares(sumSquares(y));
            if(y==1) return true ;

            if(x==y) return false;
        }
        return true ;
    }
	
	int sumSquares(int n) {
		
		if (n == 0) 
		return 0;
		
		return ((int)Math.pow(n%10, 2) + sumSquares(n/10));
		
	}
	
	public static void main(String[] args) {
		
		L202 l = new L202();
		HashSet<Integer> hs = new HashSet<Integer>();
		//System.out.println(l.isHappy(2,hs));
		System.out.println(l.isHappy(2));
	}
}
