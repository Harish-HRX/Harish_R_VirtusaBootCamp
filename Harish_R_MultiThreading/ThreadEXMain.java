
public class ThreadEXMain {

	public static void main(String[] args){
		
		ThreadEX mt=new ThreadEX();
		mt.start();
		
		System.out.println(mt.getPriority());
		mt.setPriority(6);
		System.out.println(mt.getPriority());
		System.out.println(mt.getName());
		mt.setName("MyThread");
		System.out.println(mt.getName());
		
		ThreadRunnableEX rt=new ThreadRunnableEX();
		Thread t=new Thread(rt);
		t.start();
		
		try {
			t.join();
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread");
	}

}
