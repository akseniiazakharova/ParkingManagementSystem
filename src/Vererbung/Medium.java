package Vererbung;

import java.security.PublicKey;

public class Medium {
	
	private String titel;
	private String isbnOderid;
	private Integer erscheinungsjahr;
	
	//Konstruktor
	public Medium(String titel, String isbnOderid, Integer erscheinungsjahr) {
		
		this.titel = titel;
		this.isbnOderid = isbnOderid;
		this.erscheinungsjahr = erscheinungsjahr;
		
	}
		
		public String getTitel() {
			return titel;
		
		}
		
		public String getIsbnoderid() {
			return isbnOderid;
		}
		
		public Integer getErscheinungsjahr() {
			return erscheinungsjahr;
		}
		
		public void informationenAnzeigen() {
			System.out.println("Titel " + titel);
			System.out.println("ID " + isbnOderid);
			System.out.println("Veröffentlichungsjahr " + erscheinungsjahr);
		}
	
		
	
}
