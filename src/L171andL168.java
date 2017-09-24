
public class L171andL168 {

	public int titleToNumber(String s) {
        int num =0;
        int len = s.length();
        for(int i = len-1;i>=0;i--)
        num += (s.charAt(i) - 64) * Math.pow(26,(len-1-i));
        
        return num;
     }
	
	 public String convertToTitle(int n) {
	  
		 StringBuilder sb = new StringBuilder();
		 
		 while(n>0) {
			 
			 n--;
			 int num;
			 
			 num = (n%26) + 65;
			 sb.insert(0,(char)num);
			 n = n/26;
		 }
		 
		 return sb.toString();
	  }
	 
	
	public static void main(String[] args) {
		
		L171andL168 l = new L171andL168();
		System.out.println(l.titleToNumber("AA"));
		System.out.println(l.convertToTitle(52));
	}
}
