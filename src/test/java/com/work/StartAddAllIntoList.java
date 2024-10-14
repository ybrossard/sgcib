package com.work;

import java.util.ArrayList;
import java.util.List;

public class StartAddAllIntoList {

	public StartAddAllIntoList() {
	}
	
	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>();
		
		List<String> strings1 = new ArrayList<String>();
		strings1.add("AAA");
		strings1.add("BBB");
		strings1.add("CCC");
		
		List<String> strings2 = new ArrayList<String>();
		strings2.add("DDD");
		strings2.add("EEE");
		strings2.add("FFF");
		
		List<String> strings3 = new ArrayList<String>();
		strings3.add("AAA");
		strings3.add("EEE");
		strings3.add("CCC");
		
		strings.addAll(strings1);
		strings.addAll(strings2);
		strings.addAll(strings3);
		
		checkMultiParameters("AAA");
		checkMultiParameters("AAA","BBB");
		checkMultiParameters("AAA","BBB","CCC");
	}
	
	private static void checkMultiParameters(String... parameters) {
		for (String parameter : parameters) {
			System.out.println(parameter);
		}
	}
}
