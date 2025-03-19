package collection;

import java.util.HashMap;

public class CountriesMap {

	public static void main(String[] args) {
		HashMap<String, String> country= new HashMap();
		
		country.put("In", "India");
		country.put("Me", "Mexico");
		country.put("Us", "United states of america");
		country.put("Ca", "Canada");
		
		System.out.println(country);
		System.out.println(country.get("Me"));
		country.put("Us", "United states");
		System.out.println(country);
		
		
	}

}
