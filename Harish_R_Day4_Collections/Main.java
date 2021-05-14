import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Main m=new Main();
		MyArrayList mal=new MyArrayList();
		MyHashSet mhs=new MyHashSet();
		MyGenerics mg=new MyGenerics();
		MyMap mm=new MyMap();
		
		mal.addCountries("India","USA","UK","UAE","Nepal");
		List l=mal.addElemets();
		mal.addMoreElements(l);
		
		Set countries=mhs.SetaddCountries("India","USA","UK","UAE","Nepal");
		Set s=mhs.SetaddElemets();
		mhs.SetaddMoreElements(s);
		
		mg.genricsArrayList(l);
		mg.genericsSet();
		
		Map mp=mm.addValue();
		mm.showValue(mp);
		
		//Foreach loop
		countries.forEach((country) -> { System.out.println(country); });
		
		//Iterator 
		Iterator value = countries.iterator();
		System.out.println("Country names:");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
	}

}
