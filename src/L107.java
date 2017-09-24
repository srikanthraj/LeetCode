import java.util.ArrayList;
import java.util.List;


public class L107 {

	List<List<Integer>> res = new ArrayList<List<Integer>>();
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
		int h = findHeight(root);
		reverseLevelTraversal(root,h);
		return res;
    }

 public int findHeight(TreeNode root) {
		
		if(root == null)
			return 0;
		
		return (Math.max(findHeight(root.left), findHeight(root.right)) + 1); // 1 for the root
		
	}
 void printLevel(TreeNode root, int level, ArrayList<Integer> al) {
		
		if(root == null)
			return;
		if(level == 1)
			al.add(root.val);
		
		printLevel(root.left , level -1, al);
		printLevel(root.right , level -1, al);
	
	}
 void reverseLevelTraversal(TreeNode root , int h) {
		
		for(int i= h;i>=1;i--){
			ArrayList<Integer> al = new ArrayList<Integer>();
			res.add(al);
			printLevel(root,i,al);
		}
	}
	public static void main(String[] args) {
		
		L107 l = new L107();
		
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(8);
		root.right = new TreeNode(22);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(12);
		root.left.right.left = new TreeNode(10);
		root.left.right.right = new TreeNode(14);
		root.right.right = new TreeNode(25);
		
		
		System.out.println(l.levelOrderBottom(root));
	}
}
