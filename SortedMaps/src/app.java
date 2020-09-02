import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class app {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer,String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer,String>();
		Map<Integer, String> treeMap = new TreeMap<Integer,String>();
		
		testmap(treeMap);
		
	}

	public static void testmap (Map<Integer, String> map) {
		
		map.put(3, "Three");
		map.put(2, "Two");
		map.put(7, "Seven");
		map.put(5, "Five");
		
		for(Integer Key : map.keySet()){
			
			String value = map.get(Key);
			
			System.out.println( Key + " "+ value);
			
			
		}
		}
		
	}

