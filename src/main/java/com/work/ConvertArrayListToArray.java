package com.work;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToArray {

	public ConvertArrayListToArray() {
	}

	public static void main(String[] args) {
		
		List<String> currencies = new ArrayList<String>();
		
		currencies.add("EUR");
		currencies.add("USD");
		currencies.add("GBP");
		
		String[] currenciesAsArray = (String[]) currencies.toArray(new String[currencies.size()]);
		
		for (String stringAsArray : currenciesAsArray) {
			System.out.println(stringAsArray);
		}
	}
}
