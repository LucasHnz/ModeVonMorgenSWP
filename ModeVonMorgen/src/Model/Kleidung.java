package Model;

public class Kleidung extends Artikel {

	private String Größe;
	
	public Kleidung(int artnr, int bestand, String Bezeichnung, String Geschlecht, String Hersteller, String Verfügbarkeit, String Notiz, String[]  Lieferanten, double Preis, double Rabatt, String Größe) {
		super(artnr, bestand, Bezeichnung, Geschlecht, Hersteller, Verfügbarkeit, Notiz, Lieferanten, Preis, Rabatt);
		this.Größe=Größe;
	}

	public String getGröße() {
		return Größe;
	}

	public void setGröße(String größe) {
		Größe = größe;
	}
	
	
}
