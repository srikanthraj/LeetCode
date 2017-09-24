import java.util.Stack;

public class L394 {

	 public String decodeString(String s) {
	        Stack<Integer> count = new Stack<>();
	        Stack<String> result = new Stack<>();
	        int i = 0;
	        result.push("");
	        while (i < s.length()) {
	            char ch = s.charAt(i);
	            if (ch >= '0' && ch <= '9') {
	                int start = i;
	                while (s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') i++;
	                count.push(Integer.parseInt(s.substring(start, i + 1)));
	            } else if (ch == '[') {
	                result.push("");
	            } else if (ch == ']') {
	                String str = result.pop();
	                StringBuilder sb = new StringBuilder();
	                int times = count.pop();
	                for (int j = 0; j < times; j += 1) {
	                    sb.append(str);
	                }
	                result.push(result.pop() + sb.toString());
	            } else {
	                result.push(result.pop() + ch);
	            }
	            i += 1;
	        }
	        return result.pop();
	    }
	
	 int ind =0;
	 public String dS(String s) {
	        if (s == null || s.length() == 0) return "";
	        int count = 0;
	        StringBuilder sb = new StringBuilder();
	        for (; ind < s.length(); ind++) {
	            char c = s.charAt(ind);
	            if (Character.isDigit(c)) {
	                count = count*10+c-'0';
	            } else if (c=='[') {
	                ind++;
	                String sub = dS(s);
	                for (int i=0; i<count; i++) {
	                    sb.append(sub);
	                }
	                count = 0;
	            } else if (c==']') {
	                return sb.toString();
	            } else {
	                sb.append(c);
	            }
	        }
	        return sb.toString();
	    }
	public static void main(String[] args) {
		
		L394 l = new L394();
		System.out.println(l.dS("3[a2[c]]"));
	}
}
