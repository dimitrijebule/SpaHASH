import org.svetovid.io.SvetovidReader;

/**
 * Gadjanje mete
 * 
 * Prosiruje InfoTip samo zbog jednostavnosti u TestHash, nema razloga inace.
 */
public class Gadjanje extends InfoTip {
	
	//Napravi polja klase na osnovu analize fajla za gadjanje...

	public Gadjanje() {
		// prazan konstruktor potreban za test program
	}
	//dodati ostale po potrebi...

	
	//implementirati equals...
	public boolean equals(Object o) {
		return false;
	}

	//implementirati hashCode...
	@Override
	public int hashCode() {
		return 0;
	}

	//implementirati metod za ucitavanje jednog elementa...
	@Override
	public InfoTip ucitaj(SvetovidReader r) {
		return null;
	}

	//implementirati toString...
	public String toString() {
		return null;
	}

	// pomocni metod za lakse testiranje
	public static void main(String[] args) {
		new TestHash(new Gadjanje(), "mete").run();
	}
	
}
