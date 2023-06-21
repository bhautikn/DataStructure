// WAP to find a summation of a digit of a given number

public class p5 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); // get input from command line
		int sum = 0;
		while(num>0){
			sum += num%10;
			num=num/10;
		}
		System.out.println(sum);
	}
}