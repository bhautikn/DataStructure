package CirculerQueue;
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
		if (rear == len-1) rear = 0;
		else rear++;

		if (front == rear) {
			System.out.print("Queue Overflow\n");
			if (rear == 0) rear = len-1;
			else rear--;
			return;
		}
		arr[rear] = n;
		if (front == -1) front = 0;
		return;
	}
	public int delete(){
	    if(front == -1){
	        System.out.println("Underflow");
	        return 0;
	    }
	    int temp = arr[front];

	    if (front == rear){
	    	front = rear = -1;
	    	return temp;
	    }
	    if(front == len-1) front = 0;
	    else front++;

	    return temp;
	}
	public String toString(){
		String str = "";
		if (front == -1 && rear == -1)
			return "";
		if(front<=rear)
	        for(int i=front;i<=rear;i++)
	            str += arr[i]+", ";  
	    else{
	        for(int i=front;i<=len-1;i++)
	            str += arr[i]+", ";
	        for(int i=0;i<=rear;i++)
	            str += arr[i]+", ";
	    }
	    return str;
	}
	public String display(){
		return this.toString();
	}
}