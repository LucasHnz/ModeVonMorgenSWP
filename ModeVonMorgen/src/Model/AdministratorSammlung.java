package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class AdministratorSammlung {
	
	HashMap<Integer, Administrator> AdministratorSammlung = new HashMap<Integer, Administrator>();
	
	public AdministratorSammlung (ResultSet rs) throws SQLException {
		
		while(rs.next()) {
			
			String vorname = rs.getString("Vorname");
			String nachname = rs.getString("Name");
			String stra�e = rs.getString("Stra�e");
			int plz = rs.getInt("PLZ");
			String ort = rs.getString("Ort");
			int berechtigung = rs.getInt("Berechtigung");
			String email = rs.getString("email");
			int nutzernr = rs.getInt("NutzerNr");
			int gehalt = rs.getInt("Gehalt");
			String iban = rs.getString("IBAN");
			String passwort = rs.getString("Passwort");
			
			Administrator admin = new Administrator (vorname, nachname, stra�e, plz, ort, berechtigung, email, nutzernr, gehalt, iban, passwort );
			
			AdministratorSammlung.put(admin.getNutzernr(), admin);
			
		}
	}
	

}
