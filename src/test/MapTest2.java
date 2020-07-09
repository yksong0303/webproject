package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest2 {
	public static void main(String[] args) {
		Map<String,Object> Lol = new HashMap<>();
		Lol.put("name","애쉬");
		Lol.put("power",30);
		Lol.put("defence",50);
		Lol.put("level",10);
		Lol.put("speed",300);
		Iterator<String> iterator = Lol.keySet().iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key+" : "+Lol.get(key));
		}
		
	}

}
