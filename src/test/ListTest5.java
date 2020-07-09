package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest5 {
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
		int[] fds = new int[6];
		for(int i=0;i<FoodList.size();i++) {
			for(int j = 0;j<locales.length;j++) {
				if(locales[j].equals(FoodList.get(i).getLocale())) {
					fds[j]++;
				}
			}
		}
		System.out.println("가장 비싼 음식 = " +hList +"\n"+"가지 수 = " + hList.size());
		System.out.println("가장 싼 음식 = " +lList +"\n"+"가지 수 = " + lList.size());
		
		for(int j =0;j<locales.length;j++) {
			System.out.println(locales[j]+" 갯수 : "+fds[j]);
		}
		
	
	}

}