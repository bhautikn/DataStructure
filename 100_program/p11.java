// WAP to find weather given number is Armstrong number is not

public class p11 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); //get input from cmd
		int len = args[0].length();
		int ans = 0;
		while(n>0){
			ans += Math.pow(n%10,len);
			n=n/10;
		}
		if(args[0].compareTo(ans+"")==0)
			System.out.print("Armstrong");
		else 
			System.out.print("Not Armstrong");
	}
}