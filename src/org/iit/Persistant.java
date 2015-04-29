package org.iit ;

import java.io.BufferedWriter ;
import java.io.File ;
import java.io.FileNotFoundException ;
import java.io.FileWriter ;
import java.io.IOException ;
import java.io.PrintWriter ;
import java.util.Scanner ;

public class Persistant {

	Person[]	persons	= new Person[3] ;

	public Persistant ( ) {
		// TODO Auto-generated constructor stub

		persons[0] = new Person(1, "Tawsif", 601) ;
		persons[1] = new Person(2, "Maruf", 621) ;
		persons[2] = new Person(3, "mufa", 620) ;

	}

	public void writeFile() throws IOException {
		File file = new File("alimvai.txt") ;

		BufferedWriter bw = new BufferedWriter(new FileWriter(file, true)) ;

		PrintWriter pw = new PrintWriter(bw) ;

		for (Person person : persons)
			pw.print("" + person.roll + " " + person.name + " " + person.id
					+ "\n") ;

		pw.close() ;

		System.out.println("Write Complete") ;
	}

	public void readFile() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("alimvai.txt")) ;

		while (scanner.hasNextLine())
		{
			String s = scanner.nextLine() ;
			String[] array = s.split(" ") ;

			for (String element : array)
				System.out.print(element + " ") ;

			System.out.println() ;
		}
		System.out.println("Read Complete") ;
	}

}

class Person {

	int		roll ;
	String	name ;
	int		id ;

	public Person ( int roll , String name , int id ) {
		super() ;
		this.roll = roll ;
		this.name = name ;
		this.id = id ;
	}
}
