package personnages;
import java.util.Random;


public class Traitre extends Samourai {
	private int niveauTraitrise = 0;
	
	public Traitre(String seigneur,String nom, String boisson,int argent) {
		// TODO Auto-generated constructor stub
		super(seigneur,nom,boisson,argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mais je suis un traître et mon niveau de traîtrise est : "+niveauTraitrise+". Chut !");
		
	}
	
	public void ranconner(Commercant commercant) {
		if(niveauTraitrise < 3) {
			int argentCommercant = commercant.getArgent();
			commercant.perdreArgent(argentCommercant);
			int argentRanconner = argentCommercant*2/10;
			this.gagnerArgent(argentRanconner);
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi " + argentRanconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + this.getNom() + ".");
			niveauTraitrise++;
		}
		else {
			this.parler("Mince je ne peux plus rançonner personne sinon un samourai risque de me démarquer !");
		}
	}
	
	public void faireLeGentil() {
		if(nbConnaissance < 1) {
			this.parler("Je ne peux pas faire ami ami avec personne car ne je connais personne ! Snif.");
		}
		else {
			Random random = new Random();
			int nb;
			nb = random.nextInt(nbConnaissance%30);
			
			int don = getArgent()/20;
			Humain ami = memoire[nb];
			String nomAmi = ami.getNom();
			
			this.parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec" + nomAmi+".");
			this.parler("Bonjour l'ami !"+"Je voudrais vous aider en vous donnant " + don + " sous.");
			ami.gagnerArgent(don);
			this.perdreArgent(don);
			String nom = this.getNom();
			ami.parler("Merci "+nom+". Vous êtes quelqu'un de bien.");
			
			if(niveauTraitrise > 1) niveauTraitrise--;
			
			
		}
	}
	
}
