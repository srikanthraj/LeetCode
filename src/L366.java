import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class L366 {

	List<List<Integer>> res = new ArrayList<List<Integer>>();
	
	
	public boolean isLeaf(TreeNode root) {
		
		if(root == null)
			return false;
		
		return (root.left == null && root.right == null);
	}
	public TreeNode removeLeaves(TreeNode root, ArrayList<Integer> al) {
		
		if(root == null)
			return null;
		
		
		if(root.left != null) {
			
			if(isLeaf(root.left)) {
				al.add(root.left.val);
				root.left = null;
			}
			
			else 
				removeLeaves(root.left,al);
		}
		
		if(root.right != null) {
			
			if(isLeaf(root.right)) {
				al.add(root.right.val);
				root.right = null;
			}
			
			else 
				removeLeaves(root.right,al);
		}
		
		
		return root;
		
	}
	public void findLeavesUtil(TreeNode root) {
		
		if(root == null)
			return;
		
		
		
		if(isLeaf(root)) {
			ArrayList<Integer> l = new ArrayList<Integer>();
			l.add(root.val);
			res.add(l);
			return;
		}
			
		ArrayList<Integer> al = new ArrayList<Integer>();
		res.add(al);
		
		findLeavesUtil(removeLeaves(root,al));
		
	}
	 public List<List<Integer>> findLeaves(TreeNode root) {
	        
		 
		 findLeavesUtil(root);
		 return res;
	   }
	 
	 
	
	public static void main(String[] args) {
		
		L366 l = new L366();
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		
		System.out.println(l.findLeaves(root));
		/*
		ArrayList<Integer> al = new ArrayList<Integer>();
		l.printInOrder(l.removeLeaves(root, al));
		l.printInOrder(l.removeLeaves(root, al));
		*/
	}
}
