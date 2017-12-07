package Model;
/**
 * 
 * @author maoro
 *
 */
public class Kleidung extends Artikel {

	private String Gr��e;
	/**
	 * 
	 * @param Gr��e Die Gr��e des Artikels. Unterteilt in XS, S, M, L, XL, XXL.
	 */
	public Kleidung(int artnr, int bestand, String Bezeichnung, String Geschlecht, String Hersteller, String Verf�gbarkeit, String Notiz, String[]  Lieferanten, double Preis, double Rabatt, String Gr��e) {
		super(artnr, bestand, Bezeichnung, Geschlecht, Hersteller, Verf�gbarkeit, Notiz, Lieferanten, Preis, Rabatt);
		this.Gr��e=Gr��e;
		Kategorie = "Kleidung";
	}

	public String getGr��e() {
		return Gr��e;
	}

	public void setGr��e(String gr��e) {
		Gr��e = gr��e;
	}
	
	
}
