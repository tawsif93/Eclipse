package org.iit.assignment;

public class GraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfNode = 5 ;
		
		Graph graph = new Graph(numberOfNode);
		
		graph.addEdge( 0, 1);
		graph.addEdge( 0, 4);
		graph.addEdge( 1, 2);
		graph.addEdge( 1, 3);
		graph.addEdge( 1, 4);
		graph.addEdge( 2, 3);
		graph.addEdge( 3, 4);
		
		graph.printGraph();
		
		System.out.println();
		System.out.println("Read Matrix from File\n");
		
		Graph g = new Graph("/home/tawsif/Desktop/graph.txt");
		g.printGraph();
	}

}
