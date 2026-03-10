package Parkhaus;

import newprojekt.newProjekt;

public class Parkhaus {
	private final int etage;
	private final int platz;
	
	private final char[][] parkingGrid;
	
	public Parkhaus(int etage, int platz) {
		this.etage = etage;
		this.platz = platz;
		this.parkingGrid = new char[etage][platz];
		
		for (int i = 0; i < etage; i++) {
			for (int j = 0; j < platz; j++) {
				parkingGrid[i][j] = '.';
				
			}
		}
			
		}
			
	
	public void display() {

		for (int i = 0; i < etage; i++) {
			System.out.print("Etage " + i + ": "); // Подписываем номер этажа
			System.out.println();
			for (int j = 0; j < platz; j++) {
				System.out.print(parkingGrid[i][j] + " ");
				System.out.println();
				
				
			}
		}
		
		
		
	
	}
	
	public boolean eingang(Autos f) {
		char symbol = f.getId();
		for (int i = 0; i < etage; i++) {
			for (int j = 0; j < platz; j++) {
				
			
			
			if (parkingGrid[i][j] == '.') {
				parkingGrid[i][j] = symbol;
				return true;
				
			}
			}
				
			}
		return false;
			
		}
	
	
	
		
		
	}
	

