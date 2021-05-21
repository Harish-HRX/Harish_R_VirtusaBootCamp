import java.util.List;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Harish_R_Collections_Q2 {
	
	public void findTopper(){
		int avg,marks=0,max=0;
		String name="",topper="";
		List l=new ArrayList();
		l.add("arun#155#112#12");
		l.add("deepak#13#12#138");
		l.add("harish#13#12#178");
		
		Pattern p=Pattern.compile("#");
		for (int i = 0;i<l.size(); i++) { 
			String details[]=p.split(l.get(i).toString());
			marks=0;
            for(int j=0;j<=3;j++) {
            	if(j==0) {
            		name=details[0];
            		continue;
            	}
            	marks+=Integer.parseInt(details[j]);
            }
          
            if(marks>max) {
            	max=marks;
            	topper=name;
            }
		}
		System.out.println(topper);
	}
}
