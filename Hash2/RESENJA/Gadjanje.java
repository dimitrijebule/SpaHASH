import org.svetovid.io.SvetovidReader;

/**
 * Gadjanje mete
 * 
 * Prosiruje InfoTip samo zbog jednostavnosti u TestHash, nema razloga inace.
 */
public class Gadjanje extends InfoTip {
	private int[] rezultati;
	private static int MAX_DUZ = 20;

	public Gadjanje() {
		// prazan konstruktor potreban za test program
	}

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

		Gadjanje o2 = (Gadjanje) o;
		// proveravamo da li je polje null pre dalje provere
		if (rezultati != null && o2.rezultati != null) {
			if (o2.rezultati.length == rezultati.length) {
				for (int i = 0; i < rezultati.length; i++) {
					if (o2.rezultati[i] != rezultati[i]) {
						// cim je nesto razlicito nisu isti
						return false;
					}
				}
				// ako se sve vrednosti slazu isti su
				return true;
			}
			return false;
		} else {
			// vracamo da li su oba null, tj da li su jednaki
			return (rezultati == null && o2.rezultati == null);
		}
	}

	@Override
	public int hashCode() {
		int rez = 0;
		if (rezultati != null) {
			for (int i = 0; i < rezultati.length; i++) {
				rez = (rez + rezultati[i] + 1) * 11 ;
			}
		}
		return rez;
	}

	@Override
	public InfoTip ucitaj(SvetovidReader r) {
		Gadjanje rez = new Gadjanje();
		int br = r.readInt();
		rez.rezultati = new int[br];
		for (int i = 0; i < br; i++) {
			rez.rezultati[i] = r.readInt();
		}
		return rez;
	}

	public String toString() {
		String str = "Gadjanje (" + rezultati.length + "):";
		for (int i : rezultati) {
			str += " " + i;
		}
		return str;
	}

	// pomocni metod za lakse testiranje
	public static void main(String[] args) {
		new TestHash(new Gadjanje(), "mete").run();
	}
	
}
