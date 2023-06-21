/*
	Given an array, rotate the array to the right by k steps, where k is non-negative.
	Example 1:
	Input: nums = [1,2,3,4,5,6,7], k = 3
	Output: [5,6,7,1,2,3,4]
	Explanation:
	rotate 1 step to the right: [7,1,2,3,4,5,6]
	rotate 2 steps to the right: [6,7,1,2,3,4,5]
	rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/

import java.util.Scanner;
public class p39{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int sizeOfArray = sc.nextInt();
		System.out.print("Enter Time of rotate: ");
		int rotate = sc.nextInt();
		int num[] = new int[sizeOfArray];
		for (int i=0;i<sizeOfArray;i++) {
			System.out.print("Enter element num["+i+"]: ");
			num[i] = sc.nextInt();
		}
		for (int i=1;i<=rotate;i++) {
			for (int j=sizeOfArray-1;j>0;j--) {
				int temp = num[j];
				num[j] = num[j-1];
				num[j-1] = temp;
			}
		}
		for (int temp :num )
			System.out.print(temp+" ");
	}
}