
public class Res {
	private int i;
	
	public synchronized void compute(int j){
		
		i = j;
		try {
			this.wait();	
			
			synchronized (this) {
				
				Thread.sleep(20);
				System.out.println(i*2);
				this.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	
	}
}
