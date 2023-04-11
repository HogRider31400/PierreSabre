package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	public Yakuza(String nom, String boisson, int argent,String clan) {
		super(nom,boisson,argent);
		this.clan = clan;
	}
	
	
	 @Override
	 public void direBonjour() {
		 super.direBonjour();
		 this.parler("Mon clan est celui de "+clan);
		 
	 }
	
	public int getReputation() {return reputation;}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens , ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à ta vie donne moi ta bourse !");
		int piquer = victime.seFaireExtorquer();
		gagnerArgent(piquer);
		parler("J'ai piqué les "+piquer+" sous de "+victime.getNom()+", ce qui me fait "+getArgent() + " sous dans ma poche. Hi! Hi!");
	}
	
	int perdre() {
		parler("J'ai perdu mon duel et mes "+getArgent()+" sous, snif... J'ai déshonoré le clan "+clan+".");
		int a = getArgent();
		perdreArgent(a);
		reputation -= 1;
		return a;
	}
	void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan "+clan+ " ? Je l'ai dépouillé de ses "+gain+" sous.");
		gagnerArgent(gain);
		reputation += 1;
		
	}
	
}
