package Model;

public abstract class Nutzer {
	
	protected int plz, berechtigung, nutzernr;
	protected String vorname, nachname, stra�e, ort, email;
	
	public Nutzer (String vorname, String nachname, String stra�e, int plz, String ort, int berechtigung, String email, int nutzernr) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.stra�e = stra�e;
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

	public String getStra�e() {
		return stra�e;
	}

	public void setStra�e(String stra�e) {
		this.stra�e = stra�e;
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
