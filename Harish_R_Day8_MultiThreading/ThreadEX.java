import java.lang.Thread;

public class ThreadEX extends Thread{ 

	public void run(){
		for(int i=0;i<=4;i++) {
			System.out.println("Thread 1="+i);
			try {
				ThreadEX.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
