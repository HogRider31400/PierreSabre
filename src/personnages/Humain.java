package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected Humain[] memoire = new Humain[30];
	protected int nbConnaissance  = 0;
	
	
	
	public Humain(String nom,String boisson,int argent) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.argent = argent;
		this.boissonFavorite = boisson;
	}

	public void faireConnaissanceAvec(Humain humain) {
		this.direBonjour();
		humain.repondre(this);
		this.memoriser(humain);
	}
	
	protected void memoriser(Humain humain) {
		memoire[nbConnaissance%30] = humain;
		nbConnaissance++;
	}
	
	private void repondre(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
	}
	
	public void listerConnaissance() {
		int nb = 30;
		if (nbConnaissance < 30) nb = nbConnaissance;
		String s = "";
		for(int i = 0; i < nb;i++) {
			s += memoire[i].getNom();
			if(i != nb-1)
				s += ",";
		}
		this.parler("Je connais beaucoup de monde dont : " + s);
	}
	public String getNom() {
		return nom;
	}

	public String getBoisson() {
		return boissonFavorite;
	}
	public int getArgent() {
		return argent;
	}

	private void setArgent(int argent) {
		this.argent = argent;
	}
	
	
	protected void gagnerArgent(int gain) {
		setArgent(getArgent() + gain);
	}
	protected void perdreArgent(int perte) {
		setArgent(getArgent() - perte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boissonFavorite);
	}
	public void boire() {
		parler("Mmmmm, un bon verre de "+boissonFavorite+" ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if(prix <= argent) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'acheter "+bien+" à "+prix+" sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous");
		}
	}
	
	protected void parler(String texte) {
		System.out.println(nom + " : " + texte + " ");
	}

}
