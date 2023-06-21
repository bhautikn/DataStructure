import java.util.Scanner;
public class sumDemo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m: ");
        int m = sc.nextInt();
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=m;i<=n;i++)
            sum = sum+m;
        System.out.println("Sum is: "+sum); 
    }
}