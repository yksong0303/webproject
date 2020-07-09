package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ListTest6 {
	public static void main(String[] args) {
		List<Food> FoodList = new ArrayList<>();
		String[] locales = {"한식","중식","일식","분식","경양식","양식"};
		Random r = new Random();
		for(int i=1;i<=30;i++) {
			Food f = new Food();
			f.setLocale(locales[r.nextInt(locales.length)]);
			f.setName("음식"+i);
			f.setPrice((r.nextInt(10)+1)*1000);
			FoodList.add(f);
		}
		List<Food> lList = new ArrayList<Food>();
		List<Food> hList = new ArrayList<Food>();
		int min = 10000;
		int max = 0;
		for(int i=0;i<FoodList.size();i++) {
			Food fd = FoodList.get(i);
			System.out.println(fd);
			if(max<fd.getPrice()) {
				max = fd.getPrice();
			}
			if(min>fd.getPrice()) {
				min = fd.getPrice();
			}	
		}
		for(int i=0;i<FoodList.size();i++) {
			Food f = FoodList.get(i);
			
			if(max==f.getPrice()) {
				hList.add(f);
				
			}
			if(min==f.getPrice()) {
				lList.add(f);
			}
		}
		Map<String,Integer> map = new HashMap<>();
			for(Food f : FoodList) {
				if(!map.containsKey(f.getLocale())) {
					map.put(f.getLocale(), 1);
				}else {
					map.put(f.getLocale(),map.get(f.getLocale())+1);
				}
			}
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				
			}
	
	}

}