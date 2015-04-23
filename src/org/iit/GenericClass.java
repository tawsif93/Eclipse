package org.iit;

import java.util.Scanner;

public class GenericClass {

	Scanner stdin = new Scanner(System.in);
	
	Integer[] intArray = new Integer[10];
	String [] stringArray = new String[5];
	
	public void inputInteger()
	{
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = stdin.nextInt() ;
		}
	}
	
	public void stringInput() {
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = stdin.nextLine();
		}
	}
	
	
}
