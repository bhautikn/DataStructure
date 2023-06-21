//program to find area of circule

import java.util.Scanner;
public class Area{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		int r = sc.nextInt();
		double a = 3.14*r*r;
		System.out.println(a);
	}
}