package banditi;

import java.util.ArrayList;

import banditi.Bandit.Tim;

public class Kompozicija {
	
	ArrayList<Vagon> vagoni;
	//public enum Smer {Ispred, Iza};
	
	public Kompozicija() {
		this.vagoni = new ArrayList<>();
	}

	public void dodajVagon(Vagon vagon1) {
		vagoni.add(vagon1);
		
	}

	public Vagon dohvatiVagon(Bandit bandit) throws GNepostojeciVagon {
		
			for(Vagon v: vagoni) {
				for(int i = 0; i<v.dohvatiBrojBandita(); i++) {
					if(bandit == v.dohvatiBandita(i)) {
						return v;
					}
				}
			}
			throw new GNepostojeciVagon("Nema tog vagona");
			
	}
	
	
	
	public Vagon dohvatiSusedniVagon(Vagon vagon, Smer s) throws GNepostojeciVagon {
		
		
		if(s == Smer.IZA) {
			 for(int i = 0; i<vagoni.size(); i++) {
				
				if(vagoni.get(i) == vagon) {
					if(i==vagoni.size()-1) {throw new GNepostojeciVagon("Nema susednog vagona");}
					if(vagoni.get(i+1) != null) {
						return vagoni.get(i+1);
					}
				}
				
			}
			throw new GNepostojeciVagon("Nema susednog vagona");
			
		}else if(s == Smer.ISPRED){
			//if(vagoni.get(0) == vagon) {
				for(int i = 0; i<vagoni.size(); i++) {
					
					if(vagoni.get(i) == vagon) {
						if(i==0) {throw new GNepostojeciVagon("Nema susednog vagona");}
						if(vagoni.get(i-1) != null || i!=0) {
							return vagoni.get(i-1);
						}
					}
				}
				
					throw new GNepostojeciVagon("Nema susednog vagona");
			}
			
		return null;
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<vagoni.size(); i++) {
			sb.append(vagoni.get(i).toString());
			if(i != vagoni.size()-1)
				sb.append('_');
			
		}
		
		return sb.toString();
	}
		
		public static void main(String[] args) {
			Kompozicija k = new Kompozicija();
			Vagon v1 = new Vagon();
			Bandit prvi = new Bandit(Tim.A);
			Bandit drugi = new Bandit(Tim.B);
			v1.dodajBandita(prvi);
			v1.dodajBandita(drugi);
			k.dodajVagon(v1);
			Bandit treci = new Bandit (Tim.B);
			Vagon v2 = new Vagon();
			Bandit cetvrti = new Bandit (Tim.B);
			v2.dodajBandita(treci);
			k.dodajVagon(v2);
			
			System.out.println(v1.toString());
			System.out.println(k.toString());
			try {
				System.out.println(k.dohvatiVagon(drugi));
				//k.dohvatiVagon(cetvrti);
				k.dohvatiSusedniVagon(v2, Smer.IZA);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		
		
}
	
	


