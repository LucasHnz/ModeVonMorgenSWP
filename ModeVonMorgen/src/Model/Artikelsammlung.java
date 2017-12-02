package Model;

import java.util.HashMap;

public class Artikelsammlung {

	HashMap<Integer,Artikel> Artikelsammlung = new HashMap<Integer,Artikel>();
	
	public Artikelsammlung() {
		/** while(rs.next){
		 * Artikel artikel = new Artikel( DB-Anfrage)
		 *  Artikelsammlung.put(artikel.getArtikelnummer(), artikel);
		 * 
		 * 
		 * 
		 */
	}
	
	public Artikel[] getArtikelArray(String Filter) {
		Artikel[] a = new Artikel[Artikelsammlung.size()];
		a = (Artikel[]) Artikelsammlung.values().toArray();
		return a;
	}
}
