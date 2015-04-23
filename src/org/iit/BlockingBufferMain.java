package org.iit ;

import java.util.concurrent.ExecutorService ;
import java.util.concurrent.Executors ;

public class BlockingBufferMain {

	public static void main( String[] args ) {
		// TODO Auto-generated method stub
		Buffer b = new BlockingBuffer() ;

		Producer p = new Producer(b) ;

		Consumer c = new Consumer(b) ;

		System.out.println("\tvalue\tsum\tread\tsum") ;

		ExecutorService service = Executors.newCachedThreadPool() ;

		service.execute(p) ;
		service.execute(c) ;

	}

}
