// WAP to convert a Decimal number to BCD

public class p15 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); //get input from cmd
		int ans[] = new int[args[0].length()*4]; // create array of sum of all digit of num * 4
		int counter = ans.length-1; 
		int temp;
		while(n>0){ // loop until num is not zero 
			temp = n%10; // get last digit of num
			for (int i=1;i<=4;i++) {
				ans[counter--] = temp%2; // store reminder in array from last position
				temp /= 2; 
			}
			n /= 10; // remove last digit from num
		}
		for (int i=0;i<ans.length;i++) { // print array
			if (i%4==0) System.out.print(" "); // space after four byte
			System.out.print(ans[i]);
		}
	}
}