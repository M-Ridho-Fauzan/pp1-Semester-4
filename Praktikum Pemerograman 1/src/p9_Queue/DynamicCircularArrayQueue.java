package p9_Queue;

import java.util.Scanner;

public class DynamicCircularArrayQueue {
	private int[] queueArray; // data
	private int capacity; // kapasitas
	private int front;
	private int rear;
	private int size;

	// Konstruktor
	public DynamicCircularArrayQueue(int capacity) {
		this.capacity = capacity;
		queueArray = new int[capacity];
		front = 0; // depan
		rear = -1;// belakang
		size = 0;// ukuran
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}

	public int size() {
		return size;
	}

	public void enqueue(int data) {
		if (isFull()) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Antrian sudah penuh!");
			System.out.print("Ingin menambah antrian? (ya/tidak): ");
			String response = scanner.nextLine();

			if (response.equalsIgnoreCase("ya")) {
				System.out.print("Masukkan ukuran baru: ");
				int newSize = scanner.nextInt();
				setSize(newSize);
			} else {
				System.err.println("Data gagal ditambahkan");
				return; // Jika tidak ingin menambah antrian, keluar dari metode enqueue
			}
		}

		rear = (rear + 1) % capacity;
		queueArray[rear] = data;
		size++;
		System.out.println("Data berhasil ditambahkan");

		if (isEmpty()) {
			front = rear;
		}
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Antrian kosong.");
			return -1;
		}

		int removedData = queueArray[front];
		front = (front + 1) % capacity;
		size--;

		return removedData;
	}

	public int front() {
		if (isEmpty()) {
			System.out.println("Antrian kosong.");
//			return -1;
		}

		return queueArray[front];
	}

	// ===== v: 1
//	public void tamplElement() {
//		if (isEmpty()) {
//			System.out.println("Antrian kosong.");
//			return;
//		}
//
//		int current = front;
//		for (int i = 0; i < size; i++) {
//			System.out.print(queueArray[current] + " ");
//			current = (current + 1) % capacity;
//		}
//		System.out.println();
//	}

	// ============== v: 2
	public void tamplElement() {
		if (isEmpty()) {
			System.out.println("Antrian kosong.");
			return;
		}

		for (int i = 0; i < size; i++) {
			int index = (front + i) % capacity;
			System.out.println("Index: " + index);
			System.out.println("Elemen: " + queueArray[index]);
		}
		System.out.println();
	}

//	fungsi perpanjang kapasitas jika penuh
//	private void expandCapacity() {
//		int newCapacity = capacity * 2;
//		int[] newQueueArray = new int[newCapacity];
//
//		int current = front;
//		for (int i = 0; i < size; i++) {
//			newQueueArray[i] = queueArray[current];
//			current = (current + 1) % capacity;
//		}
//
//		queueArray = newQueueArray;
//		capacity = newCapacity;
//		front = 0;
//		rear = size - 1;
//	}

	// ========== atau

	public void setSize(int newSize) {
		if (newSize <= size) {
			System.out.println("Ukuran baru harus lebih besar dari ukuran saat ini.");
			return;
		}

		int[] newQueueArray = new int[newSize];

		int current = front;
		for (int i = 0; i < size; i++) {
			newQueueArray[i] = queueArray[current];
			current = (current + 1) % capacity;
		}

//	    queueArray = newQueueArray;
//	    capacity = newSize;
//	    front = 0;
//	    rear = size - 1;
//	    === atau 

		queueArray = newQueueArray;
		capacity = newSize;
		front = 0;
		rear = size - 1;
		size = newSize; // Tambahkan 1 ke ukuran
	}

	public static void main(String[] args) {
		DynamicCircularArrayQueue queue = new DynamicCircularArrayQueue(5);
		System.out.println("====== Ukuran Data: 5 yang berarti 0, 1, 2, 3, 4 ");
		System.out.println("\n==== belum di lakukan operasi enqueue");
		System.out.println("Front: " + queue.front());
		System.out.println("IsEmpty: " + queue.isEmpty());
		System.out.println("Size: " + queue.size());

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		System.out.println("\n==== telah di enqueue 1, 2, 3, 4, 5 ");

		Scanner input = new Scanner(System.in);
		int pilihan;

		do {
			System.out.println("Front: " + queue.front());
			System.out.println("IsEmpty: " + queue.isEmpty());
			System.out.println("Size: " + queue.size());
			System.out.println("=============================");
			System.out.println("Menu:");
			System.out.println("1. Tambah data");
			System.out.println("2. Hapus data");
			System.out.println("3. Ubah ukuran");
			System.out.println("4. Keluar");
			System.out.print("Pilih menu: ");
			pilihan = input.nextInt();

			switch (pilihan) {
			case 1:
				// menambahkan
				System.out.print("Tambahkan data: ");
				int tambahData = input.nextInt();
				queue.enqueue(tambahData);
				queue.front();
				break;
			case 2:
				// Menghapus
				System.out.print("Hapus data: ");
				queue.dequeue();
				System.out.println("Data berhasil dihapus");
				queue.front();
				break;
			case 3:
				System.out.println("Ukuran saat ini: " + queue.size());
				System.out.print("Tambahkan ukuran: ");
				int tbhUkuran = input.nextInt();
				queue.setSize(tbhUkuran);
				System.out.println("Ukuran berhasil ditambahkan");
				System.out.println("Ukuran saat ini: " + queue.size());
				break;
			case 4:
				System.out.println("Keluar dari program.");
				break;
			default:
				System.err.println("Pilihan tidak valid");
				break;
			}
			queue.tamplElement();
		} while (pilihan != 4);

//		System.out.println("\n==== Dicek");
//		System.out.println("IsEmpty: " + queue.isEmpty());
//		System.out.println("Size: " + queue.size());
//		System.out.println("Front: " + queue.front());
//		System.out.println(" === bts ===");
////		System.out.print("Queue: ");
//		queue.tamplElement();
//
//		queue.enqueue(6);
//		System.out.println("\n==== telah di enqueue lagi: 6");
//
//		System.out.println("\n==== Dicek");
//		System.out.println("IsEmpty: " + queue.isEmpty());
//		System.out.println("Size: " + queue.size());
//		System.out.println("Front: " + queue.front());
//		System.out.println(" === bts ===");
////		System.out.print("Queue: ");
//		queue.tamplElement();
//
//		queue.dequeue();
//		queue.dequeue();
//		System.out.println("\n==== telah di dequeue 2x");
//
//		System.out.println("\n==== Dicek");
//		System.out.println("IsEmpty: " + queue.isEmpty());
//		System.out.println("Size: " + queue.size());
//		System.out.println("Front: " + queue.front());
//		System.out.println(" === bts ===");
////		System.out.print("Queue: ");
//		queue.tamplElement();
//
//		queue.enqueue(7);
//		System.out.println("\n==== telah di enqueue lagi: 7");
//
//		System.out.println("\n==== Dicek");
//		System.out.println("IsEmpty: " + queue.isEmpty());
//		System.out.println("Size: " + queue.size());
//		System.out.println("Front: " + queue.front());
//		System.out.println(" === bts ===");
////		System.out.print("Queue: ");
//		queue.tamplElement();
//
//		queue.enqueue(8);
//		System.out.println("\n==== telah di enqueue lagi: 8");
//
//		System.out.println("\n==== Dicek");
//		System.out.println("IsEmpty: " + queue.isEmpty());
//		System.out.println("Size: " + queue.size());
//		System.out.println("Front: " + queue.front());
//		System.out.println(" === bts ===");
////		System.out.print("Queue: ");
//		queue.tamplElement();

	}
}
