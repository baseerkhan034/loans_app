package newspaper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainProcess extends Thread implements Runnable{

	public static void main(String[] args) {
		

	ExecutorService executor=Executors.newSingleThreadExecutor();
	Runnable task1 = new Dailypaper();
	Runnable task2 = new WeeklyPaper();
	
	executor.execute(task1);
	executor.execute(task2);
	
}
	/*
	first step create a package and then create the classes followed by extends Thread and implements Runnable
	used @Override annotation
	use the public void run() method followed by 
	for(int i=0; i<some value; i++){
	system.out.println("statement");
	
	do the above process for the diffrent n number of classes
	
	ExecutorService executor = Executor.newSingleLineExceutor();
	Runnable task1 (as an class)= new classname();
	Runnable task2 (as an class)= new classname2()
	
	executor.execute(task1);
	}
	*/
}