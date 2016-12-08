
public class MyThread extends Thread {
	
	public void run(){
		super.run();
		for(int i = 0; i<1000;i++){
			
			System.out.println(i);
		}
	}
}
