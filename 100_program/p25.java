/**
 * WAP to check weather number is present in array or not (using recursion only) and the 
 * function’s syntax is given below
 * Int isInArray(int a[],int m); 
 * Where int a[] is Array of integer and m is element to be searched.
**/

import java.util.Scanner;
public class p25 {
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6,7,8,0,3,2};
		System.out.print("Enter element: ");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		if (isInArray(arr,element,0))
			System.out.print("Element is available in array");
		else
			System.out.print("Element is Not available in array");
	}
	static boolean isInArray(int arr[],int e, int startIndex){
		if (arr[startIndex] == e)
			return true;
		else if(startIndex>=arr.length-1) return false;
		else return isInArray(arr, e, startIndex+1);
	}
}