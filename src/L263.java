import java.util.HashSet;

public class L263 {

	public boolean isUgly(int n){
		
		if(n==1)
			return true;
		if(n==0)
			return false;
		
		while(n%2 == 0)n=n/2;
		while(n%3 == 0)n=n/3;
		while(n%5 == 0)n=n/5;
		
		return n==1;
	}
	
	
	
	
	public static void main(String[] args) {
		L263 l = new L263();
		System.out.println(l.isUgly(5));
	}
}
