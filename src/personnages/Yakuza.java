package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	public Yakuza(String nom, String boisson, int argent,String clan) {
		super(nom,boisson,argent);
		this.clan = clan;
	}
	
	public void extorquer(Commerçant victime) {
		parler("Tiens, tiens , ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à ta vie donne moi ta bourse !");
		int piquer = victime.seFaireExtorquer();
		gagnerArgent(piquer);
		parler("J'ai piqué les "+piquer+" sous de "+victime.getNom()+", ce qui me fait "+getArgent() + " sous dans ma poche. Hi! Hi!");
	}
}
