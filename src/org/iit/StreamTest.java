package org.iit ;

import java.io.File ;
import java.io.FileDescriptor ;
import java.io.FileNotFoundException ;
import java.io.FileOutputStream ;
import java.io.PrintStream ;

public class StreamTest {

	public static void main( String[] args ) {
		// TODO Auto-generated method stub

		try
		{
			System.setOut(new PrintStream(new FileOutputStream(new File(
					"sss.sh")))) ;

			System.out
			.println(new FileOutputStream(
					new File(
							"/home/tawsif/workspace/OOP2/src/org/iit/SimpleArrayThread.java"))) ;

			System.setOut(new PrintStream(new FileOutputStream(
					FileDescriptor.out))) ;

			System.out.println("pass") ;
		} catch ( FileNotFoundException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace() ;
		}
		// System.
	}

}
