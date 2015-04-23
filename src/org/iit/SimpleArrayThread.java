package org.iit ;

import java.util.Arrays ;
import java.util.Random ;

public class SimpleArrayThread {

	final int[]	a ;
	int			writeIndex	= 0 ;
	Random		r			= new Random() ;

	public SimpleArrayThread ( int size ) {
		// TODO Auto-generated constructor stub
		a = new int[size] ;
	}

	public void add( int value ) {

		int position = writeIndex ;

		try
		{
			Thread.sleep(r.nextInt(5000)) ;
		} catch ( InterruptedException e )
		{
			// TODO: handle exception
			e.printStackTrace() ;
		}

		a[position] = value ;
		writeIndex++ ;

		System.out.println(Thread.currentThread().getName() + " wrote " + value
				+ " in position " + (writeIndex - 1)) ;

		System.out.println("Next Position " + writeIndex) ;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Content of Array : " + Arrays.toString(a) ;
	}

}
