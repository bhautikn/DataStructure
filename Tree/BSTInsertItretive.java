public class BSTInsertItretive {
	public static void main(String[] args) {
		BST tree = new BST();
		tree.insert(5);
		tree.insert(15);
		tree.insert(4);
		tree.preOrder();
	}
}
class BST{
	Node root = null;
	public void preOrder(){
		preOrder(root);
	}
	void preOrder(Node parent){
		if (parent == null) return ;
		System.out.print(parent.data+" ");
		preOrder(parent.left);
		preOrder(parent.right);
	}
	public void insert(int n){
		if (root == null) {
			root = new Node(n);
			return ;
		}
		Node temp = root;
		Node previus = root;
		while(temp != null){
			previus = temp;
			if (n < temp.data) {
				temp = temp.left;
				continue;
			}
			temp = temp.right;
		}
		if (n < previus.data) {
			previus.left = new Node(n);
			return ;
		}
		previus.right = new Node(n);
	}

}
class Node{
	int data;
	Node left = null;
	Node right = null;
	public Node(int n){
		data = n;
	}
}
