import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static List addCountries(String name1,String name2,String name3,String name4,String name5){
		ArrayList l=new ArrayList();
		l.add(name1);
		l.add(name2);
		l.add(name3);
		l.add(name4);
		l.add(name5);
		return l;
	}
	
	public static List addElemets(){
		List l=new ArrayList();
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
		return l;
	}
	
	public static List addMoreElements(List oldL) {
		for(int i=11;i<=15;i++) {
			oldL.add(i);
		}
		return oldL;
	}
}
