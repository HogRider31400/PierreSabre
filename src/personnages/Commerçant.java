package personnages;

public class Commerçant extends Humain {
	public Commerçant(String nom,int argent) {
		// TODO Auto-generated constructor stub
		super(nom,"thé",argent);
		
	}
	public int seFaireExtorquer() {
		int ar = getArgent();
		setArgent(0);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return ar;
	}
	
	public void recevoir(int argent) {
		setArgent(getArgent() + argent);
		parler(argent+" sous! Je te remercie généreux donateur!");
	}
	
	
}
