package p9_Queue;

public class StrukturQueue {
	private Node FRONT, REAR;

	public boolean isEmpty() {
		return FRONT == null;
	}

//	===== tambah Data
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			FRONT = newNode;
			REAR = newNode;
		} else {
			REAR.setNext(newNode);
			REAR = newNode;
		}
	}

//	===== Hapus Data

	public void dequeue() {
		Node temp;

		if (FRONT != null) {
			if (FRONT == REAR) {
				FRONT = null;
				REAR = null;
			} else {
				temp = FRONT;
				FRONT = FRONT.getNext();
			}
		}
	}

//	===== mengembalikan jumlah elemen yang ada di queue
	public int size() {
		int size = 0;
		Node curNode = FRONT;
		while (curNode != null) {
			size++;
			curNode = curNode.getNext();
		}
		return size;
	}

//	===== funsi geser ===== mengembalikan elemen yang ditunjuk oleh penunjuk FRONT
	public int front() {
		return FRONT != null ? FRONT.getData() : -1;
	}

//	===== Fungsi tampil =====
	public void tamplElement() {
		Node curNode = FRONT;
		while (curNode != null) {
			System.out.print(curNode.getData() + " ");
			curNode = curNode.getNext();
		}
	}
}
