
public class RemoveKthChar {

	String remove(String s, int k) {
		
		if(s== null || s.length() == 0 || k<=1)
			return "";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<s.length();i++) {
			
			if((i+1)%k != 0)
				sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
	
		RemoveKthChar r = new RemoveKthChar();
		String str = "srikanthraj";
		int k =1;
		System.out.println(r.remove(str,k));
	}
	
}
