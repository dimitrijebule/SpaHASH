import org.svetovid.io.SvetovidReader;

/**
 * Igra XO
 * 
 * Prosiruje InfoTip samo zbog jednostavnosti u TestHash, nema razloga inace.
 */
public class XO extends InfoTip {
	
	//polja klase

	public XO() {
	}

	@Override
	public InfoTip ucitaj(SvetovidReader r) {
		//ucitaj podatke
		return null;
	}

	public boolean equals(Object o) {
		//implementiraj
		return true;
	}

	@Override
	public int hashCode() {
		//implementiraj..
		return 0;
	}

	// pomocni metod za lakse testiranje
	public static void main(String[] args) {
		new TestHash(new XO(), "xo").run();
	}
}
