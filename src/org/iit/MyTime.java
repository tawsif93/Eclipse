package org.iit;

public class MyTime {

	public int hour , min , second ;

	public MyTime(int h , int m , int s)
	{
		this.hour = h ; 
		this.min = m ;
		this.second = s ;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(hour + ":" + min + ":" + (second < 10 ? "0" +second : second) );
		return sb.toString();
	}
	
	
}
