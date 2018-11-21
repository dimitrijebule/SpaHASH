import java.util.Objects;

import org.svetovid.io.SvetovidReader;

/**
 * Koriscenje kancelarija
 * 
 * Prosiruje InfoTip samo zbog jednostavnosti u TestHash, nema razloga inace.
 */
public class Kancelarija extends InfoTip {
	
	//polja klase

	//prazan mora da postoji...dodati jos po potrebi...
	public Kancelarija() {
	}

	//napravi equals metod...
	public boolean equals(Object o) {
		return true;
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
