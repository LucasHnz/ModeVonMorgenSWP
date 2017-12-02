package Model;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

//Damit ich das Programm starten kann, musste ich die Klasse deaktivieren (bis kein Fehler mehr auftaucht)



public class Artikelsammlung {

	HashMap<Integer,Artikel> Artikelsammlung = new HashMap<Integer,Artikel>();
	double a = 10;
	double b = 10;
	String[] test = {"88","88"};
	
	public Artikelsammlung() {	}
	
	public void füllenSammlung(ResultSet rs, String typ) {
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
	
	public Artikel[] getArtikelArray(String Filter) {
	 
		Artikel[] a = new Artikel[Artikelsammlung.size()];
		a = (Artikel[]) Artikelsammlung.values().toArray();
		return a;
	}
}
