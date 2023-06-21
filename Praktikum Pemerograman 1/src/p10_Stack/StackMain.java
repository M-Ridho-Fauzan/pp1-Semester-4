package p10_Stack;

public class StackMain {
	public static void main(String[] args) {
		StrukturStack ASD = new StrukturStack(3);

		System.out.println("\n# Melakukan push 3x: ");
		ASD.push(3);
		ASD.push(2);
		ASD.push(1);

		// Latihan 4
		System.out.println("\n\n### Sebelum push 3x ###");
		System.out.println("size: " + ASD.size());
		System.out.println("isEmpty: " + ASD.isEmpty());
		System.out.println("isFull: " + ASD.isFull());
		System.out.println("Top: " + ASD.top());
		ASD.displayElement();

		// Latihan 4
		System.out.println("\n# Melakukan push 3x: ");
		ASD.push(2);
		ASD.push(4);
		ASD.push(1);

		// Latihan 4
		System.out.println("\nsize: " + ASD.size());
		System.out.println("isEmpty: " + ASD.isEmpty());
		System.out.println("isFull: " + ASD.isFull());
		System.out.println("Top: " + ASD.top());
		ASD.displayElement();

		ASD = new StrukturStack(3);

		System.out.println();

		// Tugas
		System.out.println("### Sebelum push 3x ###");
		System.out.println("size: " + ASD.size());
		System.out.println("isEmpty: " + ASD.isEmpty());
		System.out.println("isFull: " + ASD.isFull());
		System.out.println("Top: " + ASD.top());

		// Tugas
		System.out.println("\n# Melakukan push 3x: ");
		ASD.push(2);
		ASD.push(4);
		ASD.push(1);

		// Tugas
		System.out.println("\nsize: " + ASD.size());
		System.out.println("isEmpty: " + ASD.isEmpty());
		System.out.println("isFull: " + ASD.isFull());
		System.out.println("Top: " + ASD.top());
		ASD.displayElement();

		// Tugas
		ASD.pop();
		ASD.pop();
		ASD.pop();

		// Tugas
		System.out.println("\n### Sesudah pop 3x ###");
		System.out.println("size: " + ASD.size());
		System.out.println("isEmpty: " + ASD.isEmpty());
		System.out.println("isFull: " + ASD.isFull());
		System.out.println("Top: " + ASD.top());
		ASD.displayElement();
	}
}
