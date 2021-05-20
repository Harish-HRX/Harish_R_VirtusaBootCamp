import java.lang.Thread;

public class StringPrinter extends Thread{

	public synchronized void printer(String s1,String s2){
		System.out.println(s1+" "+s2);
	}
	
}
