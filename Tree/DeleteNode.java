public class DeleteNode {
	public static void main(String[] args) {
		BST b = new BST();
		b.addInTree(4);
		b.addInTree(7);
		b.addInTree(5);
		b.addInTree(9);
		b.addInTree(2);
		b.addInTree(17);
		b.addInTree(8);

		b.preOrderTravelser();
		System.out.println();
		b.postOrderTravelser();

		b.deleteNode(4);
		b.deleteNode(8);

		System.out.println("\nafter");
		b.preOrderTravelser();
		System.out.println();
		b.postOrderTravelser();
	}
}
class Node{
	int value;
	Node left = null;
	Node right = null;
	Node(int n){
		value = n;
	}
}

class BST{
	Node root = null;

	void addInTree(int n){
		root = addInTree(root, n);
	}
	void deleteNode(int value){
		Node parent = root;
		Node current = root;
		if (parent == null) return ;
		while(current.value != value){

			parent = current;
			if (value > current.value)
				current = current.right;
			else current = current.left;
			if (current == null) return;

		}
		if (current.left == null && current.right == null) {
			if (current == parent)
				root = null;
			else if (current == parent.left)
				parent.left = null;
			else
				parent.right = null;
		}
		else if(current.left != null && current.right == null){
			if (current == parent)
				parent = parent.left;
			if (current == parent.left)
				parent.left = current.left;
			else
				parent.right = current.left;
		}
		else if(current.left == null && current.right != null){
			if (current == parent)
				parent = parent.right;
			if (current == parent.left)
				parent.left = current.right;
			else
				parent.right = current.right;
		}
		else{

			Node temp = current.right;
			while(temp.left != null)
				temp = temp.left;

			temp.left = current.left;

			if (current == parent) 
				root = current.right;
			else if(current == parent.right)
				parent.right = current.right;
			else
				parent.left = current.right;
		}
	}
	Node addInTree(Node parent, int n){
		if (parent == null){
			parent = new Node(n);
			return parent;
		}
		if(n > parent.value)
			parent.right = addInTree(parent.right, n);

		if(n < parent.value)
			parent.left = addInTree(parent.left, n);

        return parent;
	}
	public void preOrderTravelser(){
		preOrderTravelser(root);
	}
	public void postOrderTravelser(){
		postOrderTravelser(root);
	}
	public void preOrderTravelser(Node parent){
		if (parent == null) return;
		System.out.print(parent.value+" ");
		preOrderTravelser(parent.left);
		preOrderTravelser(parent.right);
	}
	public void postOrderTravelser(Node parent){
		if (parent == null) return;
		postOrderTravelser(parent.left);
		postOrderTravelser(parent.right);
		System.out.print(parent.value+" ");
	}
}