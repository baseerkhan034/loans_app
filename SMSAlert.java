package ThreadsTests;

public class SMSAlert extends Thread implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
		System.out.println("this is the sample examples to send the msg");
	}
	}

}
