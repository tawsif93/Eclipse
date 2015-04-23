
public class HandleDoor implements IDoor {

	@Override
	public void open() {
		System.out.println("Handle Door Opened");
	}

	@Override
	public void close() {
		System.out.println("Handle Door closed");		
	}

}
