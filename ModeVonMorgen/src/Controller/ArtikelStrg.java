package Controller;

import Model.Artikel;
import Model.Artikelsammlung;

/**
 * 
 * @author maoro
 *
 */
public class ArtikelStrg {

	public ArtikelStrg() {
		
		
	}
	public static void EditiereArtikel(int Artikelnummer) {
		Artikel artikel;
		Artikelsammlung sammlung = new Artikelsammlung();
		artikel=sammlung.getArtikel(Artikelnummer);
		
	}
	public static void NeuerArtikel(String typ, int Artikelnummer, int Bestand, String Bezeichnung, String Geschlecht,
			String Hersteller, String Verfügbarkeit, String Notiz, String[] Lieferanten, double Preis,
			double Rabatt, int Schuhgröße, String Farbe, String Größe) {
		
	}
}
