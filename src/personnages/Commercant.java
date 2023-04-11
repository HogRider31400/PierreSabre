package personnages;

public class Commercant extends Humain {
	public Commercant(String nom,int argent) {
		// TODO Auto-generated constructor stub
		super(nom,"thé",argent);
		
	}
	public int seFaireExtorquer() {
		int ar = getArgent();
		perdreArgent(ar);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return ar;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(getArgent() + argent);
		parler(argent+" sous! Je te remercie g�n�reux donateur!");
	}
	
	
}
