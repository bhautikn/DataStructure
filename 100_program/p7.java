// WAP to find a Fibonacci series up to n terms (n is entered by user)

public class p7{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); // get input from command line
		int temp= 0;
		int ans = 1;
		while(ans<=num) {
			System.out.print(ans+" ");
			ans += temp;
			temp = ans-temp;
		}
	}
}