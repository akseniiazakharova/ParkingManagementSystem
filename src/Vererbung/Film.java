package Vererbung;

import java.security.PrivateKey;

public class Film extends Medium {
	
	private String regisseur;
	private Integer dauerinMinuten;

	public Film(String titel, String isbnOderId, Integer erscheinungsjahr, String regisseur, Integer dauerInMinuten) {
		super(titel, isbnOderId, erscheinungsjahr);
		this.regisseur = regisseur;
		this.dauerinMinuten = dauerinMinuten;
		
	}
	
	public String getRegisseur() {
		return regisseur;
		
	}
	
	public Integer getDauerinMinuten() {
		return dauerinMinuten;
	}
	
	public void spieleFilmAb() {
		System.out.println("Der Film " + getTitel() + " wird gestartet. Regie: " + regisseur);
	}
	
	

}
