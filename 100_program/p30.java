// WAP to convert a Decimal to Binary

import java.util.Scanner; //import Scanner
public class p30{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // create obj of Scanner
		int decimal = sc.nextInt(); // get input from prompt
		int arr[] = new int[4]; // create array of 4 length
		for(int i=0;decimal>0;i++){ // loop untill decimal >= 0
			try{ // try to insert byte in array
				arr[i] = decimal%2;
			}catch (ArrayIndexOutOfBoundsException e) { // if get Array out of Bound 
				int[] temp = arr; // create temp array to store arr
				arr = new int[arr.length+4]; // allocate new 4 byte in array
				for (int k=0;k<temp.length;k++) // copy temp to arr
					arr[k] = temp[k];
				arr[i] = decimal%2; // then store a byte
			}
			decimal /= 2; 
		}
		for (int i=arr.length-1;i>=0;i--){ // print array byte in reverse order
			System.out.print(arr[i]);
		}
	}
}