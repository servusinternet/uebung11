package übung11;

public class Ausweis {
	private String vorname;
	private String nachname;
	private String geschlecht;
	
	public Ausweis() {
	}
	
	public Ausweis(String vorname, String nachname, String geschlecht) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geschlecht = geschlecht;
	}
	
	@Override
	public String toString() {
		return "Ausweis:" 
				+ "\nVorname:" + vorname 
				+ "\nNachname: " + nachname 
				+ "\nGeschlecht: " + geschlecht;
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

	public String getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}	
	
}
