package test;

import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		
		TreeSet<String> aSet = new TreeSet<>();
		TreeSet<String> bSet = new TreeSet<>();
		
		aSet.add("a");
		aSet.add("b");
		bSet.add("a");
		bSet.add("b");
		
		System.out.println(aSet.equals(bSet));
		

	}
}
