package Model;

//Julian

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class BestandskundenSammlung {
	
	HashMap<Integer, Bestandskunde> BestandskundenSammlung = new HashMap<Integer,Bestandskunde>();
	
	public BestandskundenSammlung(ResultSet rs) throws SQLException {
		
		String vorname = rs.getString("Vorname");
		String nachname = rs.getString("Name");
		String stra�e = rs.getString("Stra�e");
		int plz = rs.getInt("PLZ");
		String ort = rs.getString("Ort");
		int berechtigung = rs.getInt("Berechtigung");
		String email = rs.getString("email");
		int nutzernr = rs.getInt("NutzerNr");
		String lstra�e = rs.getString("lstra�e");
		int lplz = rs.getInt("lplz");
		String lort = rs.getString("lort");
		int pss = rs.getInt("PSS");
		String passwort = rs.getString("Passwort");
		
		Bestandskunde bkunde = new Bestandskunde (vorname, nachname, stra�e, plz, ort, berechtigung, email, nutzernr, lstra�e, lplz, lort, pss, passwort);
		BestandskundenSammlung.put(bkunde.getNutzernr(), bkunde);
	}

}
