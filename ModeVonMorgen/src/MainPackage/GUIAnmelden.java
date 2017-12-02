package MainPackage;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIAnmelden implements ActionListener {
	
	JTextField anmeldenEmail = new JTextField();
	JPasswordField anmeldenPasswort = new JPasswordField();
	JButton btnAnmeldenEinloggen = new JButton("Einloggen");
	JButton btnAnmeldenAbbrechen = new JButton("Abbrechen");
	String testEmail = "jochen.kuester@fh-bielefeld.de";
	String testPasswort = "12345678";
	String testPwMitarbeiter = "123";
	String testMailMitarbeiter = "test";
	String[] anmeldenCbList;

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public GUIAnmelden() {
		initialize();
	}
	
	public GUIAnmelden(String[]anmeldenCbList) {
		this.anmeldenCbList = anmeldenCbList;
		System.out.println("Ausgeführt Anmelden");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(1000, 179, 260, 90);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    frame.setLayout(new GridLayout(3,2));
		
	    frame.add(new JLabel("Email"));
	    frame.add(anmeldenEmail);
	    frame.add(new JLabel("Passwort"));
	    frame.add(anmeldenPasswort);
	    frame.add(btnAnmeldenAbbrechen);
	    btnAnmeldenAbbrechen.setBackground(SystemColor.control);
	    btnAnmeldenAbbrechen.addActionListener(this);
	    frame.add(btnAnmeldenEinloggen);
	    btnAnmeldenEinloggen.setBackground(SystemColor.control);
	    btnAnmeldenEinloggen.addActionListener(this);
	    
	  
	    frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnAnmeldenAbbrechen) {
			frame.dispose();
		}
		
		if(e.getSource() == btnAnmeldenEinloggen) {
			
			String pwd = new String(anmeldenPasswort.getPassword());
			
			if(anmeldenEmail.getText().equals(testEmail) && pwd.equals( testPasswort)) {
				System.out.println("GUI");
				GUI.fensterSchließen();
				anmeldenCbList[0] = "Jochen";
				new GUI(anmeldenCbList);
				frame.dispose();
				
			}if(anmeldenEmail.getText().equals(testMailMitarbeiter) && pwd.equals(testPwMitarbeiter)) {
				GUI.fensterSchließen();
				anmeldenCbList[0] = "Mitarbeiter";
				new GUIMitarbeiter(anmeldenCbList);
				frame.dispose();
			}
			
			
		}
		
		
	}
}