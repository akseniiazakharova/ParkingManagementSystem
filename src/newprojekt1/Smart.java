package newprojekt1;

import newprojekt.newProjekt;

public class Smart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1D Array
		String[] products = {"Laptop", "Smartphone", "Tablet"};
		
		//2D Array
		int[][] bestand = new int[3][2];
		
		//Ergänzen Laptop bestand
		bestand[0][0] = 15;
		bestand [0][1] = 20;
		
		//Ergänzen Smartphone bestand
		bestand [1][0] = 30;
		bestand [1][1] = 40;
		
		//Die Ausgabe von Daten auf den Bildschirm
		System.out.println("Lager: ");
		int totalSumAll = 0;
		
		//Пишем логику, как будет программа идти по товарам
		for (int i = 0; i < bestand.length; i++) {
			String name = products[i];
			int sumThisProduct = 0;
			
			
		for (int j = 0; j < bestand[i].length; j++) {
			sumThisProduct += bestand[i][j];
				
			
		}
		totalSumAll += sumThisProduct;
		int mengeHalleA = bestand [i][0];
		int mengeHalleB = bestand [i][1];
		int gesamt = mengeHalleA + mengeHalleB;
		
		System.out.println("Produkt: " + name);
		System.out.println(" - Halle A: " + mengeHalleA);
		System.out.println(" - Halle B: " + mengeHalleB);
		System.out.println("Ingesamt: " + gesamt);
		System.out.println("Alle Lager: " + totalSumAll + " items");
			
			
		}
		

	}

}
