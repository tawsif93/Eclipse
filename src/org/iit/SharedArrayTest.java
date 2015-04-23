package org.iit ;

import java.util.concurrent.ExecutorService ;
import java.util.concurrent.Executors ;
import java.util.concurrent.TimeUnit ;

public class SharedArrayTest {

	public static void main( String[] args ) {
		// TODO Auto-generated method stub

		SimpleArrayThread array = new SimpleArrayThread(6) ;

		ExecutorService service = Executors.newCachedThreadPool() ;

		ArrayWriterThread arrayWriterThread = new ArrayWriterThread(array, 1) ;
		ArrayWriterThread arrayWriterThread2 = new ArrayWriterThread(array, 10) ;

		service.execute(arrayWriterThread) ;
		service.execute(arrayWriterThread2) ;

		service.shutdown() ;

		boolean end = false ;

		try {
			end = service.awaitTermination(1, TimeUnit.MINUTES) ;
		} catch ( InterruptedException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace() ;
		}

		if (end)
			System.out.println("Completed") ;
	}

}
