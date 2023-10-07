public class CountSort {
	public static void main(String[] args) {
		int arr[] = {3, 2, 6, 3, 6, 2, 6, 2, 6, 2, 3};
		for (int i : sort(arr))
			System.out.print(i+" ");
	}
	static int[] sort(int []arr){
		int max = arr[0];
		for (int i : arr ) 
			max = max < i?i:max;
		int countArray[] = new int[max+1];
		for (int i=0;i<arr.length;i++)
			countArray[arr[i]]++;
		int j = 0;
		for (int i = 0; i<countArray.length;i++)
			while(countArray[i] > 0){
				arr[j++] = i;
				countArray[i] --;
			}
		return arr;
	}
}