/**
 * WAP to find a quotient and reminder of 2 number (bigger number should be divided by 
 * lower number) and you are not allowed to use a division and quotient operator.
**/

import java.util.Scanner;
public class p29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = a;
		if (a<b) { // swap var if b > a
			temp = b;
			b=a;
			a=temp;
		}
		int qtn;
		for (qtn=1;;qtn++) { // loop until temp-a > 0
			temp -=b;
			if(temp-b<0) break;
		}
		System.out.println("quotient: "+qtn);
		System.out.println("reminder: "+(a-b*qtn));
	}
}