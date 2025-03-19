package ThreadsTests;

public class PhishingAlert extends Thread implements Runnable{

	@Override
	public void run() {
		for (int j=0; j<3; j++) {
			System.out.println("this is the phishing alert");
		}
	}
	

}
