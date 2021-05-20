public class SyncExMain{
	
	public static void main(String[] args){
		
		PrintThread t1=new PrintThread("Hello","There");
		PrintThread t2=new PrintThread("How are","you");
		PrintThread t3=new PrintThread("Thank you","so much");
		t1.start();
		t2.start();
		t3.start();
	}
}
