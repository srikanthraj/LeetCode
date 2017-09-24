
public class CCIPathSum {

	int pathSum(TreeNode root, int sum) {
		
		if(root == null)
			return 0;
		
		return pathSumUtil(root,sum) + pathSum(root.left,sum) + pathSum(root.right,sum);
	}
	
	int pathSumUtil(TreeNode root, int sum) {
		
		if(root == null)
			return 0;
		
		return (root.val == sum) ?1:0 + pathSumUtil(root.left,sum-root.val) + pathSumUtil(root.right,sum-root.val); 
	}
	
	public static void main(String[] args) {
		
	}
}
