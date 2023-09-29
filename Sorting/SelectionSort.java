public class SelectionSort{
	public static void main(String[] args) {
		int arr[] = {59, 32, 41, 49, 3, 1, 77, 65, 47, 98, 43};

		for (int i : sort(arr))
		 	System.out.print(i+" ");
	}
	
	public static int[] sort(int[] arr){
		for (int i=0;i<arr.length;i++) {
			int tempIndex = i;

			for (int j=i;j<arr.length;j++)
				if (arr[tempIndex]>arr[j])
					tempIndex = j;

			if (tempIndex != i) {
				int tempVar = arr[i];
				arr[i] = arr[tempIndex];
				arr[tempIndex] = tempVar;
			}
		}
		return arr;
	}
}