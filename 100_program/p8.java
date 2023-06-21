// WAP to find a total odd and total even digit of a given number

public class p8 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); // get input from command line
		int sumOfEven=0, sumOfOdd=0;
		while (num>0) {
			if (num%2==0) sumOfEven++;
			else sumOfOdd++;
			num=num/10;
		}
		System.out.println("total even number: "+sumOfEven);
		System.out.println("total odd number: "+sumOfOdd);
	}
}