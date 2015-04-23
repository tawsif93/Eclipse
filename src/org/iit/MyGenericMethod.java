package org.iit;

public class MyGenericMethod extends Object{

	
	public static void main(String[] args) {
		
		Integer[] a = { 1 , 2 , 3 } ;
		String [] b = { "a" , "v" , "s" } ;
		
		printArray(a);
		System.out.println();
		printArray(b);
	}
	
	public static <E> void printArray(E[] a)
	{
		for (E e : a) {
			System.out.printf("%s " , e.toString());
		}
	}
	
	public static <T extends Comparable<T>> T maximum (T a , T b , T c)
	{
		T max = a ;
		
		if(max.compareTo(b) < 0 ) max = b ;

		if(max.compareTo(c) < 0 ) max = c ;
		
		return max ;
	}
}

