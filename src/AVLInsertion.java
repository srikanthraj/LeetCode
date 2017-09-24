class Node 
{
int data;
int height;
Node left;
Node right;

Node(int data) {
	this.data = data;
	this.height = 1;
	this.left = null;
	this.right = null;
}
}
public class AVLInsertion {
Node root;

int height(Node root) {
	
	if(root == null)
		return 0;
	
	return 1 + Math.max(height(root.left), height(root.right));
	
}

int getBalance(Node root) {
	
	if(root == null)
		return 0;
	
	return height(root.left) - height(root.right);
}
Node insert(Node node, int key) {
	
	if(node == null)
		return new Node(key);
	
	if(key < node.data)
		node.left = insert(node.left,key);
	
	else if(key > node.data)
		node.right = insert(node.right,key);
	
	else
		return node;
	
	node.height = height(node);
	
	int balance = getBalance(node);
	
	
}
	
	public static void main(String[] args) {
		
		AVLInsertion tree = new AVLInsertion();
		tree.root = tree.insert(tree.root,10);
	    tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);
        
	}
}
