// WAP to find a factorial of a given integer

public class p4{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); // get input from command line
		int ans = 1;
		for (int i=1;i<=num;i++)
			ans *=i;
		System.out.println("factorial of "+num+" is: "+ans);
	}
}