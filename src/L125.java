
public class L125 {

	
	public boolean isPalindrome(String s) {
        
		int head = 0;
		int tail = s.length()-1;
		
		while(head <= tail) {
			
			if(!Character.isLetterOrDigit(Character.toLowerCase(s.charAt(head)))) {
				head++;
				continue;
			}
			
			if(!Character.isLetterOrDigit(Character.toLowerCase(s.charAt(tail)))) {
				tail--;
				continue;
			}
				
				if(Character.toLowerCase(s.charAt(head)) != Character.toLowerCase(s.charAt(tail)))
					return false;
			else { 

			head++;
			tail--;
			}
			
		}
		
		return true;
    }

	public static void main(String[] args) {
		
		L125 l = new L125();
		
		//String s = "A man, a plan, a canal: Panama";
		String s = "race a car";
		System.out.println(l.isPalindrome(s));
	}
}
