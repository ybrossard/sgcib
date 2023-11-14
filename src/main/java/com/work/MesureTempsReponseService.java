package com.work;

public class MesureTempsReponseService {

	public MesureTempsReponseService() {
	}

	public static void main(String[] args) {
		
		long t1 = new java.util.Date().getTime();
		
		for (int i = 0 ; i < 5000000 ; i++) {
			System.out.println("i : " + i);
		}
		
		long t2 = new java.util.Date().getTime();
		long duration = (t2 - t1) / 1000;

		System.out.println("TOTAL DURATION : " + duration + " secondes.");
	}
}
