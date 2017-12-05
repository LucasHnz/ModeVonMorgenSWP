package View;

import java.awt.Color;
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
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JList;

public class GUIMitarbeiter implements ActionListener{
	
	JButton btnZur¸ck = new JButton();
	JButton btnAnmelden = new JButton();
	public JComboBox comboBoxArtikelHerren = new JComboBox();
	private JComboBox comboBoxErweitert;
	public JComboBox comboBoxArtikelDamen = new JComboBox();
	public JComboBox comboBoxAnmelden = new JComboBox();
	public JPanel panelEinstellungen = new JPanel();
	public String[] anmeldenCbList;
	public String[] damenCbList = {"Damen", "-----------------------------------", "Kleidung", "Schuhe", "Accessoires"};
	public String[] herrenCbList = {"Herren","------------------------------------", "Kleidung", "Schuhe", "Accessoires"};
	public int abstandsZahl = 170;
	public String[] mitarbeiterListe = {"Anna Gross", "Falk Maoro", "Bastian Walter", "Lucas Hinz"};
	


	private JFrame frame;


	/**
	 * Create the application.
	 */
	public GUIMitarbeiter(String[]anmeldenCbList) {
		System.out.println("Ausgef¸hrt HK");
		this.anmeldenCbList = anmeldenCbList;
		initialize(damenCbList, herrenCbList, anmeldenCbList);
		for(int i = 0; i>= mitarbeiterListe.length; i++) {
			
		}
		
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
		
		comboBoxErweitert = new JComboBox();
		comboBoxErweitert.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		comboBoxErweitert.setBackground(SystemColor.control);
		comboBoxErweitert.setBounds(801, 0, 220, 50);
		comboBoxErweitert.addActionListener(this);
		panelBar.add(comboBoxErweitert);
		
		comboBoxAnmelden = new JComboBox(anmeldenCbList);
		comboBoxAnmelden.setBounds(1040, 0, 173, 50);
		comboBoxAnmelden.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		comboBoxAnmelden.setBackground(SystemColor.control);
		comboBoxAnmelden.addActionListener(this);
		panelBar.add(comboBoxAnmelden);
		
		//Hauptfenster
		JPanel panelMain = new JPanel();
		panelMain.setBackground(Color.WHITE);
		panelMain.setBounds(0, 147, 1234, 563);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);
		
		//Artikelfenster (Links)
		JPanel panelScrollPaneArtikel = new JPanel();
		panelScrollPaneArtikel.setBackground(SystemColor.control);
		panelScrollPaneArtikel.setLayout(null);
		
		JScrollPane scrollPaneArtikel = new JScrollPane(panelScrollPaneArtikel);
		scrollPaneArtikel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneArtikel.setBounds(10, 97, 270, 455);
		panelMain.add(scrollPaneArtikel);
	
		
		comboBoxArtikelDamen = new JComboBox(damenCbList);
		comboBoxArtikelDamen.setBackground(SystemColor.control);
		comboBoxArtikelDamen.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		comboBoxArtikelDamen.setBounds(10, 86, 248, 43);
		panelScrollPaneArtikel.add(comboBoxArtikelDamen);
		
		comboBoxArtikelHerren = new JComboBox(herrenCbList);
		comboBoxArtikelHerren.setBackground(SystemColor.control);
		comboBoxArtikelHerren.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		comboBoxArtikelHerren.addActionListener(this);
		comboBoxArtikelHerren.setBounds(10, 236, 248, 43);
		panelScrollPaneArtikel.add(comboBoxArtikelHerren);

		
		
		//Einstellungsfenster (Mitte)
		
		panelEinstellungen.setPreferredSize(new Dimension(549, 2000));
		JScrollPane scrollPaneEinstellungen = new JScrollPane(panelEinstellungen);
		scrollPaneEinstellungen.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelEinstellungen.setLayout(null);
		
		
		
		scrollPaneEinstellungen.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneEinstellungen.setBounds(343, 97, 549, 455);
		panelMain.add(scrollPaneEinstellungen);
		
		
		//Mitarbeiterfenster (Rechts)
		JPanel panelMitarbeiter = new JPanel();
		
		JScrollPane scrollPaneMitarbeiter = new JScrollPane(panelMitarbeiter);
		panelMitarbeiter.setLayout(null);
		
		JButton btnHinzMitarbeiter = new JButton("Hinzuf\u00FCgen");
		btnHinzMitarbeiter.setBackground(SystemColor.control);
		btnHinzMitarbeiter.setBounds(10, 11, 114, 34);
		panelMitarbeiter.add(btnHinzMitarbeiter);
		
		JButton btnEntfernenMitarbeiter = new JButton("Entfernen");
		btnEntfernenMitarbeiter.setBackground(SystemColor.control);
		btnEntfernenMitarbeiter.setBounds(144, 11, 114, 34);
		panelMitarbeiter.add(btnEntfernenMitarbeiter);
		
		JList listMitarbeiter = new JList();
		listMitarbeiter.setBounds(10, 78, 248, 324);
		panelMitarbeiter.add(listMitarbeiter);
		scrollPaneMitarbeiter.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneMitarbeiter.setBounds(954, 97, 270, 455);
		panelMain.add(scrollPaneMitarbeiter);
		
		
		frame.setVisible(true);
	}
	
	public void anzeigenArtikel() {
		
		System.out.println("anzeige");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(22, 50, 470, 146);
		panelEinstellungen.add(panel);
		panel.setLayout(null);
		
		JLabel lblBild = new JLabel("");
		lblBild.setBounds(10, 11, 124, 124);
		lblBild.setVerticalAlignment(SwingConstants.TOP);
		lblBild.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild.setIcon(new ImageIcon("C:\\Users\\hinzl\\Desktop\\SWP-Bilder\\mann_jacke1.jpg"));
		panel.add(lblBild);
		
		JLabel lblTitel = new JLabel("Jacke");
		lblTitel.setBounds(167, 11, 242, 28);
		lblTitel.setFont(new Font("Lucida Bright", Font.BOLD, 17));
		panel.add(lblTitel);
		
		JLabel lblGroeﬂe = new JLabel("Grˆﬂe: 34");
		lblGroeﬂe.setBounds(167, 50, 78, 32);
		lblGroeﬂe.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		panel.add(lblGroeﬂe);
		
		JLabel lblPreis = new JLabel("34Ä");
		lblPreis.setBounds(402, 107, 58, 28);
		lblPreis.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		panel.add(lblPreis);
		
		
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.WHITE);
		panel2.setBounds(22, (50 + abstandsZahl), 470, 146);
		panelEinstellungen.add(panel2);
		panel2.setLayout(null);
		
		JLabel lblBild2 = new JLabel("");
		lblBild2.setBounds(10, 11, 124, 124);
		lblBild2.setVerticalAlignment(SwingConstants.TOP);
		lblBild2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild2.setIcon(new ImageIcon("C:\\Users\\hinzl\\Desktop\\SWP-Bilder\\mann_jacke1.jpg"));
		panel2.add(lblBild2);
		
		JLabel lblTitel2 = new JLabel("Jacke");
		lblTitel2.setBounds(167, 11, 242, 28);
		lblTitel2.setFont(new Font("Lucida Bright", Font.BOLD, 17));
		panel2.add(lblTitel2);
		
		JLabel lblGroeﬂe2 = new JLabel("Grˆﬂe: 34");
		lblGroeﬂe2.setBounds(167, 50, 78, 32);
		lblGroeﬂe2.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		panel2.add(lblGroeﬂe2);
		
		JLabel lblPreis2 = new JLabel("34Ä");
		lblPreis2.setBounds(402, 107, 58, 28);
		lblPreis2.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		panel2.add(lblPreis2);
	
		abstandsZahl *= 2;
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(22, (50 + abstandsZahl), 470, 146);
		panelEinstellungen.add(panel3);
		panel3.setLayout(null);
		
		JLabel lblBild3 = new JLabel("");
		lblBild3.setBounds(10, 11, 124, 124);
		lblBild3.setVerticalAlignment(SwingConstants.TOP);
		lblBild3.setHorizontalAlignment(SwingConstants.CENTER);
		lblBild3.setIcon(new ImageIcon("C:\\Users\\hinzl\\Desktop\\SWP-Bilder\\mann_jacke1.jpg"));
		panel3.add(lblBild3);
		
		JLabel lblTitel3 = new JLabel("Jacke");
		lblTitel3.setBounds(167, 11, 242, 28);
		lblTitel3.setFont(new Font("Lucida Bright", Font.BOLD, 17));
		panel3.add(lblTitel3);
		
		JLabel lblGroeﬂe3 = new JLabel("Grˆﬂe: 34");
		lblGroeﬂe3.setBounds(167, 50, 78, 32);
		lblGroeﬂe3.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		panel3.add(lblGroeﬂe3);
		
		JLabel lblPreis3 = new JLabel("34Ä");
		lblPreis3.setBounds(402, 107, 58, 28);
		lblPreis3.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		panel3.add(lblPreis3);
		
		panelEinstellungen.add(panel);
		panelEinstellungen.add(panel2);
		panelEinstellungen.add(panel3);
		panelEinstellungen.revalidate();
		panelEinstellungen.repaint();


		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnZur¸ck) 
		{
			frame.dispose();
			new GUI();
		}
		if(e.getSource() == comboBoxArtikelDamen){
			
			String auswahl = (String) comboBoxArtikelDamen.getSelectedItem();
		    
			if(auswahl == "Kleidung"){
			
			 
		    }
		  
			if(auswahl == "Schuhe"){
			 
			  
			}
			
			if(auswahl == "Accessoires"){
				
			  
			}
		}
		
		if(e.getSource() == comboBoxArtikelHerren){
			
			String auswahl = (String) comboBoxArtikelHerren.getSelectedItem();
		    
			if(auswahl == "Kleidung"){
				anzeigenArtikel();
			 
		    }
		  
			if(auswahl == "Schuhe"){
			 
			  
			}
			
			if(auswahl == "Accessoires"){
				
			  
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

