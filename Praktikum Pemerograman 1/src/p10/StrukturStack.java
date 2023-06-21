package p10;

public class StrukturStack {

//	Latihan 2

	private int[] array;
	private int capacity;
	private int TOP;
//	private int data;

	protected final int MIN = -1;

	public void Stack(int capacity) {
		array = new int[capacity];
		this.capacity = capacity;
		TOP = MIN;
	}

	public boolean isEmpty() {
		return (TOP == MIN);
	}

	public boolean isFull() {
		return TOP == capacity - 1;
	}

	public int size() {
		return TOP == -1 ? 0 : TOP + 1;
	}

	protected int TOP() {
		return TOP == -1 ? array[TOP] : 1;
	}

//	Latihan 1

	protected void push(int data) {
		if (isFull()) {
			System.out.println("Stack penuh");
		} else {
			TOP++;
			array[TOP] = data;
			System.out.println("push: " + data);
		}
		size();
	}

//	void push(int data) {
////		this.array;
//
//		if (isFull()) {
//			System.out.println("Stack Penuh");
//		} else {
//			TOP++;
//			array[TOP] = data;
//			System.out.println("Data sudah tersimpan");
//		}
//		size();
//	}

	protected int pop() {
		int temp = 0;

		if (isEmpty()) {
			System.out.println("Setak kosong");
		} else {
			temp = array[TOP];
			TOP = TOP--;
		}
		return temp;
	}

	public void tampilElement() {
		System.out.println("Element Setak: ");
		if (isEmpty()) {
			System.err.println("List kosong");
		} else {
			System.out.print("[ ");
			for (int i = TOP; i >= 0; i--) {
				System.out.print(array[i] + " ");
			}
			System.out.println(" ]");
		}
	}
}
