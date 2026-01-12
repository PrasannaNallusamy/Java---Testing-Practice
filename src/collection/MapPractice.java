package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {

		Map<Integer, String> mp = new LinkedHashMap<Integer, String>();

		mp.put(1, "Sai");
		mp.put(2, "Chandru");
		mp.put(3, "Prasanna");

		System.out.println(mp.keySet());

		System.out.println(mp.values());
		
		System.out.println(mp.get(2));
		
		
		Set <Entry<Integer, String>> s =mp.entrySet();
		
		
		for (Entry<Integer, String> entry : s) {
			
			System.out.println(entry);
		}
	}
}
