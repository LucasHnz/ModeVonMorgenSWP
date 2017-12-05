package View;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIKontoVerwalten implements ActionListener{
	
	JButton btnZurück = new JButton();
	public JComboBox comboBoxHerren = new JComboBox();
	public JComboBox comboBoxDamen = new JComboBox();
	public JComboBox comboBoxAnmelden = new JComboBox();
	public String[] damenCbList;
	public String[] herrenCbList;
	public String[] anmeldenCbList;

	private JFrame frame;
	private JTextField textFieldKontoVorname;
	private JTextField textFieldKontoName;
	private JTextField textFieldKontoEmail;
	private JTextField textFieldKontoStraße;
	private JTextField textFieldKontoPlz;
	private JTextField textFieldKontoOrt;
	private JTextField textFieldIBAN;
	
	public String testName = "Küster";
	public String testVorname = "Jochen";
	public String testEmail = "jochen.kuester@fh-bielefeld.de";
	public String testStraße = "Softwarestraße";
	public String testPLZ = "4711";
	public String testOrt = "MainbORT";
	public String testIBAN = "DE 1234 5678 9";
	
	/**
	 * Create the application.
	 */
	public GUIKontoVerwalten(String[]damenCbList, String[]herrenCbList, String[]anmeldenCbList) {
		this.damenCbList = damenCbList;
		this.herrenCbList = herrenCbList;
		this.anmeldenCbList = anmeldenCbList;
		initialize(damenCbList, herrenCbList, anmeldenCbList);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String[]damenCbList, String[]herrenCbList, String[]anmeldenCbList) {
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
		
		btnZurück = new JButton("Zur\u00FCck");
		btnZurück.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		btnZurück.setBackground(Color.WHITE);
		btnZurück.setBounds(10, 11, 89, 35);
		btnZurück.addActionListener(this);
		panelMain.add(btnZurück);
		
		
		JPanel panelKontoverwaltung = new JPanel();
		panelKontoverwaltung.setBackground(SystemColor.control);
		JScrollPane scrollPaneKontoVerwalten = new JScrollPane(panelKontoverwaltung);
		scrollPaneKontoVerwalten.setBounds(206, 103, 590, 433);
		panelMain.add(scrollPaneKontoVerwalten);
		panelKontoverwaltung.setLayout(null);
		
		JLabel lblVorname = new JLabel("Vorname:");
		lblVorname.setBounds(0, 0, 0, 0);
		panelKontoverwaltung.add(lblVorname);
		
		JLabel lblVorname_1 = new JLabel("Vorname:");
		lblVorname_1.setBounds(60, 35, 90, 28);
		lblVorname_1.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		panelKontoverwaltung.add(lblVorname_1);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(60, 88, 71, 28);
		lblName.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		panelKontoverwaltung.add(lblName);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setBounds(60, 143, 71, 28);
		lblEmail.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		panelKontoverwaltung.add(lblEmail);
		
		JLabel lblStrae = new JLabel("Stra\u00DFe:");
		lblStrae.setBounds(60, 201, 71, 28);
		lblStrae.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		panelKontoverwaltung.add(lblStrae);
		
		JLabel lblPlz = new JLabel("PLZ:");
		lblPlz.setBounds(60, 254, 71, 28);
		lblPlz.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		panelKontoverwaltung.add(lblPlz);
		
		JLabel lblOrt = new JLabel("Ort:");
		lblOrt.setBounds(60, 305, 71, 28);
		lblOrt.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		panelKontoverwaltung.add(lblOrt);
		
		JLabel lblIban = new JLabel("IBAN:");
		lblIban.setBounds(60, 359, 71, 28);
		lblIban.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		panelKontoverwaltung.add(lblIban);
		
		textFieldKontoVorname = new JTextField(testVorname);
		textFieldKontoVorname.setBounds(205, 33, 164, 28);
		panelKontoverwaltung.add(textFieldKontoVorname);
		textFieldKontoVorname.setColumns(10);
		
		textFieldKontoName = new JTextField(testName);
		textFieldKontoName.setBounds(205, 94, 164, 28);
		textFieldKontoName.setColumns(10);
		panelKontoverwaltung.add(textFieldKontoName);
		
		textFieldKontoEmail = new JTextField(testEmail);
		textFieldKontoEmail.setBounds(205, 149, 164, 28);
		textFieldKontoEmail.setColumns(10);
		panelKontoverwaltung.add(textFieldKontoEmail);
		
		textFieldKontoStraße = new JTextField(testStraße);
		textFieldKontoStraße.setBounds(205, 201, 164, 28);
		textFieldKontoStraße.setColumns(10);
		panelKontoverwaltung.add(textFieldKontoStraße);
		
		textFieldKontoPlz = new JTextField(testPLZ);
		textFieldKontoPlz.setBounds(205, 256, 164, 28);
		textFieldKontoPlz.setColumns(10);
		panelKontoverwaltung.add(textFieldKontoPlz);
		
		textFieldKontoOrt = new JTextField(testOrt);
		textFieldKontoOrt.setBounds(205, 305, 164, 28);
		textFieldKontoOrt.setColumns(10);
		panelKontoverwaltung.add(textFieldKontoOrt);
		
		textFieldIBAN = new JTextField(testIBAN);
		textFieldIBAN.setBounds(205, 359, 164, 28);
		textFieldIBAN.setColumns(10);
		panelKontoverwaltung.add(textFieldIBAN);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(379, 35, 33, 23);
		panelKontoverwaltung.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(379, 93, 33, 23);
		panelKontoverwaltung.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(379, 148, 33, 23);
		panelKontoverwaltung.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(379, 201, 33, 23);
		panelKontoverwaltung.add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(379, 254, 33, 23);
		panelKontoverwaltung.add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(379, 308, 33, 23);
		panelKontoverwaltung.add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(379, 359, 33, 23);
		panelKontoverwaltung.add(button_5);
		

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnZurück) 
		{
			frame.dispose();
			new GUI();
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
				new GUIAnmelden();
			}

		    if(auswahl == "Meine Bestellungen") {
			    new GUIKontoBestellungen(damenCbList, herrenCbList, anmeldenCbList);
			}
		    
		    if(auswahl == "Konto verwalten") {
			    new GUIKontoVerwalten(damenCbList, herrenCbList, anmeldenCbList);
			}
		}
		
	}
}
