
public class LCA {

	TreeNode findLCA(TreeNode root, TreeNode node1, TreeNode node2) {
	
		
		if(root == null)
			return null;
		
		if(root == node1 || root == node2)
			return root;
		
		TreeNode left = null;
		TreeNode right = null;
		
		left = findLCA(root.left,node1,node2);
		right = findLCA(root.right,node1,node2);
		
		if(left != null && right != null)
			return root;
		
		else if(left != null)
			return left;
		
		else if(right != null)
			return right;
		
		else 
			return null;
		
	}
	
	
	public static void main(String[] args) {
		
		LCA l = new LCA();
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(5);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(9);
		root.right.left = new TreeNode(6);
		root.right.left.left = new TreeNode(8);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(2);
		
		TreeNode node1 = root.right.right.right;
		TreeNode node2 = root.right.left.left;
		
		System.out.println(l.findLCA(root,node1,node2).val);
	}
}
