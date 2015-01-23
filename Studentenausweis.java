package übung11;

public class Studentenausweis extends Ausweis {
	private String fakultaet;
	private int matrikelnr;
	
	public Studentenausweis(){
	}
	
	public Studentenausweis(String vorname, String nachname, String geschlecht, String fakultaet, int matrikelnr) {
		super(vorname, nachname, geschlecht);
		this.fakultaet = fakultaet;
		this.matrikelnr = matrikelnr;
	}
		
	@Override
	public String toString(){
		return "Fakultaet: " + fakultaet + "Matrikelnummer: " + matrikelnr;
	}
	
}
