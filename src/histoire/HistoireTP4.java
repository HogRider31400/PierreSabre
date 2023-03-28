package histoire;
import personnages.Humain;
import personnages.Commerçant;

public class HistoireTP4 {
	public static void main(String[] args) {
//		Humain hum = new Humain("Prof","kombucha",54);
//		hum.direBonjour();
//		hum.parler("J'ai 54 sous en poche.Je vais pouvoir m'offrir une boisson à 12 sous");
//		hum.acheter("une boisson", 12);
//		hum.boire();
//		hum.acheter("un jeu", 2);
//		hum.acheter("un kimono", 50);
		
		Commerçant victime = new Commerçant("Marco",20);
		victime.direBonjour();
		victime.seFaireExtorquer();
		victime.recevoir(15);
		victime.boire();
	
		
	}
}



