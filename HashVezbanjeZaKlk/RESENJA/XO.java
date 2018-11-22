import org.svetovid.io.SvetovidReader;

/**
 * Igra XO
 * 
 * Prosiruje InfoTip samo zbog jednostavnosti u TestHash, nema razloga inace.
 */
public class XO extends InfoTip {
	
	//polja klase
	private int [][] tablica;

	public XO() {
	}
	
	public XO(int [][] mat) {
		tablica = mat;
	}

	@Override
	public InfoTip ucitaj(SvetovidReader r) {
		int [][] mat = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				mat[i][j] = r.readInt();
			}
		}
		r.readLine();
		return new XO(mat);
	}

	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(o.getClass() == this.getClass()) {
			XO xo = (XO) o;
			if(istiNiz(xo.tablica)) {
				return true;
			}
		}
		return false;
	}
	private boolean istiNiz(int [][] mat) {
		if(mat == null || tablica == null) return false;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				if(tablica[i][j] != mat[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		String s = " ";
		if(tablica != null)
			for(int i = 0; i < tablica.length; i++) {
				for(int j = 0; j < tablica[0].length; j++) {
					s = s + tablica[i][j] + " ";
				}
			}
		return s.hashCode();
	}

	// pomocni metod za lakse testiranje
	public static void main(String[] args) {
		new TestHash(new XO(), "xo").run();
	}
}
