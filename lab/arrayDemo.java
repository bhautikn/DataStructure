import java.util.Scanner;
public class arrayDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n = sc.nextInt();
		System.out.println("Enter elements: ");
		int[] num = new int[n];
		for (int i=0;i<n;i++) 
			num[i] = sc.nextInt();
		for (int i=0;i<n ;i++ )
			System.out.print(num[i]);
	}
}