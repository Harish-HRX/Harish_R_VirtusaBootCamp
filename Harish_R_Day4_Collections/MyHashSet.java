
import java.util.*;

public class MyHashSet {
	
	public static Set SetaddCountries(String name1,String name2,String name3,String name4,String name5){
		Set s=new HashSet();
		s.add(name1);
		s.add(name2);
		s.add(name3);
		s.add(name4);
		s.add(name5);
		return s;
	}
	
	public static Set SetaddElemets(){
		Set s=new HashSet();
		for(int i=1;i<=10;i++) {
			s.add(i);
		}
		return s;
	}
	
	public static Set SetaddMoreElements(Set olds) {
		for(int i=11;i<=15;i++) {
			olds.add(i);
		}
		return olds;
	}
	
}
