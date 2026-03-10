package newprojekt1;

import java.util.Scanner;

import newprojekt.newProjekt;

public class probe {
	
	public static int findProduct (String[] names, String searchProduct) {
		for (int i = 0; i < names.length; i ++) {
			if (names[i].equalsIgnoreCase(searchProduct)) {
				return i;
				
			}
			
		}
		return -1;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] products = {"Laptop", "Maus", "Tastatur", "Monitor"};
		int[] stock = {12, 34, 55, 76};
		
		boolean running = true;
		
		Scanner scanner = new Scanner(System.in);
		
		while (running) {
			
		
		System.out.println("Was wollen Sie kaufen?");
		String productItem = scanner.nextLine();
		
		int index = findProduct(products, productItem);
		
		if (index !=-1) {
			System.out.println("Wir haben " + stock[index] + " " + products[index]);
			running = false;
			
		} else {
			System.out.println("Es gibt keine");
		}
		
		
		}
	}

}
