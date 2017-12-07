package Model;
/**
 * 
 * @author maoro
 *
 */
public class Accessoires extends Artikel {

	private String Farbe;
	/**
	 * 
	 * @param Farbe Farbe des Accessoires.
	 * @see Artikel
	 */
	public Accessoires(int artnr, int bestand, String Bezeichnung, String Geschlecht, String Hersteller, String Verfügbarkeit, String Notiz, String[]  Lieferanten, double Preis, double Rabatt, String Farbe) {
		super(artnr, bestand, Bezeichnung, Geschlecht, Hersteller, Verfügbarkeit, Notiz, Lieferanten, Preis, Rabatt);
		this.Farbe=Farbe;
		Kategorie="Accessoires";
	}
	
	public String getFarbe() {
		return Farbe;
	}

	public void setFarbe(String farbe) {
		Farbe = farbe;
	}
}
