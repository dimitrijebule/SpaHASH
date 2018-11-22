import java.util.Objects;

import org.svetovid.io.SvetovidReader;

/**
 * Koriscenje kancelarija
 * 
 * Prosiruje InfoTip samo zbog jednostavnosti u TestHash, nema razloga inace.
 */
public class Kancelarija extends InfoTip {
	
	//Napravi polja klase na osnovu analize fajla za kancelarije...

	//prazan mora da postoji...dodati jos po potrebi...
	public Kancelarija() {
	}
	
	//napravi equals metod...
	public boolean equals(Object o) {
		return false;
	}
	
	//implementiraj hash
	@Override
	public int hashCode() {
		return 0;
	}
	
	//ucitaj jedan objekat preko prosledjenog ridera...
	@Override
	public InfoTip ucitaj(SvetovidReader r) {
		return null;
	}

	// pomocni metod za lakse testiranje
	public static void main(String[] args) {
		new TestHash(new Kancelarija(), "kancelarije").run();
	}
	
}
