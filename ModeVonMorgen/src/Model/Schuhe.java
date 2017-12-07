package Model;
/**
 * 
 * @author maoro
 *
 */
public class Schuhe extends Artikel {

	public int Schuhgröße;
	/**
	 * 
	 * @param Schuhgröße Die Schuhgröße
	 */
	public Schuhe(int artnr, int bestand, String Bezeichnung, String Geschlecht, String Hersteller, String Verfügbarkeit, String Notiz, String[]  Lieferanten, double Preis, double Rabatt, int Schuhgröße) {
		super(artnr, bestand, Bezeichnung, Geschlecht, Hersteller, Verfügbarkeit, Notiz, Lieferanten, Preis, Rabatt);
		this.Schuhgröße=Schuhgröße;
		Kategorie = "Schuhe";
	}

	public int getSchuhgröße() {
		return Schuhgröße;
	}

	public void setSchuhgröße(int schuhgröße) {
		Schuhgröße = schuhgröße;
	}
	
	
}
