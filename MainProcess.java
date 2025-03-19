package ThreadsTests;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainProcess extends Thread implements Runnable{

	public static void main(String[] args){
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Runnable task1 = new SMSAlert();
		Runnable task2 = new PhishingAlert();
		executor.execute(task1);
		executor.execute(task2);
		
	
	}
}