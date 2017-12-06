package Controller;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

import MainPackage.GUI;
import MainPackage.GUIAnmelden;
import MainPackage.GUIMitarbeiter;

public class LogStrg {
	
	static String testEmail = "jochen.kuester@fh-bielefeld.de";
	static String testPasswort = "12345678";
	static String testPwMitarbeiter = "123";
	static String testMailMitarbeiter = "test";
	
	public static  void anmelden(String pwd, String email, String[]anmeldenCbList) {
		try 
		{
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@aix1.fh-bielefeld.de:1521:d2");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select email and passwort from "
					+ "(Mitarbeiter, Kunden, Bestandskunden, Administrator)");
			
			rs.next();
		
			String userEmail = rs.getString("email");
			String userPasswort = rs.getString("passwort");
			String userName = rs.getString("vorname");
			
			if(email.equals(userEmail) && pwd.equals(userPasswort)) {
				GUI.fensterSchlieﬂen();
				anmeldenCbList[0] = userName;
				new GUI(anmeldenCbList);
				
			}
			if(email.equals(testMailMitarbeiter) && pwd.equals(testPwMitarbeiter)) {
				GUI.fensterSchlieﬂen();
				anmeldenCbList[0] = "Mitarbeiter";
				new GUIMitarbeiter(anmeldenCbList);
			}
		
			
			rs.close();
			stmt.close();
			con.close();
			
		}catch(SQLException e) {
                            			
		}

	
	}
}
