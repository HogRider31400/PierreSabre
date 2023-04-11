package personnages;

public class Samourai extends Ronin {
	String seigneur;
	public Samourai(String seigneur,String nom, String boisson,int argent) {
		super(nom,boisson,argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneur " + seigneur);
	}
	
	 public void boire(String boisson) {
		 this.parler("Quest-ce que je vais choisir comme boisson ? Tiens je vais prendre "+boisson+".");
	 }
	
}