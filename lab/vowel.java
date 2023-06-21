import java.util.Scanner;
public class vowel{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to check whether it is vowel or not: ");
		Character ch = sc.next().charAt(0); 
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.println("Character is vowel");
		else
			System.out.println("Character is consonant");
	}
}