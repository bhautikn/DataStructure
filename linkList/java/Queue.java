package Queue;
class Queue{
	Node first = null;
	Node currunt = null;
	
	public void add(int n){
		if (first == null) {
			first = new Node(n);
			currunt = first;
		}
		else{
			Node temp = new Node(n);
			currunt.next = temp;
			currunt = temp;
		}
	}

	public int delete(){
		if (first == null) {
			System.out.print("Queue Underflow");
			return 0;
		}
		int temp = first.value;
		if(first.next == null)
			first = null;
		else
			first = first.next;
		return temp;
	}

	public String toString(){
		if (first == null) {
			return "Empty";
		}
		Node temp = first;
		String str = "";
		do{
			str += temp.value+", ";
			temp = temp.next;
		}while(temp!=null);
		return str;
	}

}
class Node{
	int value;
	Node previus;
	Node next;

	public Node(){
		this.next = null;
		this.previus = null;
	}

	public Node(int value){
		this.value = value;
		this.next = null;
	}

	public int getValue(){
		return this.value;
	}
}