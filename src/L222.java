
public class L222 {
    
    int findHeight(TreeNode root) {
        
        if(root == null)
        return 0;
        
        return 1+ findHeight(root.left);
    }
    public int countNodes(TreeNode root) {
        
    	if(root == null)
    		return 0;
    	
    	int lh = findHeight(root.left);
    	int rh = findHeight(root.right);
    
    	if(lh == rh)
    		return (1<<lh) + countNodes(root.right);
    	
    	else
    		
    		return (1<<rh) + countNodes(root.left);
    }
    
    
	public static void main(String[] args) {
		
		L222 l = new L222();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		System.out.println(l.countNodes(root));
	}
}
