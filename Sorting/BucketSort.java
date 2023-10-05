public class BucketSort {
	public static void main(String[] args) { // main method

		double arr[] = {0.34, 0.31, 0.35, 0.37, 0.38, 0.32, 0.2, 0.34, 0.36, 0.39};
		for (double i : sort(arr))
			System.out.print(i+" ");
	}
	static double[] sort(double[] arr){ // Bucket sort mehtod
		Node buckets[] = new Node[10];
		for (int i=0;i<arr.length;i++) {
			int index = (int)(arr[i]*10);
			if(buckets[index] == null)
				buckets[index] = new Node(arr[i]);
			else{
				Node temp = buckets[index];
				if (buckets[index].value > arr[i]) {
					buckets[index] = new Node(arr[i]);
					buckets[index].next = temp;
					temp.previus = buckets[index];
					continue;
				}
				Node previus = buckets[index];
				while(temp.next != null){
						if(temp.value > arr[i]){
						Node newNode = new Node(arr[i]);
						newNode.previus = temp.previus;
						newNode.next = temp;
						temp.previus = newNode;
						newNode.previus.next = newNode;
						break;
					}
					temp = temp.next;
				}
				if(temp.next == null){
					Node newNode = new Node(arr[i]);
					temp.next = newNode;
					newNode.previus = temp;
				}
			}
		}
		int j = 0;
		for (int i=0;i<buckets.length;i++) {
			Node temp = buckets[i];
			while(temp!= null){
				arr[j++] = temp.value;
				temp = temp.next;
			}
		}
		return arr;
	}
	static class Node{ //bucket sort by using LinkedList
		double value;
		Node next = null;
		Node previus = null;
		Node(double value){
			this.value = value;
		}
	}
}