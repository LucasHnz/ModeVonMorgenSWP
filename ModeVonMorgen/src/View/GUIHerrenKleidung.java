package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class GUIHerrenKleidung implements ActionListener{
	
	JButton btnZurück = new JButton();
	JButton btnAnmelden = new JButton();
	public JComboBox comboBoxHerren = new JComboBox();
	public JComboBox comboBoxDamen = new JComboBox();
	public JComboBox comboBoxAnmelden = new JComboBox();
	public String[] damenCbList;
	public String[] herrenCbList;
	public String[] anmeldenCbList;
	public JPanel panelHerrenKleidung = new JPanel();
	

	private JFrame frame;


	/**
	 * Create the application.
	 */
	public GUIHerrenKleidung(String[]damenCbList, String[]herrenCbList, String[]anmeldenCbList) {
		System.out.println("Ausgeführt HK");
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
		panelMain.setBounds(0, 147, 1234, 563);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);
		
		JPanel panelScrollPaneBar = new JPanel();
		panelScrollPaneBar.setBackground(SystemColor.control);
		panelScrollPaneBar.setLayout(null);
		
		JScrollPane scrollPaneHerrenKleidungBar = new JScrollPane(panelScrollPaneBar);
		scrollPaneHerrenKleidungBar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneHerrenKleidungBar.setBounds(10, 97, 270, 455);
		panelMain.add(scrollPaneHerrenKleidungBar);
		
	
		JScrollPane scrollPaneHerrenKleidung = new JScrollPane(panelHerrenKleidung);
		scrollPaneHerrenKleidung.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelHerrenKleidung.setPreferredSize(new Dimension(549, 2000));
		panelHerrenKleidung.setLayout(null);
		scrollPaneHerrenKleidung.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneHerrenKleidung.setBounds(323, 97, 901, 455);
		panelMain.add(scrollPaneHerrenKleidung);
		
		
		
		//Artikelbeispiel
		JPanel panelArtikel = new JPanel();
		panelArtikel.setBackground(Color.WHITE);
		panelArtikel.setBounds(66, 30, 680, 188);
		panelHerrenKleidung.add(panelArtikel);
		panelArtikel.setLayout(null);
		
		JLabel labelArtikelBild = new JLabel("");
		labelArtikelBild.setVerticalAlignment(SwingConstants.TOP);
		labelArtikelBild.setHorizontalAlignment(SwingConstants.CENTER);
		labelArtikelBild.setIcon(new ImageIcon("C:\\Users\\hinzl\\Desktop\\SWP-Bilder\\mann_jacke1.jpg"));
		labelArtikelBild.setBounds(33, 25, 133, 135);
		panelArtikel.add(labelArtikelBild);
		
		JLabel lblSchwarzeJackeDenim = new JLabel("Schwarze Jacke DENIM");
		lblSchwarzeJackeDenim.setFont(new Font("Lucida Bright", Font.BOLD, 18));
		lblSchwarzeJackeDenim.setBounds(203, 11, 213, 30);
		panelArtikel.add(lblSchwarzeJackeDenim);
		
		JLabel lblGre = new JLabel("Gr\u00F6\u00DFe: 32");
		lblGre.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		lblGre.setBounds(203, 51, 213, 30);
		panelArtikel.add(lblGre);
		
		JLabel lblNewLabel = new JLabel("Preis: 24\u20AC");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		lblNewLabel.setBounds(569, 130, 101, 47);
		panelArtikel.add(lblNewLabel);
		
		JButton btnZumArtikel = new JButton("Zum Artikel");
		btnZumArtikel.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		btnZumArtikel.setBackground(Color.WHITE);
		btnZumArtikel.setBounds(198, 130, 139, 30);
		panelArtikel.add(btnZumArtikel);
		
		JLabel lblStatus = new JLabel("Auf Lager");
		lblStatus.setForeground(new Color(0, 204, 51));
		lblStatus.setFont(new Font("Lucida Bright", Font.BOLD, 12));
		lblStatus.setBounds(203, 82, 147, 25);
		panelArtikel.add(lblStatus);
		
		btnZurück = new JButton("Zur\u00FCck");
		btnZurück.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		btnZurück.setBackground(Color.WHITE);
		btnZurück.setBounds(10, 11, 89, 35);
		btnZurück.addActionListener(this);
		panelMain.add(btnZurück);
		
		JButton btnNewButton = new JButton("Jacken");
		btnNewButton.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(10, 23, 248, 43);
		panelScrollPaneBar.add(btnNewButton);
		
		JButton btnShirts = new JButton("Shirts");
		btnShirts.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		btnShirts.setBackground(Color.WHITE);
		btnShirts.setBounds(10, 87, 248, 43);
		panelScrollPaneBar.add(btnShirts);
		
		JButton btnHosen = new JButton("Hosen");
		btnHosen.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		btnHosen.setBackground(Color.WHITE);
		btnHosen.setBounds(10, 151, 248, 43);
		panelScrollPaneBar.add(btnHosen);
		
		frame.setVisible(true);
	}
	
public void hinzufügenArtikel() {
		
		System.out.println("HINZ");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(66, 30, 540, 188);
		panel.setLayout(null);
		
		JLabel lblBild = new JLabel();
		lblBild.setVerticalAlignment(SwingConstants.TOP);
		lblBild.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild.setIcon(new ImageIcon("C:\\Users\\hinzl\\Desktop\\SWP-Bilder\\mann_jacke1.jpg"));
		lblBild.setBounds(33, 25, 133, 135);
		
		JLabel lblTitel = new JLabel("Jacke");
		lblTitel.setFont(new Font("Lucida Bright", Font.BOLD, 17));
		lblTitel.setBounds(193, 25, 213, 30);
		
		JLabel lblPreis = new JLabel("Preis: 24\u20AC");
		lblPreis.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		lblPreis.setBounds(432, 147, 84, 30);
		
		JLabel lblGroeße = new JLabel("Gr\\u00F6\\u00DFe: 32");
		lblGroeße.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		lblGroeße.setBounds(203, 66, 84, 30);
		
		panel.add(lblBild);
		panel.add(lblTitel);
		panel.add(lblPreis);
		panel.add(lblGroeße);
		panelHerrenKleidung.add(panel);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
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
