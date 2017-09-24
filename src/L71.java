import java.util.Stack;

public class L71 {

	 public String simplifyPath(String s) {
	        
		 
		 String res = "";
		 Stack<String> st = new Stack<String>();
		 
		 
		 for(String str: s.split("/")) {
			
			 //System.out.println("str is "+ str);
			 
			 if(str.equals("..") && !st.isEmpty())
				 st.pop();
			 
			 else if (!(str.equals(".") || str.equals("") || str.equals("..")))
				st.push(str);
		 }
		 
		 
		
		 while(!st.isEmpty()){
			 System.out.println("Stack" + st.pop());
			 //res = "/"+st.pop() +res;
		 }

		 return res.isEmpty() ? "/" :res;
		 
		
	}
	 
	public static void main(String[] args) {
		
		L71 l = new L71();
		//String s = "/a/./b/../../c/";
		String s = "/..";
		System.out.println(l.simplifyPath(s));
		
		
	}
}
