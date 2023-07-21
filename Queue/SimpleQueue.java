package SimpleQueue;

class SimpleQueue {
	private int arr[];
	private int front = 0;
	private int rear = 0;
	int size;
	SimpleQueue(int n){
		arr = new int[n];
		size = n;
	}
	public boolean insert(int n){
		if (rear == size) {
			System.out.println("Queue overflow");
			return false;
		}
		arr[rear++] = n;
		return true;
	}
	public int delete(){
		if (front == rear){
			System.out.println("Queue Undeflow");
			return 0;
		}
		return arr[front++];
	}
}
