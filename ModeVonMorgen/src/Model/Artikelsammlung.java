package Model;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
/**
 * 
 * @author maoro
 *
 */



public class Artikelsammlung {

	static HashMap<Integer,Artikel> Artikelsammlung = new HashMap<Integer,Artikel>();
	
	public Artikelsammlung() {	}
	
	public static void f�llenSammlung(ResultSet rs, String typ) {
		try{
			while(rs.next()){
		
				int Artikelnummer = rs.getInt("Artikelnummer");
				int Bestand = rs.getInt("Bestand");
				String[] Lieferanten = rs.getString("Lieferanten").split(";");
				String Bezeichnung = rs.getString("Bezeichnung");
				String Art = rs.getString("Art");
				String Geschlecht = rs.getString("Geschlecht");
				String Hersteller = rs.getString("Hersteller");
				String Verf�gbarkeit = rs.getString("Verf�gbarkeit");
				String Notiz = rs.getString("Notiz");
				double Preis = rs.getDouble("Preis");
				double Rabatt = rs.getDouble("Rabatt");
				int Schuhgr��e;
				String Farbe, Gr��e;
			
				if(typ == "Schuhe") {
					Schuhgr��e = rs.getInt("Schuhgr��e");
					Artikelsammlung.put(Artikelnummer, new Schuhe(Artikelnummer, Bestand, Bezeichnung, Geschlecht, Hersteller, Verf�gbarkeit, Notiz, Lieferanten, Preis, Rabatt, Schuhgr��e));
				}else if(typ == "Accessoires") {
					Farbe = rs.getString("Farbe");
					Artikelsammlung.put(Artikelnummer, new Accessoires(Artikelnummer, Bestand, Bezeichnung, Geschlecht, Hersteller, Verf�gbarkeit, Notiz, Lieferanten, Preis, Rabatt, Farbe));
				}else if(typ == "Kleidung") {
					Gr��e = rs.getString("Gr��e");
					Artikelsammlung.put(Artikelnummer, new Kleidung(Artikelnummer, Bestand, Bezeichnung, Geschlecht, Hersteller, Verf�gbarkeit, Notiz, Lieferanten, Preis, Rabatt, Gr��e));
				}	
			
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static Artikel[] getArtikelArray(String Filter) {
	 
		Artikel[] a = new Artikel[Artikelsammlung.size()];
		a = (Artikel[]) Artikelsammlung.values().toArray();
		return a;
	}
	
	public static Artikel getArtikel(int Artikelnummer) {
		return Artikelsammlung.get(Artikelnummer);
	}
	/**
	 * F�gt der Artikelsammlung einen neuen Artikel hinzu.
	 * @param kateg Die Kategorie des Artikels. Also Schuhe, Accessoires oder Kleidung
	 * @param Artikelnummer 
	 * @param Bestand
	 * @param Bezeichnung
	 * @param Geschlecht
	 * @param Hersteller
	 * @param Verf�gbarkeit
	 * @param Notiz
	 * @param Lieferanten
	 * @param Preis
	 * @param Rabatt
	 * @param Schuhgr��e
	 * @param Farbe
	 * @param Gr��e
	 * @see Model.Artikel Artikel 
	 * @return 
	 */
	public static void hinzuf�genArtikel(String kateg, int Artikelnummer, int Bestand, String Bezeichnung, String Geschlecht,
			String Hersteller, String Verf�gbarkeit, String Notiz, String[] Lieferanten, double Preis,
			double Rabatt, int Schuhgr��e, String Farbe, String Gr��e) {
		Artikel artikel;
		if(kateg == "Schuhe")
			artikel = new Schuhe(Artikelnummer, Bestand, Bezeichnung, Geschlecht, Hersteller, Verf�gbarkeit, Notiz, Lieferanten, Preis, Rabatt, Schuhgr��e);
		else if(kateg == "Accessoires")
			artikel = new Accessoires(Artikelnummer, Bestand, Bezeichnung, Geschlecht, Hersteller, Verf�gbarkeit, Notiz, Lieferanten, Preis, Rabatt, Farbe);
		else 
			artikel = new Kleidung(Artikelnummer, Bestand, Bezeichnung, Geschlecht, Hersteller, Verf�gbarkeit, Notiz, Lieferanten, Preis, Rabatt, Gr��e);
		Artikelsammlung.put(Artikelnummer, artikel);
	}
}

