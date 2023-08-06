package Queue;
public class CirculerQueue{
	private int arr[];
	private int front = -1;
	private int rear = -1;
	public int len;

	public CirculerQueue(int n){
		len = n;
		arr = new int[n];
	}
	public void add(int n){
		rear++;
		if (rear == len) {
			rear = -1;
		}
		if (front == rear) {
			System.out.println("Queue Overflow");
			if (rear == -1) rear = len-1;
			else rear--;
			return;
		}
		if (rear == -1) rear ++;
		arr[rear] = n;
	}
	public int delete(){
		front++;
	    if(front == len+1){
	        front = -1;
	    }
	    if (front == rear+1) {
			System.out.println("Queue Underflow");
			front = rear = -1;
			return 0;
		}
		if (front == -1) front = 0;
		int temp = arr[front];
		if (front == rear) front = rear = -1;
	    return temp;
	}
	public String toString(){
		String str = "";
	    if (front == rear)	return "";
	    if (rear == -1) rear = 0;
	    if (front == -1) front = 0;
	    else if (front == len) front = 0;
	    else front++;

	    if(front<=rear){
	        for(int i=front;i<=rear;i++){
	        	str += arr[i]+", ";
	        }
	    }
	    else{
	        for(int i=front;i<=len-1;i++){
	        	str += arr[i]+", ";
	        }
	        for(int i=0;i<=rear;i++){
	        	str += arr[i]+", ";
	        }  
	    }
	    return str;
	}
}