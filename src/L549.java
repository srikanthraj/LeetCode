
public class L549 {

	
public int longestConsecutive(TreeNode root) {

	return findSol(root,root.val,0,0);
}

int findSol(TreeNode root, int target, int cl) {
	
	if(root == null)
		return cl;
	
	if(root.val == target)
		cl++;
	
	return Math.max(findSol(root.left,root.val+1,cl), findSol(root.left,root.val-1,cl)) + Math.max(findSol(root.right,root.val+1,cl), findSol(root.right,root.val-1,cl)) -1;
}

public static void main(String[] args) {
	
	L549 l = new L549();
	
	TreeNode root = new TreeNode(2);
	root.right = new TreeNode(3);
	//root.right.left = new TreeNode(2);
	root.left = new TreeNode(1);
	//root.right.right = new TreeNode(4);
	//root.right.right.left = new TreeNode(2);
	//root.right.right.right = new TreeNode(5);
	//root.right.right.right.left = new TreeNode(6);
	
	System.out.println(l.longestConsecutive(root));
}

}
