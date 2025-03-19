package collection;

import java.util.HashMap;

public class MapPractice {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("us", "United states");
		map.put("in", "India");
		map.put("br", "Brazil");
		map.put("in", "Indonesia");
		
		System.out.println(map);
		System.out.println(map.get("in"));
		map.put("br", "brunei");
		System.out.println(map.get("br"));
		
	}

}
