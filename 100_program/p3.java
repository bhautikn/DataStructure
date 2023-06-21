// WAP to find a Factor of a given number (iterative and recursive)

public class p3 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); // get input from command line
		System.out.print("factor of "+num+" is: ");
		for (int i=1;i<=num;i++)
			if (num%i==0)
				System.out.print(i+" ");
	}
}