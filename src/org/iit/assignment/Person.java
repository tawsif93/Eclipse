package org.iit.assignment;

public class Person {

	public int age ;
	public String firstName , lastName ;

	public Person(int age , String first , String last) {
		// TODO Auto-generated constructor stub
		this.age = age ;
		this.firstName = first ;
		this.lastName = last ;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person newPerson = (Person) obj ;
		
		if(age == newPerson.age && firstName.equals(newPerson.firstName) && lastName.equals(newPerson.lastName))
			return true ;
		
		return false;
	}
}
