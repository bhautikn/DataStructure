public class TreeSort {
	public static void main(String[] args) {
		int arr[] = {1, 34, 23, 4, 32, 6, 37, 8};
		for (int i : sort(arr))
			System.out.print(i+" ");
	}

	static int[] sort(int[] arr){
		BST tree = new BST();
		for (int i=0;i<arr.length;i++) 
			tree.add(arr[i]);
		return tree.inOrderTravelser(arr);
	}

	static class Node{
		int value;
		Node left = null;
		Node right = null;
		Node(int n){
			value = n;
		}
	}

	static class BST{
		Node root = null;

		int iterator = 0;
		static int arr[];

		public void add(int n){
			root = add(root, n);
		}
		int[] inOrderTravelser(int[] arr){
			this.arr = arr;
			inOrderTravelser(root);
			return this.arr;
		}
		Node add(Node parent, int n){
			if (parent == null)
				return new Node(n);
			
			if(n > parent.value)
				parent.right = add(parent.right, n);

			if(n < parent.value)
				parent.left = add(parent.left, n);

	        return parent;
		}
		void inOrderTravelser(Node parent){
			if (parent == null) return ;
			inOrderTravelser(parent.left);
			arr[iterator++] = parent.value;
			inOrderTravelser(parent.right);
			return ;
		}
	}
}