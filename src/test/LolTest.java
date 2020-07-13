package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LolTest {
	public static void main(String[] args) {
		String [] names = {"티모","나미","람머스","나무","최인혁","징크스","애쉬"};
		List<LOLChamp> lollist = new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<names.length;i++) {
			int idx = r.nextInt(names.length);
		}
	}

}
