package Model;

public class Bestandskunde extends Nutzer {

	protected String lstraﬂe, lort, passwort;
	protected int lplz, pss;
	public Bestandskunde(String vorname, String nachname, String straﬂe, int plz, String ort, int berechtigung, String email, int nutzernr, String lstraﬂe, int lplz, String lort, int pss, String passwort) {
		
		super(vorname, nachname, straﬂe, plz, ort, berechtigung, email, nutzernr);
		
		this.lstraﬂe = lstraﬂe;
		this.lplz = lplz;
		this.lort = lort;
		this.pss = pss;
		this.passwort = passwort;
		
	}
	public String getLstraﬂe() {
		return lstraﬂe;
	}
	public void setLstraﬂe(String lstraﬂe) {
		this.lstraﬂe = lstraﬂe;
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
