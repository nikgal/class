
public class Res {
	private int i;
	
	public synchronized void compute(int j){
		i = j;
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i*2);
	}
}
