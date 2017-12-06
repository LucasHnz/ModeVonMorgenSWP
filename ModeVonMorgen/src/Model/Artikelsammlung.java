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
	
	public static void füllenSammlung(ResultSet rs, String typ) {
		try{
			while(rs.next()){
		
				int Artikelnummer = rs.getInt("Artikelnummer");
				int Bestand = rs.getInt("Bestand");
				String[] Lieferanten = rs.getString("Lieferanten").split(";");
				String Bezeichnung = rs.getString("Bezeichnung");
				String Art = rs.getString("Art");
				String Geschlecht = rs.getString("Geschlecht");
				String Hersteller = rs.getString("Hersteller");
				String Verfügbarkeit = rs.getString("Verfügbarkeit");
				String Notiz = rs.getString("Notiz");
				double Preis = rs.getDouble("Preis");
				double Rabatt = rs.getDouble("Rabatt");
				int Schuhgröße;
				String Farbe, Größe;
			
				if(typ == "Schuhe") {
					Schuhgröße = rs.getInt("Schuhgröße");
					Artikelsammlung.put(Artikelnummer, new Schuhe(Artikelnummer, Bestand, Bezeichnung, Geschlecht, Hersteller, Verfügbarkeit, Notiz, Lieferanten, Preis, Rabatt, Schuhgröße));
				}else if(typ == "Accessoires") {
					Farbe = rs.getString("Farbe");
					Artikelsammlung.put(Artikelnummer, new Accessoires(Artikelnummer, Bestand, Bezeichnung, Geschlecht, Hersteller, Verfügbarkeit, Notiz, Lieferanten, Preis, Rabatt, Farbe));
				}else if(typ == "Kleidung") {
					Größe = rs.getString("Größe");
					Artikelsammlung.put(Artikelnummer, new Kleidung(Artikelnummer, Bestand, Bezeichnung, Geschlecht, Hersteller, Verfügbarkeit, Notiz, Lieferanten, Preis, Rabatt, Größe));
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
	 * Fügt der Artikelsammlung einen neuen Artikel hinzu.
	 * @param kateg Die Kategorie des Artikels. Also Schuhe, Accessoires oder Kleidung
	 * @param Artikelnummer 
	 * @param Bestand
	 * @param Bezeichnung
	 * @param Geschlecht
	 * @param Hersteller
	 * @param Verfügbarkeit
	 * @param Notiz
	 * @param Lieferanten
	 * @param Preis
	 * @param Rabatt
	 * @param Schuhgröße
	 * @param Farbe
	 * @param Größe
	 * @see Model.Artikel Artikel 
	 * @return 
	 */
	public static void hinzufügenArtikel(String kateg, int Artikelnummer, int Bestand, String Bezeichnung, String Geschlecht,
			String Hersteller, String Verfügbarkeit, String Notiz, String[] Lieferanten, double Preis,
			double Rabatt, int Schuhgröße, String Farbe, String Größe) {
		Artikel artikel;
		if(kateg == "Schuhe")
			artikel = new Schuhe(Artikelnummer, Bestand, Bezeichnung, Geschlecht, Hersteller, Verfügbarkeit, Notiz, Lieferanten, Preis, Rabatt, Schuhgröße);
		else if(kateg == "Accessoires")
			artikel = new Accessoires(Artikelnummer, Bestand, Bezeichnung, Geschlecht, Hersteller, Verfügbarkeit, Notiz, Lieferanten, Preis, Rabatt, Farbe);
		else 
			artikel = new Kleidung(Artikelnummer, Bestand, Bezeichnung, Geschlecht, Hersteller, Verfügbarkeit, Notiz, Lieferanten, Preis, Rabatt, Größe);
		Artikelsammlung.put(Artikelnummer, artikel);
	}
}

