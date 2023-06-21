import java.util.*;
public class duplicate{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		System.out.print("Enter elements: ");
		int []myArray = new int[n];
		for (int i=0;i<n;i++)
			myArray[i] = sc.nextInt();
		System.out.print("Duplicated elemnent in given array: ");
		for(int i=0;i<n;i++)
			for (int j=i+1;j<n ;j++ ) 
				if(myArray[i]==myArray[j])
					System.out.println(myArray[j]);
	}
}