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
	
	public void f�llenSammlung(ResultSet rs, String typ) {
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
	
	public Artikel[] getArtikelArray(String Filter) {
	 
		Artikel[] a = new Artikel[Artikelsammlung.size()];
		a = (Artikel[]) Artikelsammlung.values().toArray();
		return a;
	}
}
