import org.svetovid.io.SvetovidReader;

/**
 * Gadjanje mete
 * 
 * Prosiruje InfoTip samo zbog jednostavnosti u TestHash, nema razloga inace.
 */
public class Gadjanje extends InfoTip {
	
	//polja klase
	private int brojGadjanja;
	private int [] skor;

	public Gadjanje() {
		// prazan konstruktor potreban za test program
	}
	
	public Gadjanje(int brG, int [] niz) {
		brojGadjanja = brG;
		skor = new int[brG];
		skor = niz;
	}
	
	//dodati ostale po potrebi...

	
	//implementirati equals...
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(o.getClass() == this.getClass()) {
			Gadjanje g = (Gadjanje) o;
			if(g.brojGadjanja == brojGadjanja &&
					istiNizovi(g.skor)) {
				return true;
			}
		}
		return false;
	}
	public boolean istiNizovi(int [] niz) {
		for(int i = 0; i < brojGadjanja; i++) {
			if(skor[i] != niz[i])
				return false;
		}
		return true;
	}

	//implementirati hashCode...
	@Override
	public int hashCode() {
		String s = "";
		s += brojGadjanja;
		for (int i = 0; i < brojGadjanja; i++) {
			s = s + " " + skor[i]; 
		}
		return s.hashCode();
	}

	@Override
	public InfoTip ucitaj(SvetovidReader r) {
		int x = r.readInt();
		int niz [] = new int[x];
		for (int i = 0; i < x; i++) {
			niz[i] = r.readInt();
		}
		return new Gadjanje(x, niz);
	}

	public String toString() {
		String s = "";
		s += brojGadjanja;
		for (int i = 0; i < brojGadjanja; i++) {
			s = s + " " + skor[i]; 
		}
		return s;
	}

	// pomocni metod za lakse testiranje
	public static void main(String[] args) {
		new TestHash(new Gadjanje(), "mete").run();
	}
	
}
