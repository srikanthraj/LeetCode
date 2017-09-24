
public class L389 {

	public static void main(String[] args) {
		
		String s = "abcd";
		String t = "abcde";
		int tSum = 0;
        int sSum = 0;
        int i =0;
        
        for(i =0;i<t.length();i++)
            tSum += (t.charAt(i) - 97);
        
        for(i =0;i<s.length();i++)
           sSum += (s.charAt(i) - 97);
       
        System.out.println(tSum);
        System.out.println(sSum);
        int diff = (tSum-sSum) + 97;
        
       System.out.println(Character.toString((char)diff));  
	}
}
