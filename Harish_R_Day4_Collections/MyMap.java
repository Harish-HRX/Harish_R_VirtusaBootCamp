
import java.util.*;

public class MyMap {
	
	
	public static Map addValue() {
		Map m=new HashMap();
		m.put(1,"aa");
		m.put(2,"bb");
		m.put(3,"cc");
		m.put(4,"dd");
		m.put(5,"ee");
		return m;
	}
	
	public static Map showValue(Map hm) {
		Iterator <Integer> it = hm.keySet().iterator();  
		while(it.hasNext())  
		{  
			int key=(int)it.next();  
			System.out.println("Roll no.: "+key+"     name: "+hm.get(key)); 
		}
		return hm;
	}
}
