package org.iit ;

public class MySynchronisedBuffer implements Buffer {
	private int		buffer		= -1 ;
	private boolean	occupied	= false ;

	@Override
	public synchronized void write( int value ) {
		while (occupied)
		{
			System.out.println("Producer tries to write.") ;
			displayState("Buffer full. Producer waits.") ;
			try
			{
				wait() ;
			} catch ( InterruptedException e )
			{
				// TODO Auto-generated catch block
				e.printStackTrace() ;
			}
		}
		buffer = value ;

		occupied = true ;

		displayState("Producer writes " + buffer) ;

		notifyAll() ;
	}

	@Override
	public synchronized int read() {
		while (!occupied)
		{
			System.out.println("Consumer tries to read.") ;
			displayState("Buffer empty. Consumer waits.") ;
			try
			{
				wait() ;
			} catch ( InterruptedException e )
			{
				// TODO Auto-generated catch block
				e.printStackTrace() ;
			}
		}
		occupied = false ;

		displayState("Consumer reads " + buffer) ;

		notifyAll() ;

		return buffer ;
	}

	public void displayState( String operation ) {
		System.out.printf("%-40s%d\t\t%b\n\n", operation, buffer, occupied) ;
	}
}
