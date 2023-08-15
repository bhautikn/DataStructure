/** 
* WAP to find Max, Min, Average of n numbers,
* n should be taken from user and all n value
* should be taken from user 
* (Note that you are not allowed to use an array for this)
**/

import java.util.Scanner;
public class p12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter n: ");
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i=0;i<n;i++) {
			System.out.print("Enter no "+(i+1)+": ");
			int temp = sc.nextInt();
			sum += temp;
			min = (min<temp)?min:temp;
			max = (max>temp)?max:temp;
		}
		System.out.println("Minimum is: "+min);
		System.out.println("Maximum is: "+max);
		System.out.println("Avarage is: "+(sum/n));
	}
}