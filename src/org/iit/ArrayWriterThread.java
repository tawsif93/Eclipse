package org.iit ;

public class ArrayWriterThread implements Runnable {

	final SimpleArrayThread	array ;
	final int				startValue ;

	public ArrayWriterThread ( SimpleArrayThread array , int value ) {
		// TODO Auto-generated constructor stub

		this.array = array ;
		startValue = value ;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = startValue; i < (startValue + 3); i++)
			array.add(i) ;
	}

}
