package MainPackage;

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
import javax.swing.JList;

public class GUIMitarbeiter implements ActionListener{
	
	JButton btnZurück = new JButton();
	JButton btnAnmelden = new JButton();
	public JComboBox comboBoxArtikelHerren = new JComboBox();
	private JComboBox comboBoxErweitert;
	public JComboBox comboBoxArtikelDamen = new JComboBox();
	public JComboBox comboBoxAnmelden = new JComboBox();
	public JPanel panelEinstellungen = new JPanel();
	public String[] anmeldenCbList;
	public String[] damenCbList = {"Damen", "-----------------------------------", "Kleidung", "Schuhe", "Accessoires"};
	public String[] herrenCbList = {"Herren","------------------------------------", "Kleidung", "Schuhe", "Accessoires"};
	


	private JFrame frame;


	/**
	 * Create the application.
	 */
	public GUIMitarbeiter(String[]anmeldenCbList) {
		System.out.println("Ausgeführt HK");
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
		
		JPanel panelMain = new JPanel();
		panelMain.setBackground(Color.WHITE);
		panelMain.setBounds(0, 147, 1234, 563);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);
		
		JPanel panelScrollPaneBar = new JPanel();
		panelScrollPaneBar.setBackground(SystemColor.control);
		panelScrollPaneBar.setLayout(null);
		
		JScrollPane scrollPaneArtikel = new JScrollPane(panelScrollPaneBar);
		
		JComboBox comboBoxArtikelDamen = new JComboBox(damenCbList);
		comboBoxArtikelDamen.setBackground(SystemColor.control);
		comboBoxArtikelDamen.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		comboBoxArtikelDamen.setBounds(10, 86, 248, 43);
		panelScrollPaneBar.add(comboBoxArtikelDamen);
		
		JComboBox comboBoxArtikelHerren = new JComboBox(herrenCbList);
		comboBoxArtikelHerren.setBackground(SystemColor.control);
		comboBoxArtikelHerren.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		comboBoxArtikelHerren.setBounds(10, 236, 248, 43);
		panelScrollPaneBar.add(comboBoxArtikelHerren);
		scrollPaneArtikel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneArtikel.setBounds(10, 97, 270, 455);
		panelMain.add(scrollPaneArtikel);
		
		//JPanel panelEinstellungen = new JPanel();
		JScrollPane scrollPaneEinstellungen = new JScrollPane(panelEinstellungen);
		scrollPaneEinstellungen.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		panelEinstellungen.setLayout(null);
		scrollPaneEinstellungen.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneEinstellungen.setBounds(343, 97, 549, 455);
		panelMain.add(scrollPaneEinstellungen);
		
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
		panelEinstellungen.add(panel);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnZurück) 
		{
			frame.dispose();
			new GUI();
		}
		if(e.getSource() == comboBoxArtikelDamen){
			
			String auswahl = (String) comboBoxArtikelDamen.getSelectedItem();
		    
			if(auswahl == "Kleidung"){
				hinzufügenArtikel();
			 
		    }
		  
			if(auswahl == "Schuhe"){
			 
			  
			}
			
			if(auswahl == "Accessoires"){
				
			  
			}
		}
		
		if(e.getSource() == comboBoxArtikelHerren){
			
			String auswahl = (String) comboBoxArtikelHerren.getSelectedItem();
		    
			if(auswahl == "Kleidung"){
				
			 
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

