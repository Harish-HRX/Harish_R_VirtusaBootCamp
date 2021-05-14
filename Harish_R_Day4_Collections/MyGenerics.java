import java.util.*;

public class MyGenerics {
	
	
	public List genricsArrayList(List l) {
		List<Integer> newL=new ArrayList<Integer>();
		for(int i=0;i<l.size();i++) {
			newL.add((Integer)l.get(i));
		}
		return newL;
	}
	
	public static Set genericsSet(){
		Set<Integer> s=new HashSet<Integer>();
		for(int i=1;i<=10;i++) {
			s.add(i);
		}
		return s;
	}
}
