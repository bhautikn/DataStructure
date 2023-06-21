// WAP to find whether string is palindrome or not

public class p2 {
	public static void main(String[] args) {
		StringBuffer b1 = new StringBuffer(args[0]); // get input from command line
		StringBuffer b2 = new StringBuffer(args[0]);
		b1.reverse();
		if (b1.compareTo(b2)==0)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}