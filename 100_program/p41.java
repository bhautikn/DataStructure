/*
	You are given an integer num. Rearrange the digits of num such that its value is minimized 
	and it does not contain any leading zeros.
	Return the rearranged number with minimal value.
	Note that the sign of the number does not change after rearranging the digits.
	Input: num = 310
	Output: 103
	Explanation: The possible arrangements for the digits of 310 are 013, 031, 103, 130, 301, 
	310. 
	The arrangement with the smallest value that does not contain any leading zeros is 103.
*/

public class p41{
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); //get input from cmd
		int arr[] = new int[args[0].length()];
		for (int i=arr.length-1;i>=0;i--) {
			arr[i] = n%10;
			n/=10;
		}
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {
					if (arr[j]==0 && i==0) continue;
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int temp :arr )
			System.out.print(temp);
	}
}