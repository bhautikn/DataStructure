/**
 * WAP to calculate an angle between hour and minute hand. 
 * (Hours and minutes should be taken from user).
**/

import java.util.Scanner;
public class p14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("Enter Hour: ");
		int hh = sc.nextInt();
		System.out.print("Enter minut: ");
		int mm = sc.nextInt();
		float ans = (float)Math.abs((hh*30+mm*6)-360);
		ans -= mm/2f;
		System.out.println("angle is: "+ans+"deg");

	}
}