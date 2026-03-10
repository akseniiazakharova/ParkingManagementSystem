package newprojekt1;

import newprojekt.newProjekt;

public class alles {
	//Array sind oben, damit alle Methoden sie sehen können
			static String[] products = {"Kaffee", "Tee", "Kuchen"};
			static int[][] bestand = new int [3][2];
			

	public static void main(String[] args) {
		
	}
	
	public static void printInventory() {
		//Tabelle logik
		int i = 0;
		for (String name : products) {
			int sum = bestand[i][0] + bestand[i][1];
			
			String status = "";
			if (sum == 0) {
				status = "Ausverkauft";
				
			}
			
			System.out.println(name + status +);
		
		
		}
		
	}
	
	public static void addStock() {
		//
	}

}
