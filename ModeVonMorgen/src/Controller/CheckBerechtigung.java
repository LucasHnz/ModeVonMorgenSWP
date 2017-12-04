package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckBerechtigung {
	
	//Nen bisschen kompliziert, aber eine einfachere Abfrage war leider nicht möglich
	public static int checkBerechtigung(String email) throws SQLException {
		
		String befehlMA = "select berechtigung from Mitarbeiter where email ='"+email+"'";
		String befehlAdmin = "select berechtigung from Administrator where email ='"+email+"'";
		String befehlBKunde = "select berechtigung from Bestandskunde where email ='"+email+"'";
		int i = 0;
		
		String Verbindung = "jdbc:oracle:thin:@aix1.fh-bielefeld.de:1521:d2";
		
		Connection con = DriverManager.getConnection(Verbindung, "dvi515", "fh6482");
		Statement stmt = con.createStatement();
		
		ResultSet rs1 = stmt.executeQuery(befehlMA);
		ResultSet rs2 = stmt.executeQuery(befehlBKunde);
		ResultSet rs3 = stmt.executeQuery(befehlAdmin);
		
		if (rs1.next()) {
			i=3;
		}
		if (rs2.next()) {
			i=2;
		}
		
		if (rs3.next()) {
			i=4;
		}
		
		
		stmt.close();
		con.close();
		
		
		return i;
		
		

	}

}
