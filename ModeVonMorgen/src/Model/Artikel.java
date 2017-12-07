package Model;
/**
 * 
 * @author maoro
 *
 */
public abstract class Artikel {

	protected int Artikelnummer, Bestand;
	protected String Bezeichnung, Art, Geschlecht, Hersteller, Verf�gbarkeit, Notiz, Kategorie;
	protected String[] Lieferanten;
	protected double Preis, Rabatt;
	/**
	 * 
	 * @param artnr Die einzigartige Artikelnummer.
	 * @param bestand Der aktuelle Lagerbestand.
	 * @param Bezeichnung Name des Artikels.
	 * @param Geschlecht Gibt an, ob der Artikel f�r Frauen oder M�nner gedacht ist.
	 * @param Hersteller Die MArke des Artikels.
	 * @param Verf�gbarkeit Die Lieferbarkeit.
	 * @param Notiz Eine nur in der Artikelverwaltung sichtbare Notiz.
	 * @param Lieferanten Die Namen aller Lieferanten, die einen Artikel liefern.
	 * @param Preis Der Preis des Artikels.
	 * @param Rabatt Tempor�re Preisverg�nstigung.
	 */
	public Artikel(int artnr, int bestand, String Bezeichnung, String Geschlecht, String Hersteller, String Verf�gbarkeit, String Notiz, String[]  Lieferanten, double Preis, double Rabatt) {

		this.Artikelnummer=artnr;
		this.Bestand=bestand;
		this.Bezeichnung=Bezeichnung;
		this.Geschlecht=Geschlecht;
		this.Hersteller=Hersteller;
		this.Verf�gbarkeit=Verf�gbarkeit;
		this.Notiz=Notiz;
		this.Lieferanten=Lieferanten;
		this.Preis=Preis;
		this.Rabatt=Rabatt;
	}
	
	public int getArtikelnummer() {
		return Artikelnummer;
	}
	public void setArtikelnummer(int artikelnummer) {
		Artikelnummer = artikelnummer;
	}
	public int getBestand() {
		return Bestand;
	}
	public void setBestand(int bestand) {
		Bestand = bestand;
	}
	public String getBezeichnung() {
		return Bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		Bezeichnung = bezeichnung;
	}
	public String getArt() {
		return Art;
	}
	public void setArt(String art) {
		Art = art;
	}
	public String getGeschlecht() {
		return Geschlecht;
	}
	public void setGeschlecht(String geschlecht) {
		Geschlecht = geschlecht;
	}
	public String getHersteller() {
		return Hersteller;
	}
	public void setHersteller(String hersteller) {
		Hersteller = hersteller;
	}
	public String getVerf�gbarkeit() {
		return Verf�gbarkeit;
	}
	public void setVerf�gbarkeit(String verf�gbarkeit) {
		Verf�gbarkeit = verf�gbarkeit;
	}
	public String getNotiz() {
		return Notiz;
	}
	public void setNotiz(String notiz) {
		Notiz = notiz;
	}
	public String[] getLieferanten() {
		return Lieferanten;
	}
	public void setLieferanten(String[] lieferanten) {
		Lieferanten = lieferanten;
	}
	public double getPreis() {
		return Preis;
	}
	public void setPreis(double preis) {
		Preis = preis;
	}
	public double getRabatt() {
		return Rabatt;
	}
	public void setRabatt(double rabatt) {
		Rabatt = rabatt;
	}
	public String getKategorie() {
		return Kategorie;
	}
	
	
}
