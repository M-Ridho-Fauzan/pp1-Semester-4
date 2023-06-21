package p5_remove;

public class StrukturList {
	private Node HEAD = null;
//	private int position;

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
		Node posNode = null, curNode = null;
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
		Node curNode = null;

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

//	public void dispose(Node temp) {
//		temp.next = null;
//		temp = null;
//
//	}
//
//	public void removeHead() {
//		if (isEmpty()) {
//			System.out.println("List kosong");
//		} else {
//			Node temp = HEAD;
//			HEAD = HEAD.getNext();
//			dispose(temp);
//		}
//	}
//
//	void removeMid(int x) {
//		Node preNode = null;
//		Node delNode = null;
//		boolean ketemu = false;
//		int i = 1;
//
//		if (HEAD != null) {
//			delNode = HEAD;
//
//			while (delNode.next != null && !ketemu) {
//				if (delNode.data == x) {
//					ketemu = true;
//				} else {
//					preNode = delNode;
//					delNode = delNode.next;
//					i++;
//				}
//			}
//
//			if (ketemu) {
//				if (i == 1) {
//					HEAD = null;
//				} else {
//					preNode.next = delNode.next;
//					delNode = null;
//				}
//			}
//		}
//	}
//
//	void removeTail() {
//		Node preNode = null;
//		Node lastNode;
//
//		if (HEAD != null) {
//			if (HEAD.getNext() == null) {
//				HEAD = null;
//			} else {
//				lastNode = HEAD;
//				while (lastNode.getNext() != null) {
//					preNode = lastNode;
//					lastNode = lastNode.getNext();
//
//				}
////				Jika salah maka program di bawah akan mengeror kan diri sendiri
//				preNode.setNext(null);
//				dispose(lastNode);
//			}
//		}
//	}

	public void tampilElement() {
		Node curNode = HEAD;
		while (curNode != null) {
			System.out.print(curNode.getData() + " ");
			curNode = curNode.getNext();
		}
	}

	public static void main(String[] args) {
		StrukturList LL = new StrukturList();
//		Latihan 3
//		LL.addHEAD(2);
//		LL.addHEAD(9);
//		LL.addHEAD(7);
//		LL.tampilElement();
//		LL.removeHead();
//		LL.tampilElement();

//		Latihan 4		
//		LL.addHEAD(1);
//		LL.addHEAD(5);
//		LL.addHEAD(3);
//		LL.addHEAD(6);
//		LL.addHEAD(2);
//		LL.tampilElement();
//		System.out.println("");
////		LL.removeTail();
//		LL.tampilElement();
//		System.out.println("");
////		LL.removeHead();
//		LL.tampilElement();

//		TUGAS
		LL.addHEAD(8);
		LL.addHEAD(7);
		LL.addHEAD(3);
		LL.addHEAD(4);
		LL.addTail(1);
		LL.addTail(9);

	}

}
