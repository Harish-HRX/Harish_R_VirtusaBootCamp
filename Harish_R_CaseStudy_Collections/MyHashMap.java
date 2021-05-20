import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class MyHashMap {
	
	public Map storeCountryCapital(String CountryName, String capital,Map<String,String> m) {
		m.put(CountryName, capital);
		return (HashMap) m;
	}
	public String retrieveCapital(String countryName,Map<String,String> m){
		
		if(m.containsKey(countryName))
			return m.get(countryName).toString();
		else
			return null;
	}
	
	public String retrieveCountry(String capitalName,Map<String,String> m){
		for(Entry<String, String> entry: m.entrySet()) {
		      if(entry.getValue().equals(capitalName)) {
		        return entry.getKey();
		      }
		    }
			return null;
	}
	
	public Map<String, String> switchNames(Map<String,String> m1) {

		Map<String,String> m2=new HashMap<String,String>();
		for (Map.Entry<String, String> pair : m1.entrySet()) {
		    m2.put(pair.getKey(),pair.getValue());   
		}
		return m2;
	}
}
