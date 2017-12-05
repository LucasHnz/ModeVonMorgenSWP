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

public class GUINeuerArtikelFormular extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 609);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblArtikelnummer = new JLabel("Artikelnummer");
		GridBagConstraints gbc_lblArtikelnummer = new GridBagConstraints();
		gbc_lblArtikelnummer.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblArtikelnummer.insets = new Insets(0, 0, 5, 5);
		gbc_lblArtikelnummer.gridx = 0;
		gbc_lblArtikelnummer.gridy = 5;
		contentPane.add(lblArtikelnummer, gbc_lblArtikelnummer);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 6;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblBezeichnung = new JLabel("Bezeichnung");
		GridBagConstraints gbc_lblBezeichnung = new GridBagConstraints();
		gbc_lblBezeichnung.anchor = GridBagConstraints.EAST;
		gbc_lblBezeichnung.insets = new Insets(0, 0, 5, 5);
		gbc_lblBezeichnung.gridx = 0;
		gbc_lblBezeichnung.gridy = 7;
		contentPane.add(lblBezeichnung, gbc_lblBezeichnung);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 7;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblArt = new JLabel("Art");
		GridBagConstraints gbc_lblArt = new GridBagConstraints();
		gbc_lblArt.anchor = GridBagConstraints.EAST;
		gbc_lblArt.insets = new Insets(0, 0, 0, 5);
		gbc_lblArt.gridx = 0;
		gbc_lblArt.gridy = 8;
		contentPane.add(lblArt, gbc_lblArt);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 8;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
	}

}
