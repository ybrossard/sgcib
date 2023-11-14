package com.work;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {

	private static String bonds[] = {"Local Bonds", "Private Bonds", "Sovereign Bonds", "Supranational Bonds"};
	
	public ConvertArrayToArrayList() {
	}

	public static void main(String[] args) {
		
		List<String> bondsAsList = Arrays.asList(bonds);
		
		for (String cle : bondsAsList) {
			System.out.println(cle);
		}
	}
}
