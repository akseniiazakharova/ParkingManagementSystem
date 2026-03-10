package Fahrzeug;

import newprojekt.newProjekt;

public class Ausgabe {

	public static void main(String[] args) {
		
		Fahrzeug auto1 = new Fahrzeug("BMW", "Z3", 2020, "schwarz");
		Fahrzeug auto2 = new Fahrzeug("Audi", "7", 2023, "rot");
		
		
		
		auto2.informationenAusgeben();
		auto2.starten();
		auto2.informationenAusgeben();
		

	}

}
