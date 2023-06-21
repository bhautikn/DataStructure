// WAP to find a sum of even number into 1D array

public class p1 {
	public static void main(String[] args) {
		int sum=0;
		int n;
		try{
			n = Integer.parseInt(args[0]); // get input from command line
		}catch(NumberFormatException e){
			System.out.println("please enter number");
		}
		for (int i=0;i<=n;i++)
			if (i%2==0)
				sum+=i;
		System.out.println(sum);
	}
}