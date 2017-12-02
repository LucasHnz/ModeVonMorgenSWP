package Model;

public class Bestandskunde extends Nutzer {

	protected String lstra�e, lort, passwort;
	protected int lplz, pss;
	public Bestandskunde(String vorname, String nachname, String stra�e, int plz, String ort, int berechtigung, String email, int nutzernr, String lstra�e, int lplz, String lort, int pss, String passwort) {
		
		super(vorname, nachname, stra�e, plz, ort, berechtigung, email, nutzernr);
		
		this.lstra�e = lstra�e;
		this.lplz = lplz;
		this.lort = lort;
		this.pss = pss;
		this.passwort = passwort;
		
	}
	public String getLstra�e() {
		return lstra�e;
	}
	public void setLstra�e(String lstra�e) {
		this.lstra�e = lstra�e;
	}
	public String getLort() {
		return lort;
	}
	public void setLort(String lort) {
		this.lort = lort;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	public int getLplz() {
		return lplz;
	}
	public void setLplz(int lplz) {
		this.lplz = lplz;
	}
	public int getPss() {
		return pss;
	}
	public void setPss(int pss) {
		this.pss = pss;
	}
	
	

}
