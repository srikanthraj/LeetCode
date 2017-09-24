
public class L106 {

public TreeNode buildTree(int[] inorder, int[] postorder) {
        
		int[] count = new int[1]; 
        count[0] = inorder.length-1;
        
        return buildUtil(inorder,postorder,0,postorder.length-1,count);
    }
    
    public TreeNode buildUtil(int[] inorder, int[] postorder,int l , int h,int[] count) {
        
        if(l > h)
        return null;
        
        int num = postorder[count[0]--];
        
        int index = findIndex(inorder,num,l,h);
        
        
        
        TreeNode root = new TreeNode(inorder[index]);
        System.out.println(root.val);
        root.right = buildUtil(inorder,postorder,index+1,h,count);
        root.left = buildUtil(inorder,postorder,l,index-1,count);
        
        return root;      
    }
    
    public int findIndex(int inorder[],int target,int l, int h) {
        
        for(int i =l;i<=h;i++)
        {
            if(inorder[i] == target)
            return i;
        }
        
        return -1;
    }
    
    void printTree(TreeNode root) {
    	if(root == null)
    		return;
    	
    	printTree(root.left);
    	System.out.println(root.val);
    	printTree(root.right);
    }
    
	public static void main(String[] args) {
		L106 l = new L106();
		int [] inorder = {2,1,3};
		int [] postorder = {2,3,1};
		l.printTree(l.buildTree(inorder, postorder));
	
		
	}
}
