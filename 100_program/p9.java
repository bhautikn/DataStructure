// WAP to find whether a number is Odd or Even without using a % operator.

public class p9 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); // get input from command line
		int ans = num-(num/2*2);
		if (ans==0) System.out.println("even number");
		else System.out.println("odd number");
	}
}