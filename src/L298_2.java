
public class L298_2 {

	int max = 0;
	int longestConsecutive(TreeNode root) {
		
		if(root == null)
			return max;
		findSol(root,root.val,0);
		
		return max;
	}
	
	
	void findSol(TreeNode root, int target, int currLen)
	{
		
		if(root == null)
			return;
		
		if(root.val == target)
		{
			currLen++;
			max = Math.max(max, currLen);
		}
		
		findSol(root.left, root.val+1,currLen);
		findSol(root.right, root.val+1,currLen);
	}
	
	public static void main(String[] args) {
		
		L298_2 l = new L298_2();
		
		TreeNode root = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(2);
		root.right.left.left = new TreeNode(1);
		//root.right.right = new TreeNode(4);
		//root.right.right.left = new TreeNode(2);
		//root.right.right.right = new TreeNode(5);
		//root.right.right.right.left = new TreeNode(6);
		
		System.out.println(l.longestConsecutive(root));
	}
}
