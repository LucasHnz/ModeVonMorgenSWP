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
	/**
	 * 
	 * @param Artikelnummer
	 */
	public static void EditiereArtikel(int Artikelnummer) {
		Artikel artikel = Artikelsammlung.getArtikel(Artikelnummer);
		if(artikel.getKategorie() == "Accessoires")
			//GUIArtikelFormular.editiereArtikel(Artikelnummer, artikel.getKategorie());
		else if(artikel.getKategorie() == "Schuhe")
			//GUIArtikelFormular.editiereArtikel(Artikelnummer, artikel.getKategorie());
		else if(artikel.getKategorie() == "Kleidung")
			//GUIArtikelFormular.editiereArtikel(Artikelnummer, artikel.getKategorie());		
		
	}
	/**
	 * Fordert die Artikelsammlung auf, einen neuen Artikel mit den �bergebenen Parametern hinzuzuf�gen.
	 * @param kateg Eine der drei Artikelkategorien: Schuhe, Accessoires und Kleidung.
	 * 
	 */
	public static void NeuerArtikel(String kateg, int Artikelnummer, int Bestand, String Bezeichnung, String Geschlecht,
			String Hersteller, String Verf�gbarkeit, String Notiz, String[] Lieferanten, double Preis,
			double Rabatt, int Schuhgr��e, String Farbe, String Gr��e) {
		
	}
}
