
public class CCIOneTwo {

	static boolean isPerm(String s1, String s2) {
		
		s1 = s1.trim();
		s2 = s2.trim();
		
		if(s1.length() != s2.length())
			return false;
		
		int [] count = new int[256];
		
		for(int i = 0; i<s1.length();i++)
			count[s1.charAt(i)]++;
		
		
		for(int i = 0; i<s2.length();i++)
			count[s2.charAt(i)]--;
		
		for(int i =0;i<256;i++)
			if(count[i] != 0)
				return false;
		
		return true;
	}
	public static void main(String[] args) {
		
		String s1 = "srik";
		String s2 = "ikrs        ";
		System.out.println(isPerm(s1,s2));
		
		double a = 5.63467;
		int b = 7;
	}
}
