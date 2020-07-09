package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {
	public static void main(String[] args) {
		String[] fNames = {"김","이","박","최","맹","신","조"};
		String[] lNames = {"동동","나나","진수","명희","철수","명호","둘리"};
		List<Student> stList = new ArrayList<>();
		List<Student> st1Count = new ArrayList<Student>();
		List<Student> st2Count = new ArrayList<Student>();
		List<Student> st3Count = new ArrayList<Student>();
		Random r = new Random();
		int same = 0;
	
		for(int i=1;i<=20;i++) {
			Integer[] count = new Integer[20];
			String fName = fNames[r.nextInt(7)];
			String lName = lNames[r.nextInt(7)];
			Student st = new Student();
			st.setName(fName+lName);
			st.setGrade(r.nextInt(3)+1);
			stList.add(st);
		}
		/*
		 * 위의 리스트는 1~3학년까지 랜덤하게 들어간 리스트입니다.
		 * 각 학년당 몇명의 학생이 있는지 출력하는 프로그램을 만들어주세요.
		 */
		
//		int fNum = 0;
//		int sNum = 0;
//		int tNum = 0;
//		
//		for(Student s:stList) {
//			System.out.println(s);
//			if(s.getGrade()==1) {
//				fNum++;
//			}else if(s.getGrade()==2) {
//				sNum++;
//			}else{
//				tNum++;
//			}
//			
//			
//		}
//		System.out.println("1 학년은 : "+fNum);
//		System.out.println("2 학년은 : "+sNum);
//		System.out.println("3 학년은 : "+tNum);
//------------------------------------------------------
		//		int[] nums = new int[3];
//		for(Student s:stList) {
//			System.out.println(s);
//			for(int i =0; i<nums.length;i++) {
//				if(s.getGrade()==(i+1)) {
//					nums[i]++;
//				}
//			}
//		}
//		for(int i =0;i<nums.length;i++) {
//			if(nums[i]!=0) {
//				System.out.println((i+1)+"학년의 숫자는"+nums[i]);
//			}
//		}
//----------------------------------------------------
		for(Student s:stList) {
			System.out.println(s);
			if(s.getGrade()==1) {
				st1Count.add(s);
			}
			if(s.getGrade()==2) {
				st2Count.add(s);
			}
			if(s.getGrade()==3) {
				st3Count.add(s);
			}
		}
		if(st1Count.size()>0) {
			System.out.print("1학년 : "+st1Count.size()+"명 ");
			for(Student s : st1Count) {
				
				System.out.print(s.getName()+",");
			}
			System.out.println();
		}
		if(st2Count.size()>0) {
			System.out.print("2학년 : "+st2Count.size()+"명 ");
			for(Student s : st2Count) {
				
				System.out.print(s.getName()+",");
			}
			System.out.println();
		}
		if(st3Count.size()>0) {
			System.out.print("3학년 : "+st3Count.size()+"명 ");
			for(Student s : st3Count) {
				System.out.print(s.getName()+",");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
