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
	//prazan konstruktor mora da postoji dodati ostale po potrebi...

	//implementiraj ucitaj za jedan element..
	@Override
	public InfoTip ucitaj(SvetovidReader r) {
		return null;
	}

	//implementiraj equals...
	public boolean equals(Object o) {
		return false;
	}

	//implementiraj...
	@Override
	public int hashCode() {
		return 0;
	}

	// pomocni metod za lakse testiranje
	public static void main(String[] args) {
		new TestHash(new XO(), "xo").run();
	}
}
