// WAP to find a prime number between range

public class p10 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]); // get input from command line
		for (int i=1;i<=num;i++)
			if (check(i)) System.out.print(i+" ");
	}
	static boolean check(int n){
		for (int i=2;i<=n/2;i++)
			if (n%i==0) return false;
		return true;
	}
}