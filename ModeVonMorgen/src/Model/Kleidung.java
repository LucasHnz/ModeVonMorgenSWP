package Model;

public class Kleidung extends Artikel {

	private String Gr��e;
	
	public Kleidung(int artnr, int bestand, String Bezeichnung, String Geschlecht, String Hersteller, String Verf�gbarkeit, String Notiz, String[]  Lieferanten, double Preis, double Rabatt, String Gr��e) {
		super(artnr, bestand, Bezeichnung, Geschlecht, Hersteller, Verf�gbarkeit, Notiz, Lieferanten, Preis, Rabatt);
		this.Gr��e=Gr��e;
	}

	public String getGr��e() {
		return Gr��e;
	}

	public void setGr��e(String gr��e) {
		Gr��e = gr��e;
	}
	
	
}
