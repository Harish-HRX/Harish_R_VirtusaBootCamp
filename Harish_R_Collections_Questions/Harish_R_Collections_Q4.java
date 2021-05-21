import java.util.HashMap;
import java.util.Map;

public class Harish_R_Collections_Q4 {
	
	public void stateList() {
	    	String sarr[]= {"goa","kerela","gujarat"};
	    	String f_name="";
	    	Map<String,String> hm=new HashMap<>();
	    	for(int i=0;i<sarr.length;i++) {
	    		f_name=sarr[i].substring(0, 3);
	    		hm.put(f_name.toUpperCase(),sarr[i].toLowerCase());
	    		System.out.println();
	    	}
	    	System.out.println(hm);
	    }
}
