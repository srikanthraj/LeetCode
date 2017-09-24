
public class CCIOneOne {

	static boolean isUniqueOne(String str) {
		
		for(int i = 1;i<str.length();i++) {
			for(int j =0;j<i;j++) {
				
				if(str.charAt(i) == str.charAt(j))
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		String str = "srkikanth";
		
		System.out.println(isUniqueOne(str));
	}
}
