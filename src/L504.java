
public class L504 {

	 public String convertToBase7(int num) {
	        
	        boolean isNegative = (num < 0) ? true:false;
	        StringBuilder sb = new StringBuilder();
	        num = Math.abs(num);
	        if(num < 7) return "0";
	        
	        while(num >= 7) {
	            sb.append(num %7);
	            num = num/7;
	        }
	        sb.append(num%10);
	        if(isNegative)
	        return "-"+sb.reverse().toString();
	        
	        return sb.reverse().toString();
	    }
	public static void main(String[] args) {
		
		L504 l = new L504();
		
		System.out.println(l.convertToBase7(-7));
	}
}
