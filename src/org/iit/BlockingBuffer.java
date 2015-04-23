package org.iit ;

import java.util.concurrent.ArrayBlockingQueue ;

public class BlockingBuffer implements Buffer {

	ArrayBlockingQueue< Integer>	queue ;

	public BlockingBuffer ( ) {
		// TODO Auto-generated constructor stub
		queue = new ArrayBlockingQueue<>(1) ;
	}

	@Override
	public void write( int a ) {
		// TODO Auto-generated method stub
		try {
			queue.put(a) ;
		} catch ( InterruptedException exception ) {
			// TODO: handle exception
			exception.printStackTrace() ;
		}

	}

	@Override
	public int read() {
		// TODO Auto-generated method stub
		int value = 0 ;
		try {
			value = queue.take() ;
		} catch ( InterruptedException exception ) {
			exception.printStackTrace() ;
		}
		return 0 ;
	}

}
