package banditi;

public class Bandit{

	public enum Tim{A, B};
	
	private int brzlatnika;
	private Tim timic;
	
	
	public Bandit(Tim tim) {
		super();
		this.brzlatnika = 50;
		this.timic = tim;
	}


	
	
	
	

	public Tim dohvatiTim() {
		return  timic;
	}
	
	public int dohvatiBrojZlatnika() {
		return brzlatnika;
	}


	public void promeniBrojZlatnika(int brzlatnika) {
		this.brzlatnika += brzlatnika;
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(timic).append(brzlatnika);
		
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		Bandit prvi = new Bandit(Tim.A);
		Bandit drugi = new Bandit(Tim.B);
		System.out.println(prvi.dohvatiTim());
		System.out.println(prvi.dohvatiBrojZlatnika());
		drugi.promeniBrojZlatnika(20);
		System.out.println(drugi.dohvatiBrojZlatnika()); 
		System.out.println(drugi.dohvatiTim());
		
		
		System.out.println(prvi.toString());
		System.out.println(drugi.toString());
	}

}
