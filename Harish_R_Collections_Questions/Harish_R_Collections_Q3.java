import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Harish_R_Collections_Q3 {
	   
	public void avgOddMark() {
	    	Scanner in=new Scanner(System.in);
			Main m=new Main();	
			Map<Integer,Integer> hm=new HashMap();
			for(int i=1;i<=4;i++) {
				int rnum=in.nextInt();
				int mark=in.nextInt();
				hm.put(rnum,mark);
			}
			int marks=0,count=0;
			for (Map.Entry<Integer,Integer> pair : hm.entrySet()) {
				int n=(int)pair.getKey();
				if(n%2==1) {
					marks+=(int)pair.getValue();
					count++;
				}	
			}
			marks=marks/count;
			System.out.println(marks);
	    }

}
