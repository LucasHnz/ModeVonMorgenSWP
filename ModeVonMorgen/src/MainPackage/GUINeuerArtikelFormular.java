package MainPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
/**
 * 
 * @author maoro
 *
 */
public class GUINeuerArtikelFormular extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblGeschlecht;
	private JLabel lblHersteller;
	private JLabel lblVerfgbarkeit;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblBestand;
	private JLabel lblLieferanten;
	private JLabel lblPreis;
	private JLabel lblRabatt;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel label;
	private JLabel label_1;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUINeuerArtikelFormular frame = new GUINeuerArtikelFormular();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUINeuerArtikelFormular() {
		setAlwaysOnTop(true);
		setType(Type.POPUP);
		setTitle("Neues Accessoir");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArtikelnummer = new JLabel("Artikelnummer");
		lblArtikelnummer.setBounds(5, 15, 68, 14);
		contentPane.add(lblArtikelnummer);
		
		textField = new JTextField();
		textField.setBounds(87, 12, 204, 20);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBezeichnung = new JLabel("Bezeichnung");
		lblBezeichnung.setBounds(5, 55, 60, 14);
		contentPane.add(lblBezeichnung);
		
		textField_1 = new JTextField();
		textField_1.setBounds(87, 52, 204, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblArt = new JLabel("Art");
		lblArt.setBounds(5, 95, 15, 14);
		contentPane.add(lblArt);
		
		textField_2 = new JTextField();
		textField_2.setBounds(87, 92, 204, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblHersteller = new JLabel("Hersteller");
		lblHersteller.setBounds(5, 135, 46, 14);
		contentPane.add(lblHersteller);
		
		textField_3 = new JTextField();
		textField_3.setBounds(87, 132, 204, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblVerfgbarkeit = new JLabel("Verf\u00FCgbarkeit");
		lblVerfgbarkeit.setBounds(5, 255, 65, 14);
		contentPane.add(lblVerfgbarkeit);
		
		lblBestand = new JLabel("Bestand");
		lblBestand.setBounds(5, 215, 39, 14);
		contentPane.add(lblBestand);
		
		lblLieferanten = new JLabel("Lieferanten");
		lblLieferanten.setBounds(5, 175, 55, 14);
		contentPane.add(lblLieferanten);
		
		lblPreis = new JLabel("Preis");
		lblPreis.setBounds(5, 335, 23, 14);
		contentPane.add(lblPreis);
		
		lblRabatt = new JLabel("Rabatt");
		lblRabatt.setBounds(5, 375, 33, 14);
		contentPane.add(lblRabatt);
		
		textField_4 = new JTextField();
		textField_4.setBounds(87, 372, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblGeschlecht = new JLabel("Geschlecht");
		lblGeschlecht.setBounds(5, 415, 52, 14);
		contentPane.add(lblGeschlecht);
		
		JRadioButton rdbtnWeiblich = new JRadioButton("Weiblich");
		buttonGroup.add(rdbtnWeiblich);
		rdbtnWeiblich.setBounds(201, 412, 90, 23);
		contentPane.add(rdbtnWeiblich);
		
		JRadioButton rdbtnMnnlich = new JRadioButton("M\u00E4nnlich");
		buttonGroup.add(rdbtnMnnlich);
		rdbtnMnnlich.setBounds(87, 412, 90, 23);
		contentPane.add(rdbtnMnnlich);
		
		textField_6 = new JTextField();
		textField_6.setBounds(87, 212, 204, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(87, 172, 204, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(87, 332, 86, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAbbrechen.setBounds(87, 442, 90, 40);
		contentPane.add(btnAbbrechen);
		
		JButton btnBestätigen = new JButton("Bestätigen");
		btnBestätigen.setBounds(201, 442, 90, 40);
		contentPane.add(btnBestätigen);
		
		label = new JLabel("\u20AC");
		label.setBounds(175, 335, 46, 14);
		contentPane.add(label);
		
		label_1 = new JLabel("\u20AC");
		label_1.setBounds(175, 375, 46, 14);
		contentPane.add(label_1);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(87, 252, 202, 20);
		contentPane.add(comboBox);
		
		JLabel lblFarbe = new JLabel("Farbe");
		lblFarbe.setBounds(5, 295, 46, 14);
		contentPane.add(lblFarbe);
		
		textField_5 = new JTextField();
		textField_5.setBounds(87, 292, 204, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	}
}
