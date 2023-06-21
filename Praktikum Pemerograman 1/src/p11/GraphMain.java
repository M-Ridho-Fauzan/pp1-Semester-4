package p11;

public class GraphMain {
	public static void main(String[] args) {
		Graph graph = new Graph(5);
		// menambah vertex
		graph.addVertex('A'); // 0 (start for dfs)
		graph.addVertex('B'); // 1
		graph.addVertex('C'); // 2
		graph.addVertex('D'); // 3
		graph.addVertex('E'); // 4
		// MENAMBAH EDGE
		graph.addEdge(0, 1); // AB
		graph.addEdge(1, 2); // BC
		graph.addEdge(0, 3); // AD
		graph.addEdge(3, 4); // DE
		graph.adjacencyMatrix();
		System.out.println();

		System.out.println("\n============================\n");

		Graph graph2 = new Graph(4);
		graph2.addVertex('A'); // 0 (start for dfs)
		graph2.addVertex('B'); // 1
		graph2.addVertex('C'); // 2
		graph2.addVertex('D'); // 3
		// MENAMBAH EDGE
		graph2.addEdge(0, 1); // AB
		graph2.addEdge(1, 3); // BD
		graph2.addEdge(0, 3); // DA
		graph2.addEdge(0, 2); // AC
		graph2.adjacencyMatrix();
		System.out.println();

//		   A B C D
//		   _______
//		A |0 1 1 1|
//		B |1 0 0 1|
//		C |1 0 0 0|
//		D |1 1 0 0|
//		  ---------
	}
}
