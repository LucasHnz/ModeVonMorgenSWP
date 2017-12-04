package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.SQLException;

public class TestCheckBerechtigung {
	
	public static void main(String[]args) throws SQLException {
		String email = "julian-hermann@test.de";
		int i =0;
		i = Controller.CheckBerechtigung.checkBerechtigung(email);
		
		System.out.println(i);
	}

}
