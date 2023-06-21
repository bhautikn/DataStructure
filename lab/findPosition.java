import java.util.Scanner;
public class findPosition{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		System.out.print("Enter elements: ");
		int[] num = new int[n];
		for (int i=0;i<n;i++)
			num[i] = sc.nextInt();
		int min = num[0]; 
		int minIndex = 0;
		for (int i=1;i<n ;i++ ) {
			if (min>num[i]) {
				min=num[i];
				minIndex = i;
			}	
		}
		System.out.print("Min index is"+minIndex);
	}
}