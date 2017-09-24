
public class L129 {

	 //int sum =0;
	public int sumNumbers(TreeNode root) {

		return sumUtil(root,0,0);

	}

	int sumUtil(TreeNode root, int num,int sum) {

		if(root == null)
			return 0;

		num = num*10 + root.val;
		if(root.left == null && root.right == null)
		{
			sum += num;
			return sum;
		}
		return sumUtil(root.left,num,sum) + sumUtil(root.right,num,sum);


	}
	    
	public static void main(String[] args) {
		
		L129 l = new L129();
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		System.out.println(l.sumNumbers(root));
	}
}
