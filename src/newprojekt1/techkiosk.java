package newprojekt1;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.Scanner;

import newprojekt.newProjekt;

public class techkiosk {
	
	public static int findProduct(String[] names, String searchTerm) {
		for (int i = 0; i < names.length; i ++) {
			if (names[i].equalsIgnoreCase(searchTerm)) {
				return i;
			}
		}
		return -1;
	}
	
	
	

	public static void printInventory(String[] names, int[] counts) {
		// TODO Auto-generated method stub
		
		System.out.println("Ware zur Verfügung");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + counts[i] + " stücke");
		}
	}
		
		
 	public static void main(String[] args) {
		
		String[] products = {"Laptop", "Maus", "Tastatur", "Monitor"};
		int[] stock = {10, 25, 15, 5};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Was wollen Sie kaufen?");
		String item = scanner.nextLine();
		
		int index = findProduct(products, item);
		
		if (index != -1) {
			System.out.println("Ja, " + products[index] + " haben wir!");
			printInventory(products, stock);
		}
		else {
			System.out.println("Keine");
		}
		
		}

}
