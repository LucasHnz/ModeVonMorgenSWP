package Model;

public class Mitarbeiter extends Nutzer{

	protected int gehalt;
	protected String iban, passwort;
	
	public Mitarbeiter(String vorname, String nachname, String straﬂe, int plz, String ort, int berechtigung,String email, int nutzernr, int gehalt, String iban, String passwort) {
		super(vorname, nachname, straﬂe, plz, ort, berechtigung, email, nutzernr);
		
		this.gehalt = gehalt;
		this.iban = iban;
		this.passwort = passwort;
	}

	public int getGehalt() {
		return gehalt;
	}

	public void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	

}
