package newspaper;

public class WeeklyPaper extends Thread implements Runnable{

	@Override
	public void run() {
		for(int f=1; f<5; f++) {
		System.out.println("the value increases by 1 at a time and delivers the newspaper on weekly basis");
	}
}
}
