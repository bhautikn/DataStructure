/*
	WAP to implement a sliding window problem. You are given an array of integers nums, 
	there is a sliding window of size k which is moving from the very left of the array to the 
	very right. You can only see the k numbers in the window. Each time the sliding window 
	moves right by one position.
	Input: nums = [1,3, -1, -3,5,3,6,7], k = 3
	Output: [3,3,5,5,6,7]

	Explanation: 
	Window position 		 Max
	--------------- 		-----
	[1 3 -1] -3 5 3 6 7 		3
	1 [3 -1 -3] 5 3 6 7 		3
	1 3 [-1 -3 5] 3 6 7 		5
	1 3 -1 [-3 5 3] 6 7 		5
	1 3 -1 -3 [5 3 6] 7 		6
	1 3 -1 -3 5 [3 6 7] 		7
*/
import java.util.Scanner;
public class p42{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter k: ");
		int k= sc.nextInt();
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i=0;i<n;i++) {
			System.out.print("Enter element arr["+i+"]: ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Ans is: ");
		for (int i=0;i<=n-k;i++) {
			int max = arr[i];
			for (int j=0;j<k;j++)
				max = (arr[i+j]>max)?arr[i+j]:max;
			System.out.print(max+" ");
		}
	}
}