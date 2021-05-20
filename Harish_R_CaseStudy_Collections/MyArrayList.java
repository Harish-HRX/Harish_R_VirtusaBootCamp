import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MyArrayList {
	
	public List storeEvenNumbers(int n){
		List<Integer> l=new ArrayList<Integer>();
		for(int i=2;i<=n;i=i+2) {
			l.add(i);
		}
		return l;
	}
	public List printEvenNumbers(List l){
	    
		int temp,i=0;
		for (i=0;i<l.size();i++) {
			temp=(int)l.get(i);
			l.set(i,temp*2);        
	    }
		 return l; 
	 }

	public int retrieveEvenNumber(List l,int N){
		 if(l.contains(N))
			 return N;
		 else
			 return 0;
	 }
}
