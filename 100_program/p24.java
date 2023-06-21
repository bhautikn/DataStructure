/**
 * WAP to delete an element from array specified by user. 
 * if element is not found print a 
 * message “Element is not found (do not take a new array)
**/

import java.util.Scanner;

public class p24 {
	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6,7,8,0,3,2};
		Scanner sc = new Scanner(System.in);
		System.out.print("Array is: ");
		showArray(arr);
		System.out.print("(Enter 0 to exit and show Array)\n");
		while(true){
			System.out.print("Enter element: ");
			int element = sc.nextInt();
			int ans = elementAt(arr, element);
			if (element == 0){
				showArray(arr); 
				break;
			}
			else if (ans < 0){
				System.out.print("Element not found\n");
				continue;
			}
			else arr[ans] = 0;
			
		}
	}
	static void showArray(int arr[]){
		for (int temp : arr )
			System.out.print(temp+" ");
		System.out.println();
	}
	static int elementAt(int[] arr, int element){
		for (int i=0;i<arr.length;i++)
			if (arr[i] == element) return i; 
		return -2;
	}
}