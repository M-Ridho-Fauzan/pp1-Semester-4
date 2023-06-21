package pert8;

public class Node {
	private MataKuliah data;
	private Node next;

	/* Inisialisasi Atribut Node */
	public Node(MataKuliah data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public MataKuliah getData() {
		return data;
	}

	public void setData(MataKuliah data) {
		this.data = data;
	}
}