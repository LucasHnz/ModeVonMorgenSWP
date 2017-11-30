package Model;

public class Kleidung extends Artikel {

	private String Größe;
	
	public Kleidung(int artnr, int bestand, String Bezeichnung, String Geschlecht, String Hersteller, String Verfügbarkeit, String Notiz, String[]  Lieferanten, double Preis, double Rabatt, String Größe) {
		super(bestand, bestand, Größe, Größe, Größe, Größe, Größe, Lieferanten, Rabatt, Rabatt);
		this.Größe=Größe;
	}

	public String getGröße() {
		return Größe;
	}

	public void setGröße(String größe) {
		Größe = größe;
	}
	
	
}
