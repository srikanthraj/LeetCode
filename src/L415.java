
public class L415 {

public String addStrings(String num1, String num2) {
     
	int carry = 0;
	StringBuilder res = new StringBuilder();
	
	int i = num1.length()-1;
	int j = num2.length()-1;
	int sum;
	while(i>=0 && j >=0) {
		
		sum = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(j)) + carry;
		res.append(sum%10);
		carry = sum/10;
		i--;
		j--;
	}
	
	while(i >= 0)
	{
		sum = Character.getNumericValue(num1.charAt(i)) + carry;
		
		res.append(sum%10);
		carry = sum/10;
		i--;
	}
	
	while(j >= 0)
	{
		sum = Character.getNumericValue(num2.charAt(j)) + carry;
		
		res.append(sum%10);
		carry = sum/10;
		j--;
	}
	
	if(carry == 1)
		res.append("1");
	
	return res.reverse().toString();
	
    }

	public static void main(String[] args) {
		
		L415 l = new L415();
		
		String s1= "999";
		String s2 = "1";
		
		System.out.println(l.addStrings(s1, s2));
	}
}
