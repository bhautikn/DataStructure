import java.util.Scanner;
public class oddEven{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is odd or even: ");
		int n = sc.nextInt();
		if(n%2==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}
}