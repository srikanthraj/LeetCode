import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class L314 {

	
	TreeMap<Integer,ArrayList<Integer>> tm = new TreeMap<Integer,ArrayList<Integer>>(); 
	
	void voUtil(TreeNode root, int offset, int level) {
		
		
		if(root == null)
			return;
		
		if(level == 1) {
		ArrayList<Integer> al;
		
		if(!tm.containsKey(offset)) 
			
			al = new ArrayList<Integer>();
			
		else 
			al = tm.get(offset);
		
		al.add(root.val);
		tm.put(offset, al);
		}
		
		voUtil(root.left,offset-1,level-1);
		voUtil(root.right,offset+1,level-1);
	}
	
	int findHeight(TreeNode root) {
		
		if(root == null)
			return 0;
		
		return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
	}
	
public List<List<Integer>> verticalOrder(TreeNode root) {
        
	int h = findHeight(root);
	for(int i =1;i<=h;i++)
	voUtil(root,0,i);
	
	
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	res.addAll(tm.values());
	return res;
    }

	public static void main(String[] args) {
		
		L314 l = new L314();
		
		/*
		 * 
		 * 3
		  /\
		 /  \
		 9  20
		    /\
		   /  \
		  15   7
		 * 
		 */
		
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(0);
		root.right.left = new TreeNode(1);
		root.right.right = new TreeNode(7);
		root.right.left.left = new TreeNode(5);
		root.left.right.right = new TreeNode(2);
		
		System.out.println(l.verticalOrder(root));
	}
}
