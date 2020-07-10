package test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMapTest {
	public static void main(String[] args) {
		Map<String,String> map = new LinkedHashMap<>(); //순서대로 나오는 맵, 순서는없지만 순서가있음?
		map.put("4","4");
		map.put("3","4");
		map.put("2","4");
		map.put("1","4");
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(key);
			
		}
	}
}
