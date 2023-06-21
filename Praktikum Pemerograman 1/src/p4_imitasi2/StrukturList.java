package p4_imitasi2;

public class StrukturList {
	Node head;

	boolean isEmpty() {
		return (head == null);
	}

//	===============

	void tambahDepan(double dataBaru) {
		Node tambahData = new Node(dataBaru);
		tambahData.setData(dataBaru);
		tambahData.setNext(null);
		if (isEmpty()) {
			head = tambahData;
		} else {
			tambahData.setNext(head);
			head = tambahData;
		}
	}

//	===============

	public void addMid(double data, int position) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node curNode = head;

			if (position == 1) {
				newNode.setNext(curNode);
				head = newNode;
			} else {
				Node posNode = null;
				int i = 1;

				while (curNode != null && i < position) {
					posNode = curNode;
					curNode = curNode.getNext();
					i++;
				}

				posNode.setNext(newNode);
				newNode.setNext(curNode);
			}
		}
	}

//	===============

	void tambahAkhir(double dataBaru) {
		Node tambahData = new Node(dataBaru);
		tambahData.setData(dataBaru);
		tambahData.setNext(null);
		if (isEmpty()) {
			head = tambahData;
		} else {
			Node bantu = head;
			while (bantu.getNext() != null) {
				bantu = bantu.getNext();
			}
			bantu.setNext(tambahData);
		}
	}

//	================

	void tampilData() {
		Node posisi = head;
		if (isEmpty()) {
			System.err.println("Data masih kosong !!");
		} else {
			System.out.print("Data nya Adalah: " + "\n");
			while (posisi != null) {
				System.out.print(posisi.getData() + ", ");
				posisi = posisi.getNext();
			}
		}
	}
}
