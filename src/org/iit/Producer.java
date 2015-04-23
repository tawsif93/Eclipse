package org.iit ;

import java.util.Random ;

public class Producer implements Runnable {

	final Buffer	sharedLocation ;
	final Random	random	= new Random() ;

	public Producer ( Buffer a ) {
		// TODO Auto-generated constructor stub
		sharedLocation = a ;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum = 0 ;

		for (int i = 1; i <= 10; i++) {
			try {

				Thread.sleep(random.nextInt(3000)) ;

			} catch ( InterruptedException e ) {
				// TODO Auto-generated catch block
				e.printStackTrace() ;
			}
			System.out.printf("\t" + i) ;

			sharedLocation.write(i) ;
			sum += i ;
			System.out.println("\t" + sum) ;
		}

		System.out.println("Producer had Done producing") ;
	}
}
