/*
	You have n super washing machines on a line. Initially, each washing machine has some 
	dresses or is empty.
	For each move, you could choose any m (1 <= m <= n) washing machines, and pass one dress 
	of each washing machine to one of its adjacent washing machines at the same time.
	Given an integer array machine representing the number of dresses in each washing machine 
	from left to right on the line, return the minimum number of moves to make all the washing 
	machines have the same number of dresses. If it is not possible to do it, return -1.
	Input: machines = [1,0,5]
	Output: 3
	Explanation:
	1st move: 1 0 <-- 5 => 1 1 4
	2nd move: 1 <-- 1 <-- 4 => 2 1 3
	3rd move: 2 1 <-- 3 => 2 2 2
	Input: machines = [0,3,0]
	Output: 2
	Explanation:
	1st move: 0 <-- 3 0 => 1 2 0
	2nd move: 1 2 --> 0 => 1 1 1
*/
import java.util.Scanner;
public class p54{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i=0;i<n;i++) {
			System.out.print("Enter element arr["+i+"]: ");
			arr[i] = sc.nextInt();
		}
		int count = 0;
		int sum = 0;
		for (int i=0;i<n;i++) sum+=arr[i];
		if (sum%n!=0)
			System.out.print(-1);
		else{
			while (true) {
				if (isSame(arr)) break;
				int max = getMax(arr);
				int min = getMin(arr);
				arr[max]--;
				arr[min]++;
				count++;
			}
			System.out.print(count);
		}
	}
	public static int getMax(int arr[]){
		int max = 0, i, temp = arr[0];
		for (i=0;i<arr.length;i++)
			if (arr[i]>temp) {
				temp = arr[i];
				max = i;
			}
		return max;
	}
	public static int getMin(int arr[]){
		int min = 0, i, temp = arr[0];
		for (i=0;i<arr.length;i++)
			if (arr[i]<temp) {
				temp = arr[i];
				min = i;
			}
		return min;
	}
	public static boolean isSame(int arr[]){
		for (int i=0;i<arr.length-1;i++)
			if (!(arr[i]==arr[i+1])) return false;
		return true;
	}
}