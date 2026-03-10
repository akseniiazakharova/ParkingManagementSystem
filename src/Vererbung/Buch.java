package Vererbung;

public class Buch extends Medium{

	private String autor;
	private Integer anzahlSeiten;
	
	public Buch(String titel, String isbnOderid, Integer erscheinungsjahr, String autor, Integer anzahlSeiten) {
		
		super(titel, isbnOderid, erscheinungsjahr);
		this.autor = autor;
		this.anzahlSeiten = anzahlSeiten;
	
	}
	
	public String getAutor() {
		return autor;
		
	}
	
	public Integer getAnzahlSeiten() {
		return anzahlSeiten;
		
	}
	
	
	/*
	 * // Переопределение метода (Override) 
    @Override
    public void informationenAnzeigen() {
        super.informationenAnzeigen(); // Сначала вызываем логику родителя (печать названия и года)
        System.out.println("Autor: " + autor + ", Seiten: " + anzahlSeiten); // Добавляем специфику книги
    }
	 */
	
	public void informationenAnzeigen() {
	
		System.out.println("Basisinformationen " + getTitel());
		System.out.println("Buchinformationen " + autor + anzahlSeiten);
	}
}
