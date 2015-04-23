
public class MyMain {

	public static void main(String[] args) {
		Builder b = new Builder();
		b.addDoor(new LockDoor());
		b.addDoor(new HandleDoor());
	}

}
