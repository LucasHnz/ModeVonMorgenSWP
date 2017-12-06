package MainPackage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.NumberFormatter;

import Controller.ArtikelStrg;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
/**
 * 
 * @author fmaoro
 *
 */
public class GUINeuerArtikelFormular extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFormattedTextField textFieldArtikelnummer;
	private JTextField textFieldBezeichnung;
	private JTextField textFieldArt;
	private JLabel lblGeschlecht;
	private JLabel lblHersteller;
	private JLabel lblVerfgbarkeit;
	private JTextField textFieldHersteller;
	private JTextField textFieldRabatt;
	private JLabel lblBestand;
	private JLabel lblLieferanten;
	private JLabel lblPreis;
	private JLabel lblRabatt;
	private JTextField textFieldPreis;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel label;
	private JLabel label_1;
	private JTextField textField_5;
	private JScrollPane scrollPane;
	private String titel;
	private String[] verfügbarkeiten = {"Sofort lieferbar", "Lieferbar in 1-3 Tagen", "Lieferbar in 1-3 Wochen", "Nicht mehr Verfügbar"};
	private String[] größen = {"XS", "S", "M", "L", "XL", "XXL"};
	private JComboBox comboBoxVerfügbarkeit;
	private JComboBox comboBoxGröße;
	

	/**
	 * Create the frame.
	 */
	public GUINeuerArtikelFormular(String kateg) {
		if(kateg == "Schuhe")
			titel= "Neuer Schuh";
		else if(kateg == "Accessoires")
			titel= "Neues Accesoir";
		else if(kateg == "Kleidung")
			titel= "Neuer Kleidungsartikel";
		setResizable(false);
		setAlwaysOnTop(true);
		setType(Type.POPUP);
		setTitle(titel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NumberFormat preisformat = NumberFormat.getNumberInstance(); 
        preisformat.setGroupingUsed(false); 
        preisformat.setMaximumIntegerDigits(6);
        preisformat.setMinimumIntegerDigits(1);
        preisformat.setMaximumFractionDigits(2);
        preisformat.setMinimumFractionDigits(2);
        NumberFormatter preisformatter = new NumberFormatter(preisformat); 
        
        NumberFormat schuhformat = NumberFormat.getIntegerInstance();
        schuhformat.setGroupingUsed(false);
        schuhformat.setMaximumIntegerDigits(2);
        schuhformat.setMinimumIntegerDigits(2);
        NumberFormatter schuhformatter = new NumberFormatter(schuhformat);
		
		JLabel lblArtikelnummer = new JLabel("Artikelnummer");
		lblArtikelnummer.setHorizontalTextPosition(SwingConstants.LEFT);
		lblArtikelnummer.setBounds(5, 15, 90, 14);
		contentPane.add(lblArtikelnummer);
		
		NumberFormat format = NumberFormat.getIntegerInstance(); 
        format.setGroupingUsed(false); 
        format.setMaximumIntegerDigits(9);
        format.setMinimumIntegerDigits(9);
        NumberFormatter formatter = new NumberFormatter(format); 
        formatter.setAllowsInvalid(false); 
    	textFieldArtikelnummer = new JFormattedTextField(formatter);
		textFieldArtikelnummer.setToolTipText("Die Artikelnummer muss 9 Stellen haben");
		textFieldArtikelnummer.setBounds(105, 12, 204, 20);
		textFieldArtikelnummer.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(textFieldArtikelnummer);
		textFieldArtikelnummer.setColumns(10);
		
		JLabel lblBezeichnung = new JLabel("Bezeichnung");
		lblBezeichnung.setBounds(5, 55, 86, 14);
		contentPane.add(lblBezeichnung);
		
		textFieldBezeichnung = new JTextField();
		textFieldBezeichnung.setToolTipText("Name des Artikels");
		textFieldBezeichnung.setBounds(105, 52, 204, 20);
		contentPane.add(textFieldBezeichnung);
		textFieldBezeichnung.setColumns(10);
		
		JLabel lblArt = new JLabel("Art");
		lblArt.setBounds(5, 95, 86, 14);
		contentPane.add(lblArt);
		
		textFieldArt = new JTextField();
		textFieldArt.setToolTipText("Unterkategorie wie z.B. Laufschuhe, Sneaker, etc.");
		textFieldArt.setBounds(105, 92, 204, 20);
		contentPane.add(textFieldArt);
		textFieldArt.setColumns(10);
		
		lblHersteller = new JLabel("Hersteller");
		lblHersteller.setBounds(5, 135, 86, 14);
		contentPane.add(lblHersteller);
		
		textFieldHersteller = new JTextField();
		textFieldHersteller.setToolTipText("Die Marke des Artikels");
		textFieldHersteller.setBounds(105, 132, 204, 20);
		contentPane.add(textFieldHersteller);
		textFieldHersteller.setColumns(10);
		
		lblVerfgbarkeit = new JLabel("Verf\u00FCgbarkeit");
		lblVerfgbarkeit.setBounds(5, 285, 90, 14);
		contentPane.add(lblVerfgbarkeit);
		
		lblBestand = new JLabel("Bestand");
		lblBestand.setBounds(5, 325, 86, 14);
		contentPane.add(lblBestand);
		
		lblLieferanten = new JLabel("Lieferanten");
		lblLieferanten.setBounds(5, 175, 86, 14);
		contentPane.add(lblLieferanten);
		
		lblPreis = new JLabel("Preis");
		lblPreis.setBounds(5, 365, 86, 14);
		contentPane.add(lblPreis);
		
		lblRabatt = new JLabel("Rabatt");
		lblRabatt.setBounds(5, 405, 86, 14);
		contentPane.add(lblRabatt);
		
		textFieldRabatt = new JFormattedTextField(preisformatter);
		textFieldRabatt.setBounds(105, 402, 86, 20);
		contentPane.add(textFieldRabatt);
		textFieldRabatt.setColumns(10);
		
		lblGeschlecht = new JLabel("Geschlecht");
		lblGeschlecht.setBounds(5, 445, 90, 14);
		contentPane.add(lblGeschlecht);
		
		JRadioButton rdbtnWeiblich = new JRadioButton("Weiblich");
		buttonGroup.add(rdbtnWeiblich);
		rdbtnWeiblich.setBounds(219, 441, 90, 23);
		contentPane.add(rdbtnWeiblich);
		
		JRadioButton rdbtnMnnlich = new JRadioButton("M\u00E4nnlich");
		buttonGroup.add(rdbtnMnnlich);
		rdbtnMnnlich.setBounds(105, 441, 90, 23);
		contentPane.add(rdbtnMnnlich);
		
		
        formatter.setAllowsInvalid(false); 
		textFieldPreis = new JFormattedTextField(preisformatter);
		textFieldPreis.setBounds(105, 362, 86, 20);
		contentPane.add(textFieldPreis);
		textFieldPreis.setColumns(10);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAbbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnAbbrechen.setBounds(105, 471, 90, 40);
		contentPane.add(btnAbbrechen);
				
		label = new JLabel("\u20AC");
		label.setBounds(201, 365, 46, 14);
		contentPane.add(label);
		
		label_1 = new JLabel("\u20AC");
		label_1.setBounds(201, 405, 46, 14);
		contentPane.add(label_1);
				
		comboBoxVerfügbarkeit = new JComboBox(verfügbarkeiten);
		comboBoxVerfügbarkeit.setBounds(105, 282, 202, 20);
		contentPane.add(comboBoxVerfügbarkeit);
	
		if(kateg == "Accessoires") {
			JLabel lblFarbe = new JLabel("Farbe");
			lblFarbe.setBounds(5, 245, 86, 14);
			contentPane.add(lblFarbe);
		
			textField_5 = new JTextField();
			textField_5.setBounds(105, 242, 204, 20);
			contentPane.add(textField_5);
			textField_5.setColumns(10);
		}
		else if(kateg == "Schuhe") {
			JLabel lblSchuhgröße = new JLabel("Schuhgröße");
			lblSchuhgröße.setBounds(5, 245, 86, 14);
			contentPane.add(lblSchuhgröße);
		
			textField_5 = new JFormattedTextField(schuhformatter);
			textField_5.setBounds(105, 242, 204, 20);
			contentPane.add(textField_5);
			textField_5.setColumns(10);
		}
		else if(kateg == "Größe") {
			JLabel lblGröße = new JLabel("Größe");
			lblGröße.setBounds(5, 245, 86, 14);
			contentPane.add(lblGröße);
					
			comboBoxGröße = new JComboBox(größen);
			comboBoxVerfügbarkeit.setBounds(105, 242, 204, 20);
			contentPane.add(comboBoxVerfügbarkeit);
		}
		SpinnerModel model = new SpinnerNumberModel(0, 0, 99999, 1);
		JSpinner spinnerBestand = new JSpinner(model);
		spinnerBestand.setBounds(105, 322, 86, 20);
		contentPane.add(spinnerBestand);
		
		JTextArea taLieferanten = new JTextArea("Hier die Lieferanten eintragen. Alle müssen durch ein Komma getrennt sein");
		taLieferanten.setFont(new Font("Tahoma", Font.PLAIN, 11));
		taLieferanten.setLineWrap(true);
		taLieferanten.setWrapStyleWord(true);
		
		scrollPane = new JScrollPane(taLieferanten);
		scrollPane.setBounds(105, 171, 204, 60);
		contentPane.add(scrollPane);
		
		JButton btnBestätigen = new JButton("Bestätigen");
		btnBestätigen.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnBestätigen.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int Artikelnummer = Integer.parseInt(textFieldArtikelnummer.getText());			
				int Bestand = (int) spinnerBestand.getValue();
				String Bezeichnung = textFieldBezeichnung.getText();
				String Geschlecht;
				if(rdbtnWeiblich.isSelected())
					Geschlecht = "Weiblich";
				else 
					Geschlecht = "Männlich";				
				String Hersteller = textFieldHersteller.getText(); 
				String Verfügbarkeit = (String) comboBoxVerfügbarkeit.getSelectedItem();
				String Notiz = null;
				String[] Lieferanten = taLieferanten.getText().split(",");
				double Preis = Double.parseDouble(textFieldPreis.getText());
				double Rabatt = Double.parseDouble(textFieldRabatt.getText());
				int Schuhgröße = 0;
				String Farbe = null;
				String Größe = null;
				if(kateg == "Schuhe")
					Schuhgröße = Integer.parseInt(textField_5.getText());
				else if(kateg == "Accessoires")
					Farbe = textField_5.getText();
				else if(kateg == "Kleidung")
					Größe = (String) comboBoxGröße.getSelectedItem();
				ArtikelStrg.NeuerArtikel(kateg, Artikelnummer, Bestand, Bezeichnung, Geschlecht, 
						Hersteller, Verfügbarkeit, Notiz, Lieferanten, Preis, Rabatt, Schuhgröße, Farbe,
						Größe);
				
		}});
		btnBestätigen.setBounds(219, 472, 90, 40);
		contentPane.add(btnBestätigen);
	}
}
