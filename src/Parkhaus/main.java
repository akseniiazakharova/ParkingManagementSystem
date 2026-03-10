package Parkhaus;

import java.util.Scanner;

import newprojekt.newProjekt;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Parkhaus parkhaus = new Parkhaus(2, 3);
		
		boolean running = true;
		
		while (running) {
			
		
		parkhaus.display();
		
		System.out.println("Sage ID von deinem Fahrzeug");
		char auto = scanner.next().charAt(0);
		
		
		Autos myauto = new Autos(auto);
		
		if (parkhaus.eingang(myauto)) {
            System.out.println("Auto erfolgreich geparkt!");
        } else {
            System.out.println("Kein Platz im Eingangsbereich!");
        }
		
		
		parkhaus.display();
		}
		
		
		

	}

}
