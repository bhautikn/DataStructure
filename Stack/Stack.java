package Stack;
public class Stack{
	private int arr[] = new int[0];

	public void push(int a){
		int temp[] = arr;
		arr = new int[temp.length+1];
		for (int i=0;i<temp.length;i++)
			arr[i] = temp[i];
		arr[arr.length-1] = a;
	}

	public int pop(){
		int returnVar = arr[arr.length-1];
		int temp[] = arr;
		arr = new int[temp.length-1];
		for (int i=0;i<temp.length-1;i++)
			arr[i] = temp[i];
		return returnVar;
	}

	public int peep(int index){
		try{
			return arr[index];
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("ArrayIndexOutOfBoundsException");
		}
		return 0;
	}
	
	public boolean change(int index, int element){
		try{
			arr[index] = element;
			return true;
		}catch(ArrayIndexOutOfBoundsException e){
			return false;
		}
	}

	public int length(){
		return arr.length;
	}

	public boolean hasNext(){
		if (arr.length==0)
			return false
		return true;
	}
	
	public void printStack(){
		System.out.println();
		for (int temp : arr) {
			System.out.print(temp+", ");
		}
	}
}