package test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>(); //같은값이 있으면 중복안됨
		s.add("2");
		s.add("2");
		System.out.println(s);
	}
}
