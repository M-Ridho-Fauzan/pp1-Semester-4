package pert8;

public class StrukturListMHS {
	private Node HEAD;

	private Node curNode;
	private Node posNode;

	// Method isEmpty() digunakan untuk memeriksa apakah list kosong atau tidak.
	public boolean isEmpty() {
		return HEAD == null;
	}

	// Method addHEAD(int data) digunakan untuk menambahkan elemen baru di awal
	// list.
	public void addHEAD(MataKuliah data) {
		curNode = null;
		posNode = null;

		Node newNode = new Node(data);

		if (!isEmpty()) {
			newNode.setNext(HEAD);
		}
		HEAD = newNode;
	}

	public void addMid(MataKuliah data, int position) {
		Node posNode = null, curNode;
		int i = 1;

		Node newNode = new Node(data);
		if (HEAD == null) {
			HEAD = newNode;
		} else {
			curNode = HEAD;
			while (curNode != null && i < position) {
				posNode = curNode;
				curNode = curNode.getNext();
				i++;
			}
			posNode.setNext(newNode);
			newNode.setNext(curNode);
		}
	}

	public void addTail(MataKuliah data) {
		Node newNode = new Node(data);

		if (HEAD == null) {
			HEAD = newNode;
			return;
		} else {
			curNode = HEAD;
			while (curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
		}
		posNode.setNext(newNode);
	}

//	Fungsi Hapus

	public void dispose(Node temp) {
		temp.setNext(null);
		temp = null;
	}

	public void removeHead() {
		if (isEmpty()) {
			System.out.println("List kosong");
		} else {
			Node temp = HEAD;
			HEAD = HEAD.getNext();
			dispose(temp);
		}
	}

	public void removeMid(String data) {
		Node preNode = null;
		Node delNode = HEAD;
		boolean ketemu = false;
		int i = 1;

		if (isEmpty()) {
			delNode = HEAD;

			while (delNode.getNext() != null && !ketemu) {
				if (delNode.getData().equals(data)) {
					ketemu = true;
				} else {
					preNode = delNode;
					delNode = delNode.getNext();
					i++;
				}
			}
		}
	}

//	akhir Fungsihapus

	public boolean find(int x) {
		Node curNode = HEAD;
		boolean found = false;

		while (curNode != null && !found) {
			if (curNode.getData().equals(x)) {
				found = true;
			} else {
				curNode = curNode.getNext();
			}
		}

		if (found) {
			System.out.println("\n" + x + " Ditemukan dalam list");
		} else {
			System.out.println("\n" + x + " Tidak Ditemukan dalam list");
		}

		return found;
	}

	public void displayElement() {
		if (isEmpty()) {
			System.out.println("List Kosong");
			return;
		}
		Node curNode = HEAD;
		while (curNode != null) {
			System.out.println(curNode.getData().getKode() + " " + curNode.getData().getNama());
			curNode = curNode.getNext();
		}
	}
}