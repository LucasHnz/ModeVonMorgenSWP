package View;

import java.awt.EventQueue;

/**
 * 
 * @author Hinz
 *
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;




public class GUI implements ActionListener {
	
	
	public String[] damenCbList = {"Damen", "-----------------------------------", "Kleidung", "Schuhe", "Accessoires"};
	public String[] herrenCbList = {"Herren","------------------------------------", "Kleidung", "Schuhe", "Accessoires"};
	public static String[] anmeldenCbList = {"Anmelden", "Meine Bestellungen", "Konto verwalten"};
	private static JFrame frame;
	public static boolean angemeldet = false;
	public int rotierung = 1;
	public String[] outfitsDamenListe = {"C:\\\\Users\\\\hinzl\\\\Desktop\\\\SWP-Bilder\\\\frau1.jpg","C:\\\\Users\\\\hinzl\\\\Desktop\\\\SWP-Bilder\\\\frau2.jpg"};
	
	public JButton btnProduktDamenLinks = new JButton();
	public JButton btnProduktDamenRechts = new JButton();
	public JButton btnProduktHerrenLinks = new JButton();
	public JButton btnProduktHerrenRechts= new JButton();
	public JButton btnProduktDamen;
	public JButton btnProduktHerren;
	public JLabel labelMainDamen = new JLabel();
	public JLabel labelMainHerren = new JLabel();
	public JComboBox comboBoxHerren = new JComboBox();
	public JComboBox comboBoxDamen = new JComboBox();
	public JComboBox comboBoxAnmelden = new JComboBox();
	public JButton btnZurück = new JButton();
	//public static JButton btnAnmelden = new JButton();
	
	public static void fensterSchließen() {
		frame.dispose();
	}
	
	public void wechselOutfitDamenRechts() 
	{
		
		 labelMainDamen.setIcon(new ImageIcon("C:\\Users\\hinzl\\Desktop\\SWP-Bilder\\frau1.jpg"));
		 
	}
	
	public void wechselOutfitDamenLinks() 
	{
		
		 labelMainDamen.setIcon(new ImageIcon("C:\\Users\\hinzl\\Desktop\\SWP-Bilder\\frau2.jpg"));
		
	}
	
	public void wechselOutfitHerrenRechts() 
	{
		
		 labelMainHerren.setIcon(new ImageIcon("C:\\Users\\hinzl\\Desktop\\SWP-Bilder\\mann2.jpg"));

	}
	
	public void wechselOutfitHerrenLinks() 
	{
		
		 labelMainHerren.setIcon(new ImageIcon("C:\\\\Users\\hinzl\\Desktop\\SWP-Bilder\\mann1.jpg"));
		
	}

	
	public static void main(String[] args) 
	{
		new GUI();
	}
	
	/**
	 * Create the application.
	 */
	
	public GUI() {
		System.out.println("Ausgeführt Main");
		initializeMain();
	}
	
	public GUI(String[] anmeldenCbList) {
		this.anmeldenCbList = anmeldenCbList;
		angemeldet = true;
		initializeMain();
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initializeMain() {
		
		frame = new JFrame();
		frame.setBounds(20, 20, 1250, 750);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelLogo = new JPanel();
		panelLogo.setBackground(Color.WHITE);
		panelLogo.setBounds(0, 0, 1234, 99);
		frame.getContentPane().add(panelLogo);
		panelLogo.setLayout(null);
		
		JLabel labelLogo = new JLabel("New label");
		labelLogo.setBounds(56, 0, 1226, 99);
		labelLogo.setIcon(new ImageIcon("C:\\Users\\hinzl\\Desktop\\SWP-Bilder\\modeLogo.jpg"));
		panelLogo.add(labelLogo);
		
		JPanel panelBar = new JPanel();
		panelBar.setBackground(SystemColor.control);
		panelBar.setBounds(0, 98, 1234, 50);
		frame.getContentPane().add(panelBar);
		panelBar.setLayout(null);
		
		comboBoxDamen = new JComboBox(damenCbList);
		comboBoxDamen.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		comboBoxDamen.setBackground(SystemColor.control);
		comboBoxDamen.setBounds(10, 0, 250, 50);
		comboBoxDamen.addActionListener(this);
		panelBar.add(comboBoxDamen);
		
		comboBoxHerren = new JComboBox(herrenCbList);
		comboBoxHerren.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		comboBoxHerren.setBackground(SystemColor.control);
		comboBoxHerren.setBounds(270, 0, 250, 50);
		comboBoxHerren.addActionListener(this);
		panelBar.add(comboBoxHerren);
		
		comboBoxAnmelden = new JComboBox(anmeldenCbList);
		comboBoxAnmelden.setBounds(1040, 0, 173, 50);
		comboBoxAnmelden.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		comboBoxAnmelden.setBackground(SystemColor.control);
		comboBoxAnmelden.addActionListener(this);
		panelBar.add(comboBoxAnmelden);
		
		JPanel panelMain = new JPanel();
		panelMain.setBackground(Color.WHITE);
		panelMain.setBounds(0, 148, 1234, 563);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);
		
		btnProduktDamen = new JButton("Zum Produkt");
		btnProduktDamen.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		btnProduktDamen.setBackground(Color.WHITE);
		btnProduktDamen.setForeground(Color.BLACK);
		btnProduktDamen.setBounds(249, 458, 165, 35);
		btnProduktDamen.addActionListener(this);
		panelMain.add(btnProduktDamen);
		
		btnProduktHerren = new JButton("Zum Produkt");
		btnProduktHerren.setBackground(Color.WHITE);
		btnProduktHerren.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		btnProduktHerren.setBounds(774, 458, 165, 35);
		btnProduktHerren.addActionListener(this);
		panelMain.add(btnProduktHerren);
		
		btnProduktDamenRechts = new JButton(">");
		btnProduktDamenRechts.setBackground(Color.WHITE);
		btnProduktDamenRechts.setBounds(483, 191, 41, 70);
		btnProduktDamenRechts.addActionListener(this);
		panelMain.add(btnProduktDamenRechts);
		
		btnProduktDamenLinks = new JButton("<");
		btnProduktDamenLinks.setBackground(Color.WHITE);
		btnProduktDamenLinks.setBounds(144, 191, 41, 70);
		btnProduktDamenLinks.addActionListener(this);
		panelMain.add(btnProduktDamenLinks);
		
		btnProduktHerrenRechts = new JButton(">");
		btnProduktHerrenRechts.setBackground(Color.WHITE);
		btnProduktHerrenRechts.setBounds(995, 191, 41, 70);
		btnProduktHerrenRechts.addActionListener(this);
		panelMain.add(btnProduktHerrenRechts);
		
		btnProduktHerrenLinks = new JButton("<");
		btnProduktHerrenLinks.setBackground(Color.WHITE);
		btnProduktHerrenLinks.setBounds(656, 191, 41, 70);
		btnProduktHerrenLinks.addActionListener(this);
		panelMain.add(btnProduktHerrenLinks);
		
		
		labelMainDamen = new JLabel();
		labelMainDamen.setHorizontalAlignment(SwingConstants.CENTER);
		labelMainDamen.setVerticalAlignment(SwingConstants.TOP);
		labelMainDamen.setBounds(144, 76, 380, 450);
		labelMainDamen.setIcon(new ImageIcon("C:\\Users\\hinzl\\Desktop\\SWP-Bilder\\frau2.jpg"));
		panelMain.add(labelMainDamen);
		
		labelMainHerren = new JLabel("New label");
		labelMainHerren.setHorizontalAlignment(SwingConstants.CENTER);
		labelMainHerren.setVerticalAlignment(SwingConstants.TOP);
		labelMainHerren.setBounds(656, 76, 380, 450);
		labelMainHerren.setIcon(new ImageIcon("C:\\Users\\hinzl\\Desktop\\SWP-Bilder\\mann1.jpg"));
		panelMain.add(labelMainHerren);
		
		JLabel labelMainHintergrund = new JLabel();
		labelMainHintergrund.setBounds(0, 0, 1234, 711);
		panelMain.add(labelMainHintergrund);
		
		frame.setVisible(true);
	
	}
	

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource() == btnProduktDamen) 
		{
			frame.dispose();
			//Seite des Produktes
			
		}
		
		if(e.getSource() == btnProduktHerren) 
		{
			frame.dispose();
			//Seite des Produktes
			
		}
		
		if (e.getSource() == btnProduktDamenRechts){
			
			wechselOutfitDamenRechts();
		}
		
		if (e.getSource() == btnProduktDamenLinks){
			
			wechselOutfitDamenLinks();
		}
		
		if (e.getSource() == btnProduktHerrenRechts){
			
			wechselOutfitHerrenRechts();
		}
		
		if (e.getSource() == btnProduktHerrenLinks){
			
			wechselOutfitHerrenLinks();
		}
		
		if(e.getSource() == comboBoxHerren){
			
			String auswahl = (String) comboBoxHerren.getSelectedItem();
		    
			if(auswahl == "Kleidung"){
				frame.dispose();
			  new GUIHerrenKleidung(damenCbList, herrenCbList, anmeldenCbList);
			 
		    }
		  
			if(auswahl == "Schuhe"){
			  frame.dispose();
			  new GUIHerrenSchuhe(damenCbList, herrenCbList, anmeldenCbList);
			  
			}
			
			if(auswahl == "Accessoires"){
				frame.dispose();
			  new GUIHerrenAccessoires(damenCbList, herrenCbList, anmeldenCbList);
			  
			}
		}
		
		if(e.getSource() == comboBoxDamen){
			
			String auswahl = (String) comboBoxDamen.getSelectedItem();
			
			if(auswahl == "Kleidung"){
				 frame.dispose();
				 new GUIDamenKleidung(damenCbList, herrenCbList, anmeldenCbList);
			    }
			  
				if(auswahl == "Schuhe"){
					frame.dispose();
				  new GUIDamenSchuhe(damenCbList, herrenCbList, anmeldenCbList);
				 
				}
				
				if(auswahl == "Accessoires"){
					frame.dispose();
				  new GUIDamenAccessoires(damenCbList, herrenCbList, anmeldenCbList);
				  
				}
				
		}
		
		if (e.getSource() == comboBoxAnmelden) {
			
			String auswahl = (String) comboBoxAnmelden.getSelectedItem();
			
			if(auswahl == "Anmelden") {
				new GUIAnmelden(anmeldenCbList);
			}

		    if(auswahl == "Meine Bestellungen" && angemeldet == true) {
			    new GUIKontoBestellungen(damenCbList, herrenCbList, anmeldenCbList);
			}
		    if(auswahl == "Meine Bestellungen" && angemeldet == false) {
		    	new GUIAnmelden(anmeldenCbList);
		    }
		    
		    if(auswahl == "Konto verwalten" && angemeldet == true) {
			    new GUIKontoVerwalten(damenCbList, herrenCbList, anmeldenCbList);
			}
		    if(auswahl == "Konto verwalten" && angemeldet == false) {
		    	new GUIAnmelden(anmeldenCbList);
		    }
		}
	
		
	}

}
