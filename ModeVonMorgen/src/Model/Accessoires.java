package Model;

public class Accessoires extends Artikel {

	private String Farbe;
	
	public Accessoires(int artnr, int bestand, String Bezeichnung, String Geschlecht, String Hersteller, String Verf�gbarkeit, String Notiz, String[]  Lieferanten, double Preis, double Rabatt, String Farbe) {
		super(artnr, bestand, Bezeichnung, Geschlecht, Hersteller, Verf�gbarkeit, Notiz, Lieferanten, Preis, Rabatt);
		this.Farbe=Farbe;
	}
	
	public String getFarbe() {
		return Farbe;
	}

	public void setFarbe(String farbe) {
		Farbe = farbe;
	}
	
//test	
}
