import java.util.ArrayList;
import java.util.List;

public class L22 {

	List<String> res = new ArrayList<String>();
	
	
	public void generateParenthesisUtil(String str,int open,int close,int n) {
	
		if(open == n && close == n) {
			res.add(str);
			return;
		}
		
		if(open < n)
			generateParenthesisUtil(str+"(",open+1,close,n);
		
		if(open > close)
			generateParenthesisUtil(str+")",open,close+1,n);
	}
	
	
	public List<String> generateParenthesis(int n) {
        
		generateParenthesisUtil("",0,0,n);
		
		return res;
    }
	
	public static void main(String[] args) {
		
		L22 l = new L22();
		
		System.out.println(l.generateParenthesis(10));
		
		
	}
}
