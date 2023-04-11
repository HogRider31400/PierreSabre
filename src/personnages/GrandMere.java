package personnages;
import java.util.Random;
public class GrandMere extends Humain{
	
	
	private enum TypeHumain{
		Samourai("Samourai")
		,Ronin("Ronin")
		,Commercant("Commercant")
		,Traitre("Traitre")
		,habitant("habitant")
		,Yakuza("Yakuza")
		,GrandMere("GrandMere");
		private String nom;
		private TypeHumain(String s) {
			this.nom = s;
		}
		
		private String getNom() {
			return nom;
		}
		
		
	}
	
	public GrandMere(String nom,String boisson,int argent) {
		// TODO Auto-generated constructor stub
		super(nom,boisson,argent);
	}
	
	
	public String humainHasard() {
		TypeHumain[] types = TypeHumain.values();
		Random rand = new Random();
		int nb = types.length;
		int indice = rand.nextInt(nb);
		return types[indice].getNom();
		
	}
	
	
	
	@Override
	protected void memoriser(Humain humain) {
		if (nbConnaissance >= 5) {
			this.parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
			
		}
		else {
			super.memoriser(humain);
		}
	}
}
