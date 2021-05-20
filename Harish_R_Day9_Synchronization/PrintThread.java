
import java.lang.Thread;

public class PrintThread extends Thread{
	String s1;
	String s2;
	
	PrintThread(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
	}
	
	@Override
	public void run() {
			StringPrinter sp=new StringPrinter();
			sp.printer(s1,s2);
	}

}
