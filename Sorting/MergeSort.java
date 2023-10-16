public class MergeSort{
	public static void main(String[] args) {
		int arr[] = { 573, 21, 12, 35, 65, 337, 4, 43, 19, 0, 34, 12 };
		sort(arr);
		for (int i : arr)
			System.out.print(i+" ");
	}
	static void sort(int[] arr){ sort(arr, 0, arr.length-1); }
	static void sort(int[] arr, int start, int end){
		if(start < end){
			int middle = start + (end-start)/2;
			sort(arr, start, middle);
			sort(arr, middle+1, end);
			merge(arr, start, middle, end);
		}
	}
	static void merge(int[] arr, int start, int middle, int end){
		int n1[] = new int[middle-start+1];
		int n2[] = new int[end-middle];
		for(int i=0;i<n1.length;i++)
			n1[i] = arr[start+i];
		for(int i=0;i<n2.length;i++)
			n2[i] = arr[middle+1+i];
		int i = 0, j = 0, k = start;
		while(i < n1.length && j < n2.length){
			if(n1[i] < n2[j])
				arr[k++] = n1[i++];
			else
				arr[k++] = n2[j++];
		}
		while(i < n1.length)
			arr[k++] = n1[i++];
		while(j < n2.length)
			arr[k++] = n2[j++];
	}
}