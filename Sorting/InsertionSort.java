public class InsertionSort{
	public static void main(String[] args) {
		int arr[] = {1,4, 65, 3, 6,8,89,45, 78, 8, 2};
		for (int i : sort(arr)) {
			System.out.print(i+" ");
		}
	}
	static int[] sort(int arr[]){
		for (int i=0;i<arr.length-1;i++) {
			if (arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;

				int j = i;
				while(j > 0){
					if (arr[j-1] > arr[j]) {
						int temp2 = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp2;
					}
					else break;
					j--;
				}
			}
		}
		System.out.println();
		return arr;
	}
}