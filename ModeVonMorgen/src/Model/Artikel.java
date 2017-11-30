package Model;

public abstract class Artikel {

	private int Artikelnummer, Bestand;
	private String Bezeichnung, Art, Geschlecht, Hersteller, Verf�gbarkeit, Notiz;
	private String[] Lieferanten;
	private double Preis, Rabatt;
	
	public int getArtikelnummer() {
		return Artikelnummer;
	}
	public void setArtikelnummer(int artikelnummer) {
		Artikelnummer = artikelnummer;
	}
	public int getBestand() {
		return Bestand;
	}
	public void setBestand(int bestand) {
		Bestand = bestand;
	}
	public String getBezeichnung() {
		return Bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		Bezeichnung = bezeichnung;
	}
	public String getArt() {
		return Art;
	}
	public void setArt(String art) {
		Art = art;
	}
	public String getGeschlecht() {
		return Geschlecht;
	}
	public void setGeschlecht(String geschlecht) {
		Geschlecht = geschlecht;
	}
	public String getHersteller() {
		return Hersteller;
	}
	public void setHersteller(String hersteller) {
		Hersteller = hersteller;
	}
	public String getVerf�gbarkeit() {
		return Verf�gbarkeit;
	}
	public void setVerf�gbarkeit(String verf�gbarkeit) {
		Verf�gbarkeit = verf�gbarkeit;
	}
	public String getNotiz() {
		return Notiz;
	}
	public void setNotiz(String notiz) {
		Notiz = notiz;
	}
	public String[] getLieferanten() {
		return Lieferanten;
	}
	public void setLieferanten(String[] lieferanten) {
		Lieferanten = lieferanten;
	}
	public double getPreis() {
		return Preis;
	}
	public void setPreis(double preis) {
		Preis = preis;
	}
	public double getRabatt() {
		return Rabatt;
	}
	public void setRabatt(double rabatt) {
		Rabatt = rabatt;
	}
	
	
}
