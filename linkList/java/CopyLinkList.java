public class CopyLinkList {
	public static void main(String[] args) {
		Node n1 = new Node(5);
		Node n2 = new Node(51);
		Node n3 = new Node(52);
		Node n4 = new Node(53);
		Node n5 = new Node(6);
		Node n6 = new Node(81);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		Node secondList = copyOf(n1);
		printList(secondList);
	}
	static void printList(Node first){
		Node temp = first;
		do{
			System.out.print(temp.value+", ");
			temp = temp.next;
		}while(temp!= null);
	}
	static Node copyOf(Node first){
		Node save = first;
		Node firstNode = new Node(save.value);
		firstNode.next = save.next;
		Node privius = firstNode;
		save = save.next;
		do{
			Node temp = new Node(save.value);
			privius.next = temp;
			privius = temp;
			save = save.next;
		}while(save != null);
		return firstNode;
	}
}
class Node{
	int value;
	Node next = null;
	Node(int n){
		value = n;
	}
}