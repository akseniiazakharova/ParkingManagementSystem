package Vererbung;

import newprojekt.newProjekt;

public class main {

	public static void main(String[] args) {
		
		Buch myBook = new Buch("NameBuch", "A2345", 1995, "Aksinia", 300);
		
		Film myFilm = new Film("Monster", "H765H", 2009, "Olena", 44);
		
		System.out.println("Bücher: ");
		myBook.informationenAnzeigen();
		
		System.out.println("Films: ");
		myFilm.informationenAnzeigen();
		myFilm.spieleFilmAb();
		

	}

}
