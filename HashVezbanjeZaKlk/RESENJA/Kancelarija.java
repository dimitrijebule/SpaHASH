import java.util.Objects;

import org.svetovid.io.SvetovidReader;

/**
 * Koriscenje kancelarija
 * 
 * Prosiruje InfoTip samo zbog jednostavnosti u TestHash, nema razloga inace.
 */
public class Kancelarija extends InfoTip {
	
	//polja klase
	private String prezime;
	private int brojKancelarije;
	
	//prazan mora da postoji...dodati jos po potrebi...
	public Kancelarija() {
	}
	
	public Kancelarija(String p, int brK) {
		prezime = p;
		brojKancelarije = brK;
	}
	//napravi equals metod...
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o.getClass() == this.getClass()) {
			Kancelarija k = (Kancelarija) o;
			if(Objects.equals(k.prezime, prezime) &&
				k.brojKancelarije == brojKancelarije) {
					return true;
				}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		String s = prezime + " " + brojKancelarije;
		return s.hashCode();
	}
	
	//ucitaj jedan objekat preko prosledjenog ridera...
	@Override
	public InfoTip ucitaj(SvetovidReader r) {
		String [] podaci = r.readLine().split(" ");
		InfoTip i = new Kancelarija(podaci[0].trim(), Integer.parseInt(podaci[1].trim()));
		return i;
	}

	// pomocni metod za lakse testiranje
	public static void main(String[] args) {
		new TestHash(new Kancelarija(), "kancelarije").run();
	}
	
}
