package com.work;

public class InitTableauBidimentionnel {

	/* Premier exemple */
	private static String identificateur[][] = {
			{"Valeur11", "Valeur12", "Valeur13"},	
			{"Valeur21", "Valeur22", "Valeur23"},
			{"Valeur31", "Valeur32", "Valeur33"}
	};
	
	/* Deuxieme exemple */
	private static String cles[] = {"Local Bonds", "Private Bonds", "Sovereign Bonds", "Supranational Bonds"};
	private static String valeurs[][] = {
			{"Manual input"},
			{"Manual input", "Normal", "FRN", "ABS", "New"},
			{"France", "Europe", "USA", "Others", "Manual input"},
			{"Manual input"}
	};
	
	public InitTableauBidimentionnel() {
	}

	public static void main(String[] args) {

		for (int i = 0 ; i < identificateur.length ; i++) {
			for (int j = 0 ; j < identificateur[i].length ; j++) {
				System.out.println(identificateur[i][j]);
			}
		}

		for (int i = 0 ; i < cles.length ; i++) {
			System.out.println(cles[i]);
		}

		for (int i = 0 ; i < valeurs.length ; i++) {
			for (int j = 0 ; j < valeurs[i].length ; j++) {
				System.out.println(valeurs[i][j]);
			}
		}

	}
}
