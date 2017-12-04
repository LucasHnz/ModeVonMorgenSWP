package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HinzufügenMA {
	
	public static void hinzufügenMA(double nutzernr, double admin, String nachname, String vorname, String email, String straße, String ort, int plz, String iban, int gehalt, int berechtigung, String passwort) throws SQLException {
		
		String Verbindung = "jdbc:oracle:thin:@aix1.fh-bielefeld.de:1521:d2";
		Connection con = DriverManager.getConnection(Verbindung, "dvi515", "fh6482");
		Statement stmt = con.createStatement();
		String befehl = "insert into Mitarbeiter values ('"+nutzernr+"','"+admin+"','"+nachname+"','"+vorname+"','"+email+"','"+straße+"','"+ort+"','"+plz+"','"+iban+"','"+gehalt+"','"+berechtigung+"','"+passwort+"')";
		
		stmt.executeQuery(befehl);
		
		stmt.close();
		con.close();
	}
	

}
