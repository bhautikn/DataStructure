import java.util.*;
public class replace{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		System.out.print("Enter elements: ");
		int[] num = new int[n];
		for (int i=0;i<n ;i++ )
			num[i] = sc.nextInt();
		System.out.print("Enter first number: ");
		int firstNum = sc.nextInt();
		System.out.print("Enter the number you want to replace: ");
		int secondNum = sc.nextInt();
		for(int i=0;i<n;i++){
			if(num[i]==firstNum){
				num[i]=secondNum;
				break;
			}
		}
		System.out.print(secondNum);
		for( int i=0;i<n;i++)
			System.out.println(num[i]);
	}
}