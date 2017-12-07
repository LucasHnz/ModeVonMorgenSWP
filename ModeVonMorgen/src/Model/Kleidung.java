package Model;
/**
 * 
 * @author maoro
 *
 */
public class Kleidung extends Artikel {

	private String Größe;
	/**
	 * 
	 * @param Größe Die Größe des Artikels. Unterteilt in XS, S, M, L, XL, XXL.
	 */
	public Kleidung(int artnr, int bestand, String Bezeichnung, String Geschlecht, String Hersteller, String Verfügbarkeit, String Notiz, String[]  Lieferanten, double Preis, double Rabatt, String Größe) {
		super(artnr, bestand, Bezeichnung, Geschlecht, Hersteller, Verfügbarkeit, Notiz, Lieferanten, Preis, Rabatt);
		this.Größe=Größe;
		Kategorie = "Kleidung";
	}

	public String getGröße() {
		return Größe;
	}

	public void setGröße(String größe) {
		Größe = größe;
	}
	
	
}
