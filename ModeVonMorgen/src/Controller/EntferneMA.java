package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EntferneMA {
	
	public static void entferneMA (int nutzernr) throws SQLException {
		
		String Verbindung = "jdbc:oracle:thin:@aix1.fh-bielefeld.de:1521:d2";
		Connection con = DriverManager.getConnection(Verbindung, "dvi515", "fh6482");
		Statement stmt = con.createStatement();
		
		String befehl = "delete from mitarbeiter where nutzernr='"+nutzernr+"'";
		
		stmt.executeQuery(befehl);
		
		stmt.close();
		con.close();
	}

}
