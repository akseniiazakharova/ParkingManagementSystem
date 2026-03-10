package newprojekt;

import java.security.Provider.Service;
import java.util.Scanner;

public class Varialen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	Scanner scanner = new Scanner(System.in);
	boolean accesDenied = true;
	
	while (accesDenied) {
		System.out.println("Who you are? ");
		String role = scanner.nextLine().toLowerCase();
		
		switch (role) {
		case "admin":
			System.out.println("admin dashboard");
			accesDenied = false;
			
			break;
			
		case "user":
			System.out.println("user dashboard");
			accesDenied = false;
			break;

		default:
			System.out.println("Du hast keine Rechte");
			break;
		}
		
		
	}
	
	Scanner sc = new Scanner(System.in);
	boolean enterDenied = true;
	
	while (enterDenied) {
		System.out.println("Your password?");
		String password = sc.nextLine();
		
		
		
		if (password.length() < 8) {
			System.out.println("Pass ist zu kuru");
			
		}
		else if (!password.matches(".*[0-9].*")) {
			System.out.println("Pass muss am wenigstem 1 Zahl inhalten");
			
		}
		else {
			System.out.println("Pass isr korrekt");
			enterDenied = false;
		}
		
	}
	
	
	
	
	
	
		
	}

}
