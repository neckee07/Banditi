package banditi;

public class Pomeranje extends Akcija {

	private Smer smer;
	
	public Pomeranje(Kompozicija kompozicija, Smer s) {
		super(kompozicija);
		this.smer = s;
	}
	
	
	@Override
	public void izvrsi(Bandit bandit) {
		Vagon v;
		Vagon v1;
		
			try {
				v = kompozicija.dohvatiVagon(bandit);
				v1 = kompozicija.dohvatiSusedniVagon(v, smer);
				v.ukloniBandita(bandit);
				v1.dodajBandita(bandit);
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pomeranje :").append(smer);
		return sb.toString();
	}
	
}
