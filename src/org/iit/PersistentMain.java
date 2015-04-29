package org.iit ;

import java.io.IOException ;

public class PersistentMain {

	public static void main( String[] args ) throws IOException {
		// TODO Auto-generated method stub

		Persistant persistant = new Persistant() ;
		persistant.writeFile() ;
		persistant.readFile() ;
	}

}
