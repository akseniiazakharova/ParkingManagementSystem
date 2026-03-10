package Cafe;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Scanner;

import newprojekt.newProjekt;

public class Order {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean runnuning = true;
		
		ArrayList<ArrayList<Product>> menu = new ArrayList();
		ArrayList<Product> coffee = new ArrayList();
		coffee.add(new Product("Latte", 10));
		coffee.add(new Product("Americano", 5));
		
		ArrayList<Product> tee = new ArrayList();
		tee.add(new Product("green tee", 3));
		tee.add(new Product("black tee", 2));
		
		menu.add(coffee);
		menu.add(tee);
		
		for (ArrayList<Product> category : menu) {
			for (Product item : category) {
				System.out.println(item.getName() + item.getPrice());
				
				
			}
			
		}
		
		while (runnuning) {
			
		
		
		ArrayList<Product> allProducts = new ArrayList<>();
		for (ArrayList<Product> category : menu) {
			allProducts.addAll(category);
			
		}
		
		for (Product item : allProducts) {
			System.out.println(item.getName());
			
			
		}
		
		System.out.println("Was wollen Sie kaufen?");
		Integer inputName = scanner.nextInt();
		
		for (Product item : allProducts) {
			if (item.getName().equalsIgnoreCase(inputName)) {
				
			}
			
		}
		
		
		
		
		
		Product selected = allProducts.get(select);
		
		System.out.println(selected);
			
		}
		
		
	}
		
		
		

	

}
