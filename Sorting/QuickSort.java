public class QuickSort{
	public static void main(String[] args) {
		int arr[] = {59, 32, 41, 49, 3, 1, 77, 65, 47, 98, 43, 0};
		sort(arr);
		for (int i : arr)
		 	System.out.print(i+" ");
	}
	
	static void sort(int[] arr){ sort(arr, 0, arr.length-1); }
	static void sort(int[] arr, int startIndex, int endIndex){
		if(startIndex < endIndex){
			boolean flag = true;
			int i = startIndex;
			int j = endIndex;

			while(flag){
				while(arr[startIndex]>arr[i]) i++;
				while(arr[startIndex]<arr[j]) j--;
				if (i < j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				else flag = false;

				int temp = arr[i];
				arr[i] = arr[startIndex];
				arr[startIndex] = temp;

				sort(arr, startIndex, i);
				sort(arr, i+1, endIndex);
			}
		}
	}
}