/*
You are given a 0-indexed integer array nums of length n.
The average difference of the index i is the absolute difference between the average of the
first i + 1 elements of nums and the average of the last n - i - 1 elements. Both averages should
be rounded down to the nearest integer.
Return the index with the minimum average difference. If there are multiple such indices,
return the smallest one.
Note:
The absolute difference of two numbers is the absolute value of their difference.
The average of n elements is the sum of the n elements divided (integer division) by n.
The average of 0 elements is considered to be 0.
Input: nums = [2,5,3,9,5,3]
Output: 3
Explanation:
- The average difference of index 0 is: |2/1-(5+3+9+5+3)/5| = |2/1-25/5| = 3.
- The average difference of index 1 is: |(2 + 5) / 2 - (3 + 9 + 5 + 3) / 4| = |7 / 2 - 20 / 4| = 2.
- The average difference of index 2 is: |(2 + 5 + 3) / 3 - (9 + 5 + 3) / 3| = |10 / 3 - 17 / 3| = 2.
- The average difference of index 3 is: |(2 + 5 + 3 + 9) / 4 - (5 + 3) / 2| = |19 / 4 - 8 / 2| = 0.
- The average difference of index 4 is: |(2 + 5 + 3 + 9 + 5) / 5 - 3 / 1| = |24 / 5 - 3 / 1| = 1.
- The average difference of index 5 is: |(2 + 5 + 3 + 9 + 5 + 3) / 6 - 0| = |27 / 6 - 0| = 4.

The average difference of index 3 is the minimum average difference so return 3.
*/

public class p56 {
	public static void main(String[] args) {
		int arr[] = {2, 5, 3, 9, 5, 3};
		int ansArray[] = new int[arr.length];
		for (int i=0;i<arr.length;i++) {
			int temp1 = 0;
			int temp2 = 0;

			for (int j=0;j<=i;j++)
				temp1 += arr[j];

			temp1 /= (i+1);
			for (int k=i+1;k<arr.length;k++) 
				temp2 += arr[k];

			if ((arr.length-i-1)== 0) temp2 = 0;
			else temp2 /= (arr.length-i-1);

			ansArray[i] = Math.abs(temp1 - temp2);
		}
		int min = ansArray[0];
		int minIndex = 0;
		for (int i=0;i<ansArray.length;i++) {
			if (ansArray[i]<min) {
				min = ansArray[i];
				minIndex = i;
			}
		}
		System.out.print(minIndex);
	}
}