package p6_findDanSize;

public class StrukturList {
//	Pertemuan 5
	private Node HEAD;

// pertemuan 4
	public boolean isEmpty() {
		return (HEAD == null);
	}

	public void addHEAD(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			HEAD = newNode;
		} else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}

	public void addMid(int data, int position) {
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

	public void addTail(int data) {
		Node newNode = new Node(data);
		Node posNode = null;
		Node curNode;

		if (isEmpty()) {
			HEAD = newNode;
		} else {
			curNode = HEAD;
			while (curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode);
		}
	}

//	pertemuan 5

	public void dispose(Node temp) {
		temp.next = null;
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

	public void removeMid(int x) {
		Node preNode = null;
		Node delNode = HEAD;
		boolean ketemu = false;
		int i = 1;

		if (HEAD != null) {
			delNode = HEAD;

			while (delNode.next != null && !ketemu) {
				if (delNode.getData() == x) {
					ketemu = true;
				} else {
					preNode = delNode;
					delNode = delNode.next;
					i++;
				}
			}

			if (ketemu) {
				if (i == 1) {
					HEAD = null;
				} else {
					preNode.next = delNode.next;
					delNode = null;
				}
			}
		}
	}

	void removeTail() {
		Node preNode = null;
		Node lastNode;

		if (HEAD != null) {
			if (HEAD.getNext() == null) {
				HEAD = null;
			} else {
				lastNode = HEAD;
				while (lastNode.getNext() != null) {
					preNode = lastNode;
					lastNode = lastNode.getNext();

				}
//				Jika salah maka program di bawah akan mengeror kan diri sendiri
				preNode.setNext(null);
				dispose(lastNode);
			}
		}
	}

//	Pertemuan 6

	public boolean find(int x) {
		Node curNode = HEAD;
		boolean ketemu = false;

		while (curNode != null && !ketemu) {
			if (curNode.getData() == x) {
				ketemu = true;
			} else {
				curNode = curNode.getNext();
			}
		}
		System.out.println(ketemu);
		return ketemu;
	}

	public int size() {
		Node curNode = HEAD;
		int jumlah = 0;

		while (curNode != null) {
			jumlah += 1;
			curNode = curNode.getNext();
		}
		System.out.println(jumlah);
		return jumlah;
	}

	public void removeAll() {
		Node curNode = HEAD;
		while (curNode != null) {
			HEAD = curNode.getNext();
			dispose(curNode);
			curNode = HEAD;
		}
	}

//	pertemuan 4
	public void tampilElement() {
		Node curNode = HEAD;

		if (isEmpty()) {
			System.err.println("List kosong");
		} else {
			System.out.print("[ ");
			while (curNode != null) {
				System.out.print(curNode.getData() + " ");
				curNode = curNode.getNext();
			}
			System.out.println(" ]");
		}
	}

	public static void main(String[] args) {
		StrukturList PRO = new StrukturList();

//		Pertemuan 5
//		Latihan 3
//		PRO.addHEAD(2);
//		PRO.addHEAD(9);
//		PRO.addHEAD(7);
//		PRO.tampilElement();
//		PRO.removeHead();
//		PRO.tampilElement();

//		Latihan 4		
//		PRO.addHEAD(1);
//		PRO.addHEAD(5);
//		PRO.addHEAD(3);
//		PRO.addHEAD(6);
//		PRO.addHEAD(2);
//		PRO.addHEAD(9);
//		PRO.tampilElement();
//		System.out.println("=======");
//		PRO.removeTail();
//		PRO.tampilElement();
//		System.out.println("=========");
//		PRO.removeHead();
//		PRO.tampilElement();

//		TUGAS
//		PRO.addHEAD(8);
//		PRO.addHEAD(4);
//		PRO.addHEAD(3);
//		PRO.addHEAD(2);
//		PRO.addTail(1);
//		PRO.addTail(9);
//		PRO.tampilElement();
//		System.out.println("\n--Hapus 8---");
//		PRO.removeMid(8);
//		PRO.tampilElement();
//		System.out.println("\n--Hapus 3---");
//		PRO.removeMid(3);
//		PRO.tampilElement();
//		System.out.println("\n--Hapus Tail---");
//		PRO.removeTail();
//		PRO.tampilElement();

//		Pertemuan 6
//		Latihan 1 & 2
//		PRO.addTail(5);
//		PRO.addTail(4);
//		PRO.addTail(6);
//		PRO.tampilElement();
//		System.out.println("");
//		PRO.find(6);

//		Latihan 3 & 4
//		System.out.println("awl");
//		PRO.addHEAD(4);
//		PRO.addHEAD(6);
//		PRO.addHEAD(7);
//		PRO.addTail(2);
//		PRO.addTail(3);
//		PRO.tampilElement();
//		System.out.println("tampil");
//		PRO.size();

	}

}
