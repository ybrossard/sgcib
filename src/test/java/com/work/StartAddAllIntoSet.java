package com.work;

import java.util.HashSet;
import java.util.Set;

public class StartAddAllIntoSet {

	public StartAddAllIntoSet() {
	}
	
	public static void main(String[] args) {
		
		Set<String> strings = new HashSet<String>();
		
		Set<String> strings1 = new HashSet<String>();
		strings1.add("AAA");
		strings1.add("BBB");
		strings1.add("CCC");
		
		Set<String> strings2 = new HashSet<String>();
		strings2.add("DDD");
		strings2.add("EEE");
		strings2.add("FFF");
		
		Set<String> strings3 = new HashSet<String>();
		strings3.add("AAA");
		strings3.add("EEE");
		strings3.add("CCC");
		
		Set<String> strings4 = new HashSet<String>();
		strings4.add("GGG");
		strings4.add("HHH");
		strings4.add("III");
		
		strings.addAll(strings1);
		strings.addAll(strings2);
		strings.addAll(strings3);
		aggregateStrings(strings, strings4);
		
		checkMultiParameters("AAA");
		checkMultiParameters("AAA","BBB");
		checkMultiParameters("AAA","BBB","CCC");
	}
	
	private static void checkMultiParameters(String... parameters) {
		for (String parameter : parameters) {
			System.out.println(parameter);
		}
	}
	
	private static void aggregateStrings(Set<String> finalStrings, Set<String> currentStrings) {
		finalStrings.addAll(currentStrings);
	}	
}
