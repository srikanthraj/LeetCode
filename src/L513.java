
public class L513 {

	int result = -1;
	int maxLevel = 0;
public int findHeight(TreeNode root) {
		
		if(root == null)
			return 0;
		
		return (Math.max(findHeight(root.left), findHeight(root.right)) + 1); // 1 for the root
		
	}

	void FBLVUtil(TreeNode root, int level,int h) {
	
		if(root == null)
			return;
		
		if(level == h && level > maxLevel) {
			result = root.val;
			maxLevel = level;
			return;
		}
		
		FBLVUtil(root.left,level+1,h);
		FBLVUtil(root.right,level+1,h);
		
	}
	public int findBottomLeftValue(TreeNode root) {
		
		int h = findHeight(root);
		
		FBLVUtil(root,1,h);
		
		return result;
	}
	
public static void main(String[] args) {
		
		L513 l = new L513();
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(6);
		root.right.left.left = new TreeNode(7);
		
		System.out.println(l.findBottomLeftValue(root));
}
}
