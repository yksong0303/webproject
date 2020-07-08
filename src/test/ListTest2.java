package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class LOLChamp {
	private String name;
	private int power;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "LOLChamp [name=" + name + ", power=" + power + "]";
	}

}

public class ListTest2 {
	public static void main(String[] args) {
		String [] names = {"티모","나미","람머스","나무","최인혁","징크스","애쉬"};
		List<LOLChamp> lollist = new ArrayList<>();
		Random r = new Random();
		
		
		for(int i = 0;i<names.length;i++) {
			LOLChamp lc = new LOLChamp();
		lc.setName(names[i]);
		lc.setPower(r.nextInt(51)+50);
		lollist.add(lc);
		
		}
		
		int max = 0;
		int idx = 0;
		
		for(int i = 0;i<names.length;i++) { 
			LOLChamp lc = lollist.get(i);
			System.out.println(lc);
			if(max<lc.getPower()) {
				max = lc.getPower();
				idx = i;
			}
		}
		
		System.out.println("가장 강한 챔프 = " +lollist.get(idx));
		
		
	}

}
