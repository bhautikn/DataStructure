public class InsertInLinkList {
	public static void main(String[] args) {
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(10);
		Node n4 = new Node(7);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		Node first = n1;
		addElementAfterElement(n2, 56);
		printList(first);
		
	}
	static void printList(Node first){
		Node temp = first;
		do{
			System.out.println(temp.value);
			temp = temp.next;
		}while(temp!= null);

	}
	static void addElementAtLast(Node first, int value){
		Node temp = first;

		while(temp.next != null)
			temp = temp.next;

		Node temp2 = new Node(value);
		temp.next = temp2;
	}

	static Node addElementAtFirst(Node first, int value){
		Node temp = new Node(value);
		temp.next = first;
		return temp;
	}

	static void addElementAfterElement(Node element, int value){
		Node temp = new Node(value);
		if (element.next == null) {
			element.next = temp;
		}
		else {
			temp.next = element.next;
			element.next = temp;
		}
	}
}
class Node{
	int value;
	Node next;
	Node(int value){
		this.value = value;
	}
}