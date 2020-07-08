package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("1");
		strList.add("22");
		strList.add("33");
		System.out.println(strList.size());
		Map<String,String> map = new HashMap<>();
		map.put("0","1");
		map.put("1","2");
		map.put("2","3");
		Iterator<String> keys = map.keySet().iterator(); //외우기
		while(keys.hasNext()) {
			String key = keys.next();
			String value = map.get(key);
			System.out.println(key+","+value);
		}
	}

}
