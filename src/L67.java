
public class L67 {

	public String addBinary(String a, String b) {
    
		int i = a.length()-1;
		int j = b.length()-1;
		
		int carry =0;
		int sum =0;
		StringBuilder sb = new StringBuilder();
		while(i>=0 || j >=0) {
			
			int num1 = i>=0 ? Character.getNumericValue(a.charAt(i)):0;
			int num2 = j>=0 ? Character.getNumericValue(b.charAt(j)):0;
			sum = num1 + num2 + carry;
			
			if(sum == 2 || sum == 3){
				carry =1;
				sb.append(""+(sum%2));
			}
			
			else{
				carry = 0;
				sb.append(""+sum);
			}
			
			i--;
			j--;
		}
		
		if(carry>0)
			sb.append(""+carry);
		
		return sb.reverse().toString();
	
    }

	
	public static void main(String[] args) {
		
		L67 l = new L67();
		String a = "";
		String b = "";
		
		System.out.println(l.addBinary(a, b));
		
	}
}
