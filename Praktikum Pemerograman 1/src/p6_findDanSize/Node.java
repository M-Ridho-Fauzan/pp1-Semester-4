package p6_findDanSize;

public class Node {
	private int data;
	Node next;

//	Inisialisasi attribut node
	public Node(int data) {
		this.data = data;
	}

//	Setter & Getter
	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	Node getNext() {
		return this.next;
	}

}
