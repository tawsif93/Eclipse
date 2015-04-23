package org.iit.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;



public class Graph {

	Scanner stdin ;
	ArrayList<Node> node = new ArrayList<>();

	/*
	 *Constructor Read manually not Matrix using addEdge Method
	 */

	public Graph(int nodes) {
		addNode(nodes);
	}

	/*
	 * Constructor to Read from file Matrix
	 */

	public Graph(String location){


		try {
			stdin = new Scanner(new File(location));
			
			addNode(stdin.nextInt());
			readMatrix();
		} 
		catch (FileNotFoundException | NullPointerException e ) {
			System.err.println("File Not Found");
		}
		
	}

	public void readMatrix()
	{
		for (int i = 0; i < node.size()	; i++) 
		{
			for (int j = 0; j < node.size() ; j++) 
			{
				try
				{
					int temp = stdin.nextInt();

					if(temp == 1 ) 
					{	
						if( !node.get(i).nextNode.contains(new Integer(j)) && !node.get(j).nextNode.contains(new Integer(i))) 
						{
							addEdge(i, j);
						}
					}
				}
				catch (NoSuchElementException noSuchElementException)
				{
					System.err.println("1 or 0 not found in Matrix");
				}
			}
		}
	}

	public void addNode(int nodes) {

		for (int i = 0; i < nodes ; i++) {
			node.add(new Node());
		}
	}

	public void addEdge(int current , int next)
	{		
		// Add Edge Current Node to Next node 
		node.get(current).nextNode.add(next);

		//Add Edge Next Node to Current Node	
		node.get(next).nextNode.add(current);
	}

	public void printGraph() {

		for (int i = 0; i < node.size(); i++) {

			System.out.printf("\nAdjacency list of vertex %d ", i);

			System.out.println(node.get(i).nextNode.toString());
		}
	}
}

class Node 
{
	List<Integer> nextNode = new ArrayList<>();
}