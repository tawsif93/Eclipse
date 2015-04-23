import java.util.Random;


public class PrintTask  implements Runnable{

	
	public PrintTask(String taskName)
	{
		this.taskName = taskName ;
	}
	
	String taskName ;
	
	Random randomGenarator = new Random();
	
	@Override
	public void run() {
		int sleep = randomGenarator.nextInt(5000);
		System.out.println(taskName + " goning to sleep for " + sleep);
		
		try {
			java.lang.Thread.sleep(sleep);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End " +  taskName);
	}

	
}
