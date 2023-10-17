// WAP to find a Multiplication of 2 Matrix .

public class p13 {
	public static void main(String[] args) {
		int arr1[][] = {{4, 5}, {6, 3}};
		int arr2[][] = {{5, 7}, {9, 2}};
		int ans[][] = new int[2][2];

		for(int i=0;i<2;i++){
			for (int j=0;j<2;j++) {
				for (int k=0;k<2;k++) {
					ans[i][j] += arr1[i][k]*arr2[k][j];			
				}
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}