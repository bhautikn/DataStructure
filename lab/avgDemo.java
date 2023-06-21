import java.util.Scanner;
public class avgDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++)
			sum = sum+i;
		double avg = sum/n;
		System.out.println(avg);
	}
}