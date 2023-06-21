package p9_Queue;

public class QueueMain {
	public static void main(String[] args) {
		StrukturQueue ASD = new StrukturQueue();
//		Latihan 4

		System.out.println("\n### Sebelun Enqueue ###");
		System.out.println("Size Nya: " + ASD.size());
		System.out.println("IsEmpty nya: " + ASD.isEmpty());

		System.out.println("\n### Enqueue 3x ###");
		System.out.println("Size nya: " + ASD.size());
		System.out.println("IsEmpty nya: " + ASD.isEmpty());
		System.out.println("Front nya: " + ASD.front());

//		Latihan 5
		System.out.println("============================");

		System.out.println("\n### Sebelun Enqueue 2 ###");
		System.out.println("Size Nya: " + ASD.size());
		System.out.println("IsEmpty nya: " + ASD.isEmpty());

		ASD.enqueue(2);
		ASD.enqueue(7);
		ASD.enqueue(6);
		ASD.enqueue(1);

		System.out.println("\n### Enqueue 3x ###");
		System.out.println("Size nya: " + ASD.size());
		System.out.println("IsEmpty nya: " + ASD.isEmpty());
		System.out.print("Element Queue nya: ");
		ASD.tamplElement();
		System.out.println("\nFront nya: " + ASD.front());
		System.out.println("\n===================");

		ASD.dequeue();
		ASD.dequeue();
		ASD.tamplElement();

	}
}
