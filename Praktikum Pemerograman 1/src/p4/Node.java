package p4;

public class Node {
//	double data;
//	Node pointer;
//	
//	public Node(double data) {
//		this.data = data;
//	}

	private double data;
	private Node next;

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
