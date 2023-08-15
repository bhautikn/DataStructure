// WAP to convert an Octal into hexa-decimal.

import java.util.Scanner;
public class p44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Octal No: ");
		int octal =	sc.nextInt();
		String temp = octal+"";
		for (int i=0;i<temp.length();i++){
			if (temp.charAt(i)>'7' || temp.charAt(i)<'0'){
				System.out.println("Invalid No");
				System.exit(0);
			}
		}
		String str = decimalToHex(octalToDecimal(octal));
		System.out.println("Hex is: "+str);

	}
	static int octalToDecimal(int octal){
		String ocatlStr = octal+"";
		int decimal = 0;
		int j = 0;
		for (int i=ocatlStr.length()-1;i>=0;i--)
			decimal += Integer.parseInt(ocatlStr.charAt(j++)+"")*(Math.pow(8, i));
		return decimal;
	}
	static String decimalToHex(int decimal) {
		String hex = "";
		for (int i=0;decimal != 0;i++) {
			int temp = decimal%16;
			decimal /= 16;
			if (temp > 9) {
				hex += switch(temp){
					case 10 -> 'A';
					case 11 -> 'B';
					case 12 -> 'C';
					case 13 -> 'D';
					case 14 -> 'E';
					case 15 -> 'F';
					default -> '0';
				};
			}
			else{
				hex += temp+""; 
			}
		}
		return new StringBuffer(hex).reverse().toString();
	}
}