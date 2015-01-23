package übung11;

public class AusweisMethoden {
	public static Ausweis[] erzeugeAusweise() {
		Ausweis[] ausweise = new Ausweis[6];
		
		ausweise[0] = new Ausweis();
		ausweise[1] = new Ausweis();
		
		ausweise[2] = new Studentenausweis();
		ausweise[3] = new Studentenausweis();
		
		ausweise[4] = new Vereinsausweis();
		ausweise[5] = new Vereinsausweis();
		
		return ausweise;
	}
	
	private static void datenAusgabe(Ausweis[] ausweise) {
		for(int i=0; i<ausweise.length; i++) {
			if(ausweise[i].getVorname() == null) {
				System.out.println("Dieser Index (" + i + ") ist nicht belegt.");
			} else {
				System.out.println(ausweise[i].toString());
			}
		}
	}
	
	public static void main(String[] args) {
		Ausweis[] ausweis = erzeugeAusweise();
		ausweis[2] = new Vereinsausweis("Max", "Mustermann", "m", 23, true);
		datenAusgabe(ausweis);
	}
}
