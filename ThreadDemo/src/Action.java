
public class Action implements Runnable {
	private Res r;
	private int j;
	public Action (Res r, int j){
		this.r = r;
		this.j=j;
		
	}
	
	public void run(){
		r.compute(j);
	}
}
