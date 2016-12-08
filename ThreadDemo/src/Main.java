
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread thread = new MyThread();
		Thread thread2 = new Thread(new Task());
		
		thread.start();
		
		thread.join();
		
		thread2.start();
		thread2.join();

	}

}
