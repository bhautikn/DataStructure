// WAP to enter an element at specific position into array. (Do not take a new array) 

import java.util.Scanner;
public class p23 {
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,6,7,8,0,3,2};
		Scanner sc = new Scanner(System.in);
		System.out.print("Array is: ");
		showArray(arr);
		System.out.print("(negative to exit and -1 to show Array)\n");
		while(true){
			System.out.print("Enter potition: ");
			int p = sc.nextInt();
			if (p>=arr.length){
				System.out.print("Array index Out of bound\n");
				continue;
			}
			else if (p==-1){ 
				showArray(arr); 
				continue;
			}
			else if (p<0) break;
			System.out.print("Enter element: ");
			int element = sc.nextInt();
			arr[p] = element;
		}
	}
	static void showArray(int arr[]){
		for (int temp : arr )
			System.out.print(temp+" ");
		System.out.println();
	}
}