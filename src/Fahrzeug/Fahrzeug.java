package Fahrzeug;

import java.security.PrivateKey;

public class Fahrzeug {
	
	private String marke;
	private String modell;
	private Integer baujahr;
	private String farbe;
	private Boolean motorGestartet=false;
	

	public Fahrzeug(String marke, String modell, Integer baujahr, String farbe) {
		this.marke = marke;
		this.modell = modell;
		this.baujahr = baujahr;
		this.farbe = farbe;
	}
	
	// 3. Геттеры и Сеттеры (Getter & Setter)
    // Они нужны, так как атрибуты приватные
	
	// --- ГЕТТЕРЫ (есть для всего, чтобы мы могли всё прочитать) ---
	
	public String getMarke() {
		return marke;
	
	}
	
	public String getModell() {
		return modell;
	
	}
	
	public Integer getBaujahr() {
		return baujahr;
		
	}
	
	public String getFrabe() {
		return farbe;
		
	}
	
	public boolean isMotorGestartet() {
		return motorGestartet;
		
	}
	
	// --- СЕТТЕРЫ (только для того, что разрешено менять) ---
	
	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
		
	}
	
	public void setFarbe(String farbe) {
		this.farbe = farbe;
		
	}
	
	//Methode
	public void starten() {
		this.motorGestartet = true;
		System.out.println("Der Motor des " + marke + modell + " wurde gestartet");
		
	}
	
	public void ausschalten() {
		this.motorGestartet = false;
		System.out.println("Der Moltor der " + marke + modell + " wurde ausgeschaltet");
		
	}
	
	public void informationenAusgeben() {
		System.out.println("Der Hersteller " + marke);
		System.out.println("Die Baureihe " + modell);
		System.out.println("Das Baujahr " + baujahr);
		System.out.println("Die Außenfarbe " + farbe);
		System.out.println("Status des Motrs" + motorGestartet);
		
	}
	
	
	
	

}
