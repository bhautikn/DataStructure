/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each 
 * element in the result must appear as many times as it shows in both arrays and you may 
 * return the result in sorted order.
**/

public class p35{
	public static void main(String[] args) {
		int num1[] = {1,2,3};
		int num2[] = {1,1,3,4};
		int ans[] = new int[0];
		int k=0;
		for (int i=0;i<num1.length;i++) {
			for (int j=0;j<num2.length;j++) {
				if (num1[i]==num2[j]) {
					int temp[] = ans;
					ans = new int[k+1];
					for (int m=0;m<temp.length;m++)
						ans[m] = temp[m];
					ans[k++] = num1[i];
					break;
				}
			}
		}
		for (int temp :ans) {
			System.out.print(temp+" ");
		}
	}
}