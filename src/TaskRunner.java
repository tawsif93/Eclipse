import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TaskRunner {

	public static void main(String[] args) {

		PrintTask t1 = new PrintTask("Task 1 ");
		PrintTask t2 = new PrintTask("Task 2 ");
		PrintTask t3 = new PrintTask("Task 3 ");
		PrintTask t4 = new PrintTask("Task 4 ");

		

		ExecutorService t = Executors.newCachedThreadPool();

		t.execute(t1);
		t.execute(t2);
		t.execute(t3);

		System.out.println("main Ends");
		//		java.lang.Thread tt2 = new Thread(t2);
		//		java.lang.Thread tt3 = new Thread(t3);
		//		java.lang.Thread tt4 = new Thread(t4);

	}

}
