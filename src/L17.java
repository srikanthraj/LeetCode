import java.util.ArrayList;
import java.util.HashMap;

public class L17 {

	ArrayList<String> res = new ArrayList<String>();
	HashMap<Character,String> hm = new HashMap<Character,String>();
	void fun(String digits, int pos, String string) {
		
		
		if(pos == digits.length()) {
			res.add(string);
			
			return;
		}
		
		String str = hm.get(digits.charAt(pos));
		
		for(int i =0;i<str.length();i++) {
			
			fun(digits,pos+1,string+str.charAt(i));
		}
		
	}
	
	
	public static void main(String[] args) {

		L17 l = new L17();
		
		
		l.hm.put('2', "abc");
		l.hm.put('3', "def");
		l.hm.put('4', "ghi");
		
		String digits = "23";
		l.fun(digits, 0,"");
		System.out.println(l.res);
	}
}
