// WAP to find a power a^b (without using power and multiplication operation)

public class p20 {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]); //get input from cmd
		int y = Integer.parseInt(args[1]);
		int ans = 1;
		for (int i=1;i<=y;i++)
			ans = mul(x,ans);
		System.out.print(ans);
	}
	static int mul(int a, int b){
		int ans = 0;
		for (int i=1;i<=b;i++)
			ans+=a;
		return ans;
	}
}