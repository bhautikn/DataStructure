package Stack;
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

class Stack{
	Node first;	
	Node currunt;

	public Stack(){
		first = null;
		currunt = null;
	}

	public void push(int n){
		if (first == null) {
			first = new Node(n);
			currunt = first;
		}
		else {
			Node temp = new Node(n);
			currunt.next = temp;
			temp.previus = currunt;
			currunt = temp;
		}
	}

	public int pop(){
		if (first == null) {
			System.out.print("Stack Underflow");
			return 0;
		}
		if (currunt == first) {
			int tempVar = first.getValue();
			first = null;
			return tempVar;
		}
		int tempVar = currunt.getValue();
		currunt.previus.next = null;
		currunt = currunt.previus;
		return tempVar;
	}

	public int peek(){
		if(first == null){
			System.out.print("Stack is Empty");
			return 0;
		}
		return currunt.getValue();
	}

	public int peep(int index){
		Node temp = currunt;
		for (int i=1;i<index;i++) {
			if (temp.previus == null) {
				System.out.print("Invalid Index");
				return 0;
			}
			temp = temp.previus;
		}
		return temp.getValue();
	}

	public boolean change(int index, int element){
		Node temp = currunt;
		for (int i=1;i<index;i++) {
			if (temp.previus == null) {
				System.out.print("Invalid Index");
				return false;
			}
			temp = temp.previus;
		}
		temp.value = element;
		return true;
	}
	
	public void printStack(){
		Node temp = first;
		do{
			System.out.println(temp.getValue());
			temp = temp.next;
		}while(temp != null);
	}

	public boolean hasNext(){
		if (first != null) return true;
		return false;
	}
}