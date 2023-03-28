package personnages;
import java.lang.Math;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom,String boisson,int argent) {
		super(nom,boisson,argent);
	}
	
	public void donner(Commerçant b) {
		int perdu = (int) Math.round(getArgent()*0.1);
		
		perdreArgent(perdu);
		parler(b.getNom()+" prend ces "+perdu+" sous.");
		b.recevoir(perdu);
		
	}
	
}
