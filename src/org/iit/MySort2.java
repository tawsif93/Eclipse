package org.iit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MySort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<MyTime> t = new ArrayList<>();
		
		t.add(new MyTime(10, 55, 14));
		t.add(new MyTime(11, 12, 43));
		t.add(new MyTime(13, 50, 4));
		t.add(new MyTime(10, 55, 42));
		
		for (MyTime myTime : t) {
			System.out.println(myTime);
		}
		
		Collections.sort(t , new MyComperator() );
		
		System.out.println();
		System.out.println(t);
	}

}

class MyComperator implements Comparator<MyTime>
{

	@Override
	public int compare(MyTime o1, MyTime o2) {
		// TODO Auto-generated method stub
		
		if(o1.hour-o2.hour != 0) return o1.hour-o2.hour ;
		else if ( o1.min- o2.min != 0 ) return o1.min- o2.min ;
		else if( o1.second- o2.second  != 0 ) return o1.second- o2.second ;
		
		return 0;
	}
	
}

