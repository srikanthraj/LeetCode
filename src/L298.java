
public class L298 {

	int max = 0;
	
public int longestConsecutive(TreeNode root) {
  
	if(root == null)
		return 0;
	maxUtil(root,0,root.val);
	
	return max;
  }

void maxUtil(TreeNode root, int count, int target) {
	
	if(root == null)
		return;
	
	if(root.val == target)
		count++;
	
	max = Math.max(max, count);
	
	maxUtil(root.left,count,root.val+1);
	maxUtil(root.right,count,root.val+1);
	
}

	public static void main(String[] args) {
		
		L298 l = new L298();
		
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(2);
		//root.right.left.left = new TreeNode(1);
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(2);
		root.right.right.right = new TreeNode(5);
		root.right.right.right.left = new TreeNode(6);
		
		System.out.println(l.longestConsecutive(root));
		
	}
}
