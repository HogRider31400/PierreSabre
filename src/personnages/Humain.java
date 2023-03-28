package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom,String boisson,int argent) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getBoisson() {
		return boisson;
	}

	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}

	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}
	
	
	public void gagnerArgent(int gain) {
		setArgent(getArgent() + gain);
	}
	public void perdreArgent(int perte) {
		setArgent(getArgent() - perte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boisson);
	}
	public void boire() {
		parler("Mmmmm, un bon verre de "+boisson+" ! GLOUPS !");
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
	
	public void parler(String texte) {
		System.out.println(nom + " : " + texte + " ");
	}

}
