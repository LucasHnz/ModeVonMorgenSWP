package Model;

public class Schuhe extends Artikel {

	public int Schuhgr��e;
	
	public Schuhe(int artnr, int bestand, String Bezeichnung, String Geschlecht, String Hersteller, String Verf�gbarkeit, String Notiz, String[]  Lieferanten, double Preis, double Rabatt, int Schuhgr��e) {
		super(artnr, bestand, Bezeichnung, Geschlecht, Hersteller, Verf�gbarkeit, Notiz, Lieferanten, Preis, Rabatt);
		this.Schuhgr��e=Schuhgr��e;
	}

	public int getSchuhgr��e() {
		return Schuhgr��e;
	}

	public void setSchuhgr��e(int schuhgr��e) {
		Schuhgr��e = schuhgr��e;
	}
	
	
}
