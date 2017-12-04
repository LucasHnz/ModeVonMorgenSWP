package Controller;

import java.awt.event.ActionEvent;

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
		
	
		
	
		if(email.equals(testEmail) && pwd.equals( testPasswort)) {
			System.out.println("GUI");
			GUI.fensterSchlieﬂen();
			anmeldenCbList[0] = "Jochen";
			new GUI(anmeldenCbList);
			
		}
		if(email.equals(testMailMitarbeiter) && pwd.equals(testPwMitarbeiter)) {
			GUI.fensterSchlieﬂen();
			anmeldenCbList[0] = "Mitarbeiter";
			new GUIMitarbeiter(anmeldenCbList);
		}
	
	
	}
}
