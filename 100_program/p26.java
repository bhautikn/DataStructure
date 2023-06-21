// WAP to convert a Binary to Decimal

import java.util.Scanner;
public class p26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter binury: ");
		int binury = sc.nextInt();
		int ans = 0;
		for (int i=0;binury>0;i++) {
			ans += Math.pow(2,i)*(binury%10);
			binury /=10;
		}
		System.out.println(ans);
	}
}