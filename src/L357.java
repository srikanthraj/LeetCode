
public class L357 {

    public int countNumbersWithUniqueDigits(int n) {
        
    	return countUtil(n,0);
    	
        
        
        //f(5) n  =5
        // 10
        // 9 * 9
        // 9 * 9 * 8
        // 9* 9 * 8 * 7
        // 9 * 9 * 8 * 7 * 6
    }
    
    int countUtil(int n , int sum) {
    	
    	if(n == 1) {
            sum += 10;
            return sum;
    	}
        
        if(n > 10)
        return 0;

        if(n == 0)
        	return 1;
        
        
        int count = 9;
        int num = 9;
        for(int i = 2; i<= n ;i++){
            count = count * num;
            num--;
        }
        
        sum += countUtil(n-1,count);
        
        return sum;
    }
    
	public static void main(String[] args) {
	
			L357 l = new L357();
			System.out.println(l.countNumbersWithUniqueDigits(3));
		
	}
}
