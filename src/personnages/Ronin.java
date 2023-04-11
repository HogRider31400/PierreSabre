package personnages;
import java.lang.Math;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom,String boisson,int argent) {
		super(nom,boisson,argent);
	}
	
	public void donner(Commercant b) {
		int perdu = (int) Math.round(getArgent()*0.1);
		
		perdreArgent(perdu);
		parler(b.getNom()+" prend ces "+perdu+" sous.");
		b.recevoir(perdu);
		
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		if(force >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakusa !");
			gagnerArgent(adversaire.perdre());
			honneur += 1;
		}
		else {
			parler("J'ai perdu contre ce yakuza");
			adversaire.gagner(getArgent());
			
			honneur -= 1;
		}
	}
	
}
