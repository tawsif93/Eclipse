
public class LockDoor implements IDoor{

	@Override
	public void open() {
		System.out.println("Lock Door opened");
	}

	@Override
	public void close() {
		System.out.println("Lock Door Closed");
	}
	
	
}
