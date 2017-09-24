
public class CCIFactZero {

	int factZeros(int n){
	
		if(n <= 1)
			return 0;
		
		else if(n%5 ==0)
			return factZeros(n-1) + countFive(n);
		
		else
			return factZeros(n-1);
	}
	
	int countFive(int n){
		
		if(n ==0 || n%5 != 0)
			return 0;
		
		return countFive(n/5) +1;
	}
	public static void main(String[] args) {
		
		CCIFactZero c = new CCIFactZero();
		int n = 1808548329;
		System.out.println(c.factZeros(n));
	}
}
