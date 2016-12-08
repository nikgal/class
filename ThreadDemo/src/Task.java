
public class Task implements Runnable {
	public void run(){
		
		for(int i = 0; i<200;i++){
			//super.run();
			System.out.println(i);
		}
	}
}
