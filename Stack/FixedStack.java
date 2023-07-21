package Stack;
class FixedStack{
	private int arr[];
	private int size;
	private int counter = 0;
	public FixedStack(int n){
		size = n;
		arr = new int[n];
	}
	public void push(int n){
		if (counter ==size) {
			System.out.print("stack overflow");
		}
		else
			arr[counter++] = n;
	}
	public int pop(){
		if (counter ==0) {
			System.out.print("stack underflow");
			return 0;
		}
		return arr[--counter];
	}
	public int peep(int index){
		if (index < 0 || index >=size) {
			System.out.print("invalid index");
			return 0;
		}
		return arr[index];
	}
	public void change(int index, int element){
		if (index < 0 || index >=size) {
			System.out.print("invalid index");
		}
		else
			arr[index] = element;
	}
}