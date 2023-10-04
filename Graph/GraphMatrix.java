import java.util.Scanner;
public class GraphMatrix{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers of node: ");
		int noOfNode = sc.nextInt();
		System.out.print("Enter numbers of edges: ");
		int edges = sc.nextInt();
		int arr[][] = new int[noOfNode][noOfNode];
		System.out.println("Enter Pair space sprated");
		for (int i=0;i<edges;i++) {
			System.out.print("Enetr pair "+(i+1)+": ");
			int u = sc.nextInt();
			int v = sc.nextInt();
			System.out.print("Is directed: ");
			if(sc.nextBoolean())
				arr[u-1][v-1] = 1;
			else{
				arr[u-1][v-1] = 1;
				arr[v-1][u-1] = 1;
			}
		}
		
		for (int i=0;i < noOfNode;i++) {
			for (int j=0;j<noOfNode;j++) {
				System.out.print(arr[i][j]+" ");	
			}
			System.out.println();
		}
	}
}