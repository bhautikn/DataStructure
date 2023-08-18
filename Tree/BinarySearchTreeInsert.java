public class BinarySearchTreeInsert {
	public static void main(String[] args) {
		BST b = new BST();
		b.addInTree(4);
		b.addInTree(7);
		b.addInTree(5);
		b.addInTree(9);
		b.addInTree(2);
		System.out.println("\npre order: ");
		b.preOrderTravelser();
		System.out.println("\n\npost order: ");
		b.postOrderTravelser();
		System.out.println("\n\nin order: ");
		b.inOrderTravelser();
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

	public void addInTree(int n){
		root = addInTree(root, n);
	}
	public void preOrderTravelser(){
		preOrderTravelser(root);
	}
	public void postOrderTravelser(){
		postOrderTravelser(root);
	}
	public void inOrderTravelser(){
		inOrderTravelser(root);
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
	void preOrderTravelser(Node parent){
		if (parent == null) return;
		System.out.print(parent.value+" ");
		preOrderTravelser(parent.left);
		preOrderTravelser(parent.right);
	}
	void postOrderTravelser(Node parent){
		if (parent == null) return;
		postOrderTravelser(parent.left);
		postOrderTravelser(parent.right);
		System.out.print(parent.value+" ");
	}
	void inOrderTravelser(Node parent){
		if (parent == null) return;
		inOrderTravelser(parent.left);
		System.out.print(parent.value+" ");
		inOrderTravelser(parent.right);
	}
}