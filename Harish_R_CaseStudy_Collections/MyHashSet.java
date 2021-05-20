import java.util.Set;

public class MyHashSet {
	
	public Set storeCountryNames(String countryName,Set<String> hs){
		hs.add(countryName);
		return hs;
	}
	
	public String retrieveCountry(String countryName,Set<String> hs){
		if(hs.contains(countryName))
			return countryName;
		else
			return null;
	}
}
