
// HashMap class which is open hash and use moduler Hash function
// where <Key, Value> are both int
package HashMap;
public class HashMap{
	static class Node{
		int key;
		int value;
		Node next = null;
		Node(int key, int value){
			this.key = key;
			this.value = value;
		}
	}

	byte length = 5;
	Node[] table = new Node[5];
	byte divisor = 10;

	public void put(int key, int value){
		int temp = key%10;
		if (temp > 4) temp -= 5;
		if (table[temp] == null) {
			table[temp] = new Node(key , value);
			return ;
		}
		Node tempNode = table[temp];
		if (tempNode.key == key) return ;
		while(tempNode.next != null){
			if (tempNode.key == key)
				return ;
			tempNode = tempNode.next;
		}
		tempNode.next = new Node(key, value);
	}

	public int get(int key){
		for (byte i=0;i<length;i++) {
			if (table[i] == null) continue;
			Node temp = table[i].next;
			while(temp != null){
				if (temp.key == key)
					return temp.value;
				temp = temp.next;
			}
		}
		return 0;
	}

	public String toString(){
		String str = "[";
		for (byte i=0;i<length;i++) {
			if (table[i] == null) continue;
			Node temp = table[i];
			while(temp != null){
				str += "("+temp.key+", "+temp.value+"), ";
				temp = temp.next;
			}
		}
		return str+"]";
	}
}