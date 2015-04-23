package org.iit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySort {

	public static void main(String[] args) {
		
		
		String [] c = {"Red" , "Green" , "Blue" , "Yellow"};
		
		List<String> colorBank = new ArrayList<>();
		
		for (String s : c) {
			colorBank.add(s);
		}
		
		System.out.println(colorBank);
		System.out.println();
		
		Collections.sort(colorBank);
		
		System.out.println(colorBank);
		System.out.println();
		
		Collections.sort(colorBank  , Collections.reverseOrder());
		
		System.out.println(colorBank);
		System.out.println();
		
		
		
	}

}
