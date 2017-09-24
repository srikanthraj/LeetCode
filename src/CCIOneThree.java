import java.util.Arrays;

public class CCIOneThree {

	static char[] findSol(String s , int len) {
		
		char[] a = s.toCharArray();
		int spCount = 0;
		for(int i =0;i<len;i++) {
			
			int index = (spCount *3)+ (i -spCount);
			if(s.charAt(i) != ' ') 
				a[index] = s.charAt(i);
			
			else {
				a[index] = '%';
				a[index+1] = '2';
				a[index+2] = '0';
				spCount++;
			}
		}
		
		
		return a;
	}
	public static void main(String[] args) {
		
		String str = "Mr John Smith    ";
		int len = 13;
		System.out.println(Arrays.toString(findSol(str,len)));
	}
}
