public class LinearSearch{
	public static void main(String[] args) {
		System.out.println(search(new int[]{1,2 ,5, 7, 8}, 12));
	}
	static boolean search(int[] arr, int element){
		for (int i=0;i<arr.length;i++) {
			if (arr[i] == element) 
				return true;
		}
		return false;
	}
}