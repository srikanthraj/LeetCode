
public class L91 {

	int count =0;
	
	int numDecodings(String s) {
		
		if(s == null || s.length() == 0 || s.charAt(0) == '0')
            return count;
        util(s,s.length(),new StringBuilder(""),0);
        return count;
		
	}

	
	boolean isGood(String s) {
		
		
		String[] sub = s.split(" ");
		
		for(int i = 0;i<sub.length;i++) {
			
			if(sub[i].charAt(0) == '0' || Integer.parseInt(sub[i]) <= 0 || Integer.parseInt(sub[i]) > 26)
				return false;
				
		}
		
		return true;
	}
	void util(String s, int len , StringBuilder sb, int pos) {
		
		if(pos == len) {
			
		
			if(isGood(sb.toString())){
				System.out.println("Good Are " + sb.toString());
				count++;
			}
			return;
		}
		
		len = sb.length();
		
		for(int i = pos+1;i<=s.length();i++) {
			
			sb.append(s.substring(pos,i));
			if(i < s.length())
				sb.append(" ");
			util(s,s.length(),sb,i);
			
			sb.setLength(len);
			
		}
	}

	public static void main(String[] args) {
		
		L91 l = new L91();
		
		String s = "101";
		System.out.println(l.numDecodings(s));
		
		//System.out.println("Hi");
	}
}
