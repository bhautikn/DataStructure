public class ReverseLinkList {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		n1.next = new Node(5);
		n1.next.next = new Node(85);
		n1.next.next.next = new Node(54);
		n1 = reverse(n1);
		printList(n1);
	}
	public static Node reverse(Node first){
		if(first == null) return null;
		Node temp = first;
		Node previus = first;
		while(temp.next != null){
			previus = temp;
			temp = temp.next;
		}
		previus.next = null;
		if (temp == first) {
			first = null;
			return temp;
		}
		temp.next = reverse(first);
		return temp;
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