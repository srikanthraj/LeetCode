
public class CCIInOrderSucc {


	TreeNode inSucc(TreeNode root, TreeNode node) {
		
	}
	public static void main(String[] args) {
		
		CCIInOrderSucc c= new CCIInOrderSucc();
		
		TreeNode root = new TreeNode(22);
		root.left = new TreeNode(14);
		root.right = new TreeNode(25);
		root.left.left = new TreeNode(12);
		root.left.right = new TreeNode(18);
		root.left.right.left = new TreeNode(16);
		root.right.left = new TreeNode(24);
		root.right.right = new TreeNode(27);
		
		TreeNode res = c.inSucc(root,root.right.right);
		if(res == null)
			System.out.println("No Successor");
		
			
	}
}
