public class BubbleSortLinkList {
	public static void main(String[] args) {
		Node n1 = new Node(15);
		n1.next = new Node(5);
		n1.next.next = new Node(85);
		n1.next.next.next = new Node(1);
		sort(n1);
		printList(n1);
	}
	public static void sort(Node first){
		if (first == null) return ;
		boolean isSwap = true;
		while(isSwap){
			Node temp = first;
			isSwap = false;	
			while(temp.next != null){
				if (temp.value > temp.next.value) {
					int v = temp.value;
					temp.value = temp.next.value;
					temp.next.value = v;
					isSwap = true;
				}
				temp = temp.next;
			}
		}
	}
	public static void printList(Node first){
		Node temp = first;
		do{
			System.out.println(temp.value);
			temp = temp.next;
		}while(temp!=null);
	}
}
class Node{
	int value;
	Node next = null;
	Node(int n){
		value = n;
	}
}