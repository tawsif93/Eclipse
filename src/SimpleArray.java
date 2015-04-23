import java.util.Random;


public class SimpleArray {

	final int []  a ;
	private int writeIndex = 0 ;
	private static Random  r = new Random();
	
	
	public SimpleArray (int size)
	{
		a = new int[size];
	}
	
	public void add(int value)
	{
		int pos = writeIndex; 
		a[pos]= value ;
		
		System.out.println("Writing " + value + " to " + pos + "th Position");
		
		
		try {
			Thread.sleep(Math.abs(r.nextInt() % 1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		++writeIndex;
		
		
		System.out.println("Next write index : " + writeIndex);
	}
}
