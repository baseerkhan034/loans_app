package newspaper;

public class Dailypaper extends Thread implements Runnable{

	
	@Override
	public void run() {
		for(int j=1; j<6; j++) {
		System.out.println("this is the daily newspaper for the customers");
	}
}
}
