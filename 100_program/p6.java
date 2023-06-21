/**
*	Print a following pattern 
*	1
*	1 2
*	1 2 3
*	1 2 3 4
**/
public class p6{
	public static void main(String[] args) {
		for (int i=1;i<=4;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j+" ");		
			}
		System.out.println();
		}

	}
}