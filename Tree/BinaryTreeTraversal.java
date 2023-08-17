public class BinaryTreeTraversal{
	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();

		t.root = new Node(2);
		t.root.left = new Node(23);
		t.root.right = new Node(14);
		t.root.left.left = new Node(45);
		t.root.left.right = new Node(29);

		System.out.println("\npre order: ");
		t.preOrderTravelser();
		System.out.println("\n\npost order: ");
		t.postOrderTravelser();
		System.out.println("\n\nin order: ");
		t.inOrderTravelser();
	}
}
class Node{
	int value;
	Node left = null;
	Node right = null;
	public Node(int n){
		this.value = n;
	}
}
class BinaryTree{
	Node root = null;

	public void preOrderTravelser(){
		this.preOrderTravelser(root);
	}
	public void postOrderTravelser(){
		this.postOrderTravelser(root);
	}
	public void inOrderTravelser(){
		this.inOrderTravelser(root);
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
	public void inOrderTravelser(Node parent){
		if (parent == null) return;
		inOrderTravelser(parent.left);
		System.out.print(parent.value+" ");
		inOrderTravelser(parent.right);
	}
}