package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest3 {

	public static void main(String[] args) {
//		Map<Object,Integer> map = new HashMap<>();
//		map.put(123,22);
//		map.put("ㅋㅋ",Integer.parseInt("123"));
//		map.put(0.01,555);
//		
//		Iterator<Object> iterator = map.keySet().iterator();
//		while(iterator.hasNext()){
//			Object key = iterator.next();
//			System.out.println(key+" : "+map.get(key));
//		}
		Map<String, Integer> mapTest = new HashMap<String, Integer>();
		mapTest.put("가",1);
		mapTest.put("나",2);
		mapTest.put("다",3);
		
		Iterator<String> iterator = mapTest.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key+" : "+mapTest.get(key));
			
		}
	}
} 
