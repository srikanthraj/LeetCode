import java.util.ArrayList;

public class L662 {

	
		
		int max = Integer.MIN_VALUE;
	    int low = 0;
	    int high = 0;
	    
	    int findHeight(TreeNode root) {
	        
	        if(root == null)
	            return 0;
	        
	        return 1 + Math.max(findHeight(root.left),findHeight(root.right));
	    }
	    
	    void traverseLevel(TreeNode root, int level, boolean[] isFound, boolean isLeft) {
	        
	        if(level ==0)
	        {
	            
	            if(!isFound[0]) {
	                
	                if(root == null) {
	                    
	                    if(isLeft)
	                        low++;
	                    else
	                        high--;
	                }
	                
	                else
	                    isFound[0] = true;
	            }
	            return;
	        }
	        
	        else if(root == null || level <0)
	            return;
	        
	        if(isLeft) {
	            
	            traverseLevel(root.left,level-1,isFound,isLeft);
	            traverseLevel(root.right,level-1,isFound,isLeft);
	        }
	        
	        else
	        {
	            
	            traverseLevel(root.right,level-1,isFound,isLeft);
	            traverseLevel(root.left,level-1,isFound,isLeft);
	        }
	        
	        
	    }
	    
	    ArrayList<TreeNode> traverse(TreeNode root, int level, ArrayList<TreeNode> al) {
	    	
	    	if(level ==0) {
	    		
	    		if(root==null)
	    			al.add(null);
	    		
	    		else
	    			al.add(root);
	    		
	    		return al;
	    	}
	    	
	    	else if(root == null)
	    		{
	    		al.add(null);
	    		//return al;
	    		}
	    	
	    	else if(level <0)
	    		return al;
	    	traverse(root.left,level-1,al);
	    	traverse(root.right,level-1,al);
	    	
	    	return al;
	    }
	    
	    public int widthOfBinaryTree(TreeNode root) {
	        
	        int h = findHeight(root);
	        
	        for(int i =0;i<h;i++) {
	           
	        	/*
	            low = 1;
	            high = (int)Math.pow(2,i);
	            
	            boolean[] isFoundLeft = new boolean[1];
	            traverseLevel(root,i,isFoundLeft,true);
	            
	            boolean[] isFoundRight = new boolean[1];
	            traverseLevel(root,i,isFoundRight,false);
	            */
	        	
	        	ArrayList<TreeNode> al = new ArrayList<TreeNode>();
	        	
	        	al = traverse(root,i,al);
	        	System.out.println("level " + i + " ArrayList " + al);
	            max = Math.max(max,high-low+1);
	                     
	        }
	        
	        return max;
	    }
	    
	    public static void main(String[] args) {
	    
	    	L662 l = new L662();
	    	
	    	TreeNode root = new TreeNode(1);
	    	root.left = new TreeNode(3);
	    	root.left.left = new TreeNode(5);
	    	//root.left.right = new TreeNode(3);
	    	root.left.left.left = new TreeNode(6);
	    	root.right = new TreeNode(2);
	    	root.right.right = new TreeNode(9);
	    	root.right.right.right = new TreeNode(7);
	    	
	    	System.out.println(l.widthOfBinaryTree(root));
	    }
}
