import org.svetovid.io.SvetovidReader;

/**
 * Gadjanje mete
 * 
 * Prosiruje InfoTip samo zbog jednostavnosti u TestHash, nema razloga inace.
 */
public class Gadjanje extends InfoTip {
	
	//polja klase

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

	@Override
	public InfoTip ucitaj(SvetovidReader r) {
		//ucitati jedan element klase
		return null;
	}

	public String toString() {
		//implementirati toString
		return null;
	}

	// pomocni metod za lakse testiranje
	public static void main(String[] args) {
		new TestHash(new Gadjanje(), "mete").run();
	}
	
}
