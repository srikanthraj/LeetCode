
public class L43 {

	public String multiply(String num1, String num2) {
	    
		if(num1.equals("0") || num2.equals("0"))
			return "0";
	    int[] d = new int[num1.length()+num2.length()];
	    StringBuilder sb = new StringBuilder();
	    int sum = 0;
	    int carry = 0;
	    int max = 0;
	   
	    //multiply each digit and sum at the corresponding positions
	    for(int i=0; i<num1.length(); i++){
	        for(int j=0; j<num2.length(); j++){
	            d[i+j] += Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j));
	            max = Math.max(max, (i+j));
	        }
	    }
	 
	    //calculate each digit
	    for(int i= max; i>=0; i--){
	        sum = d[i] + carry;
	        carry = sum/10;
	        sb.append(sum%10);
	    }
	 
	    if(carry >0)
	    	sb.append(carry);
	    
	 
	    return sb.reverse().toString();
	    }
	
	public static void main(String[] args) {
		L43 l = new L43();
		System.out.println(l.multiply("9", "9"));
	}
}
