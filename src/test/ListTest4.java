package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Food{
private String name;
private int price;
private String locale;
@Override
public String toString() {
	return "Food [name=" + name + ", price=" + price + ", locale=" + locale + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getLocale() {
	return locale;
}
public void setLocale(String locale) {
	this.locale = locale;
}
}
public class ListTest4 {
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
	
		int max = 0;
		int min = 10000;
		int idx = 0;
		int minidx = 0;
		
		
		for(int i =0; i<FoodList.size();i++) {
			Food fd = FoodList.get(i);
			System.out.println(fd);
			if(max<fd.getPrice()) {
				max=fd.getPrice();
				idx = i;
			}if(min>fd.getPrice()){
				min=fd.getPrice();
				minidx = i;
			}
		}
		System.out.println();
		System.out.println("가장 비싼 음식 = " + FoodList.get(idx));
		System.out.println("가장 싼 음식 = " + FoodList.get(minidx));
		System.out.println();
		for(Food s: FoodList) {
			if(s.getPrice()==max) {
				hList.add(s);
				
			}
			if(s.getPrice()==min) {
				lList.add(s);
			}
			
		}
		
		if(hList.size()>0) {
			System.out.println("가장 비싼 음식 = " +hList.size() );
			for(Food f : hList) {
				System.out.print(f.getLocale()+",");
			}
			System.out.println();
		}
		if(lList.size()>0) {
			System.out.println("가장 싼 음식 = " +lList.size() );
			for(Food f : lList) {
				System.out.print(f.getLocale()+",");
			}
		}
		
		
	}
	
	
	
	
	
}
