package org.iit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListIteratorDemo {

	public static void main(String[] args) {
		String [] c = { "Red" ,"Green" ,"Blue" , "Yellow" } ;
		
		List <String> colorBank = new ArrayList<>() ;
		
		for (String s : c) {
			colorBank.add(s);
		}
		
		String [] r = { "Red" , "Green" }; 
		
		List<String> removeColor = new ArrayList<>();
		
		for (String s : r) {
			removeColor.add(s);
		}
		
		System.out.println("Befor:");
		System.out.println();
		
		for (int i = 0; i < colorBank.size(); i++) {
			System.out.println(colorBank.get(i));
		}
		
		removeColor(colorBank , removeColor);

		System.out.println();
		System.out.println("After:");
		System.out.println();
		
		for (int i = 0; i < colorBank.size(); i++) {
			System.out.println(colorBank.get(i));
		}
		
	}
	
	
	static void removeColor(List<String> l1 , List<String> l2)
	{
		Iterator it = l1.iterator();
		
		while(it.hasNext())
		{
			if(l2.contains(it.next()))
			{
				it.remove();
			}
		}
	}
}
