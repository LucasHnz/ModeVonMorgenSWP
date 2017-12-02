package Model;

public abstract class Nutzer {
	
	protected int plz, berechtigung, nutzernr;
	protected String vorname, nachname, straﬂe, ort, email;
	
	public Nutzer (String vorname, String nachname, String straﬂe, int plz, String ort, int berechtigung, String email, int nutzernr) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.straﬂe = straﬂe;
		this.plz = plz;
		this.ort = ort;
		this.berechtigung = berechtigung;
		this.email = email;
		this.nutzernr = nutzernr;
		
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}

	public int getBerechtigung() {
		return berechtigung;
	}

	public void setBerechtigung(int berechtigung) {
		this.berechtigung = berechtigung;
	}

	public int getNutzernr() {
		return nutzernr;
	}

	public void setNutzernr(int nutzernr) {
		this.nutzernr = nutzernr;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStraﬂe() {
		return straﬂe;
	}

	public void setStraﬂe(String straﬂe) {
		this.straﬂe = straﬂe;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
