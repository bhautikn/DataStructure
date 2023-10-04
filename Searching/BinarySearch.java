public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		System.out.println(search(arr, 13));
	}
	static boolean search(int[] arr, int element){
		int startIndex = 0;
		int lastIndex = arr.length;
		int middleIndex = lastIndex/2;

		while(startIndex != lastIndex){
			if (arr[middleIndex] == element)
				return true;
			if (arr[middleIndex] < element){
				startIndex = middleIndex+1;
				middleIndex = (lastIndex-startIndex)/2+startIndex;
			}
			else if(arr[middleIndex] > element){
				lastIndex = middleIndex;
				middleIndex = (lastIndex-startIndex)/2+startIndex;
			}
		}
		return false;
	}
}