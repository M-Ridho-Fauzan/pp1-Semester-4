package test;

public class StrukturList {
	Node head;

	boolean isEmpty() {
		return (head == null);
	}

	void addHead(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.getNext();
			head = newNode;
		}
	}

	public static void main(String[] args) {
		StrukturList KL = new StrukturList();

		KL.addHead(1);
		KL.addHead(2);
		KL.addHead(3);
		KL.addHead(4);
	}
}
