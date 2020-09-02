package listtutorial;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		
		System.out.println(map.get(2));	
		System.out.println();

		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " : "+ value);
			
		}
	}

}
