package org.iit.assignment;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person(20, "Tawsif " , "Fazle");
		Person p2 = new Person(21, "Tawsif " , "Fazle");
		
		if(p1.equals(p2))
		{
			System.out.println("Equal");
		}
		else 
		{
			System.out.println("Not Equal");
		}
	}

}
