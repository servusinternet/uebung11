package übung11;

public class Vereinsausweis extends Ausweis {
	private int trikotnr;
	private boolean spielberechtigt;
	
	public Vereinsausweis() {
	}
	
	public Vereinsausweis(String vorname, String nachname, String geschlecht, int trikotnr, boolean spielberechtigt){
		super(vorname, nachname, geschlecht);
		this.trikotnr = trikotnr;
		this.spielberechtigt = spielberechtigt;
	}
	
	@Override
	public String toString(){
		return "Spielerinfo: \n" 
				+ "Vorname: " + this.getVorname()
				+ "\nNachname: " + this.getNachname() 
				+ "\nGeschlecht: " + this.getGeschlecht()
				+ "\nTrikotnr: " + trikotnr 
				+ "\nSpielberechtigt: " + spielberechtigt;
	}
}
