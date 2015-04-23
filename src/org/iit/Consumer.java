package org.iit ;

import java.util.Random ;

public class Consumer implements Runnable {

	final Buffer	sharedLocation ;
	final Random	random	= new Random() ;

	public Consumer ( Buffer a ) {
		// TODO Auto-generated constructor stub
		sharedLocation = a ;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum = 0 ;

		try {

			Thread.sleep(random.nextInt(3000)) ;

		} catch ( InterruptedException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace() ;
		}

		for (int i = 1; i <= 10; i++) {
			int value = sharedLocation.read() ;

			System.out.printf("\t\t\t" + value) ;

			sum += value ;

			System.out.println("\t" + sum) ;
		}

		System.out.println("Consumer done") ;
	}

}
