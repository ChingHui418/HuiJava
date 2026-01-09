package tw.hui.tutor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hui35 {

	public static void main(String[] args) {
		// Map
		Map<String, Object> maps = new HashMap<>();
		maps.put("name", "Hui");
		maps.put("age", 27);
		maps.put("w", 50);
		maps.put("g", true);
		System.out.println(maps.get("name"));
		System.out.println(maps.get("age"));
		System.out.println("---");
		Set<String> keys = maps.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + maps.get(key));
		}
	}

}
