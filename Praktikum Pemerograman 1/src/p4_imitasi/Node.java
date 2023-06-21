package p4_imitasi;

public class Node {

	public double data;
	public Node next;

	public Node(double data) {
		this.data = data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public double getData() {
		return this.data;
	}

	public Node getNext() {
		return this.next;
	}
}
