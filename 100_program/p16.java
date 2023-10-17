// WAP to sort an Array using Bubble sort

public class p16{
	public static void main(String[] args) {
		int arr[] = {59, 32, 41, 49, 3, 1, 77, 65, 47, 98, 43};

		boolean isChange = true;
		for (int i=0;i<arr.length;i++) {
			if (!isChange) break;
			isChange = false;
			for (int j=0;j<arr.length-i-1;j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isChange = true;
				}
			}
		}

		for (int i : arr) 
			System.out.print(i+" ");
	}
}
