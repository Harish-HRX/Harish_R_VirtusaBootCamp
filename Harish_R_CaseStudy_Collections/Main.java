import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//ArrayList
		MyArrayList mal=new MyArrayList();
		List<Integer> al=mal.storeEvenNumbers(10);
		al=mal.printEvenNumbers(al);
		System.out.println(al);
		if(mal.retrieveEvenNumber(al,16)==0)
			System.out.println("Element not present\n\n");
		else
			System.out.println("Element present\n\n");
		
		//HashSet
		MyHashSet mh=new MyHashSet();
		Set<String> ms=new HashSet<String>();
		mh.storeCountryNames("India",ms);
		mh.storeCountryNames("USA",ms);
		mh.storeCountryNames("UK",ms);
		System.out.println(ms);
		if((mh.retrieveCountry("USA", ms)).equals(null))
			System.out.println("Country not present\n\n");
		else
			System.out.println("Country present\n\n");
		
		//HashMap
		MyHashMap hm=new MyHashMap();
		Map<String,String> map=new HashMap<String,String>();
		map=hm.storeCountryCapital("India","Delhi",map);
		map=hm.storeCountryCapital("Japan","Tokyo",map);
		map=hm.storeCountryCapital("USA","Washington",map);
		map=hm.storeCountryCapital("UK","London",map);
		System.out.println("Before\n"+map);
		System.out.println(hm.retrieveCapital("USA", map));
		System.out.println(hm.retrieveCountry("Tokyo", map));
		Map<String, String> map2 = hm.switchNames(map);
		System.out.println("After\n"+map2);
	}

}
