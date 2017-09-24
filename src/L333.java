
public class L333 {

public int largestBSTSubtree(TreeNode root) {
        
	if(root == null)
		return 0;
	
	if(root.left == null && root.right == null)
		
		return 1;
	
	
	int left = 0;
	int right = 0;
	
	left = largestBSTSubtree(root.left);
	right = largestBSTSubtree(root.right);
	
	if(isBST(root,Long.MIN_VALUE,Long.MAX_VALUE))
		return left + right +1;
	
	return Math.max(left, right);
	
  }

boolean isBST(TreeNode root, long min, long max) {
    
    if(root == null)
    return true;
    
    
    return ( (root.val > min && root.val < max) && isBST(root.left, min, root.val) && isBST(root.right, root.val , max));
}

	public static void main(String[] args) {
		
		L333 l = new L333();
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(7);	
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(15);
		root.right.right = new TreeNode(17);
		
		System.out.println(l.largestBSTSubtree(root));
	}
}
