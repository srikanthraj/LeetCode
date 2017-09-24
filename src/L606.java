
public class L606 {


    public String tree2str(TreeNode t) {
    
        if(t == null)
        	return "";
        
        String res = t.val + "";
        
        String left = tree2str(t.left);
        String right = tree2str(t.right);
        
        if(left == "" && right == "")
        	return res;
        
        else if (left != "" && right != "")
        	return res + "(" + left + ")(" + right + ")";
        
        else if (right != "")
        	return res + "()(" + right + ")";
        
        return res + "(" + left + ")";
        
    }
    
	public static void main(String[] args) {
		
		L606 l = new L606();
		
		TreeNode t = new TreeNode(1);
		t.left = new TreeNode(2);
		t.left.left = new TreeNode(4);
		t.right = new TreeNode(3);
		System.out.println(l.tree2str(t));
	}
	
}
