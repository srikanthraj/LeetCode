
public class L250 {

	
public int countUnivalSubtrees(TreeNode root) {
        
	int[] count = new int[1];
	
	countUtil(root,count);
	return count[0]; 
	
}

boolean countUtil(TreeNode root, int[] count) {
	
	if(root == null)
		return true;
	
	boolean left = countUtil(root.left,count);
	boolean right = countUtil(root.right,count);
	
	if(left && right) {
		
		if(root.left != null && root.left.val != root.val)
			return false;
		
		if(root.right != null && root.right.val != root.val)
			return false;
		
		count[0]++;
		return true;
	}
	
	return false;
}

	public static void main(String[] args) {
		
		
		L250 l = new L250();
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(4);	
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(5);
		root.right.right = new TreeNode(5);
		
		
		System.out.println(l.countUnivalSubtrees(root));
		
	}
}
