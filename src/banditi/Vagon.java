package banditi;

import java.util.ArrayList;

import banditi.Bandit.Tim;

public class Vagon {

	private ArrayList<Bandit> banditi;
	
	

	
	public Vagon() {
		this.banditi = new ArrayList<>();
	}

	
	public void dodajBandita(Bandit bandit) {
		banditi.add(bandit);
		
	}

	public int dohvatiBrojBandita() {
		
		return banditi.size();
	}


	public Bandit dohvatiBandita(int i) {
		
		return banditi.get(i);
	}


	public void ukloniBandita(Bandit bandit) {
		
		for(int i = 0 ; i<banditi.size(); i++) {
			if(bandit == banditi.get(i)) {
				banditi.remove(i);
				return;
			}
		}
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append('[');
		for(int i = 0; i<banditi.size(); i++) {
			sb.append(banditi.get(i).toString());
			if(i != banditi.size()-1)
				sb.append(',');
			
		}
		sb.append(']');
		
		return sb.toString();
	}


	public boolean sadrziBandita(Bandit bandit) {
		
	
		for(int i = 0 ; i<banditi.size(); i++) {
			if(bandit == banditi.get(i)) {
				return true;
			}
		
	}
	
		return false;

	

	}
	
	
	public static void main(String[] args) {
		Vagon v1 = new Vagon();
		Bandit prvi = new Bandit(Tim.A);
		Bandit drugi = new Bandit(Tim.B);
		
	}
}
