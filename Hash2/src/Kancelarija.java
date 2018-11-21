import java.util.Objects;

import org.svetovid.io.SvetovidReader;

/**
 * Koriscenje kancelarija
 * 
 * Prosiruje InfoTip samo zbog jednostavnosti u TestHash, nema razloga inace.
 */
public class Kancelarija extends InfoTip {
	private String prezime;
	private int broj;

	public Kancelarija(String prezime, int broj) {
		this.prezime = prezime;
		this.broj = broj;
	}

	public Kancelarija() {
	};

	public boolean equals(Object o) {
		// Objekat je identican
		if (this == o) {
			return true;
		}
		// Null je uvek razlicit
		if (o == null) {
			return false;
		}
		// Ako su klase razlicite, objekti ne mogu bili jednaki
		if (getClass() != o.getClass()) {
			return false;
		}

		// pretvaramo objekat u kancelariju
		Kancelarija k2 = (Kancelarija) o;

		// Prvo proveravamo broj
		if (broj != k2.broj) {
			return false;
		}

		// A potom prezime
		if (!Objects.equals(prezime, k2.prezime)) {
			return false;
		}

		// Proverili smo polja i sva su jednaka
		return true;
	}

	public int hashCode() {
		int rez = 0;
		if (prezime != null) {
			rez += prezime.hashCode();
		}
		rez += broj;
		return rez;
	}

	@Override
	public InfoTip ucitaj(SvetovidReader r) {
		String prez = r.readToken(); // citamo jednu "rec"
		int br = r.readInt();
		InfoTip rez = new Kancelarija(prez, br);
		return rez;
	}

	// pomocni metod za lakse testiranje
	public static void main(String[] args) {
		new TestHash(new Kancelarija(), "kancelarije").run();
	}
	
}
