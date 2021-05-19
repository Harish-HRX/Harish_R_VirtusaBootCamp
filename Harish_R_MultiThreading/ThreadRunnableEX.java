
public class ThreadRunnableEX implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=9;i++) {
			System.out.println("thread-2="+i);
		}
		
	}

}
