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
	public void EditiereArtikel(int Artikelnummer) {
		Artikel artikel;
		Artikelsammlung sammlung = new Artikelsammlung();
		artikel=sammlung.getArtikel(Artikelnummer);
		
	}
	
}
