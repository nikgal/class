import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		Res r = new Res();
		Action ac1 = new Action(r, 4);
		Action ac2 = new Action(r, 789);
		
		Thread t1 = new Thread(ac1);
		Thread t2 = new Thread(ac2);
		
		t1.start();
		t2.start();
		
	

	}

}
