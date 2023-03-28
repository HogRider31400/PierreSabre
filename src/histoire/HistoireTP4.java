package histoire;
import personnages.Humain;
import personnages.Commerçant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	public static void main(String[] args) {
//		Humain hum = new Humain("Prof","kombucha",54);
//		hum.direBonjour();
//		hum.parler("J'ai 54 sous en poche.Je vais pouvoir m'offrir une boisson à 12 sous");
//		hum.acheter("une boisson", 12);
//		hum.boire();
//		hum.acheter("un jeu", 2);
//		hum.acheter("un kimono", 50);
		
//		Commerçant victime = new Commerçant("Marco",15);
		
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
//		yaku.direBonjour();
//		yaku.extorquer(victime);
		
//		Commerçant b = new Commerçant("Marco",15);
		Ronin roro = new Ronin("Roro","shochu",60);
//		roro.direBonjour();
//		roro.donner(b);
//		
		roro.parler("Je t'ai retrouvé vermine , tu vas payer pour ce que tu as fait à ce marchand");
		roro.provoquer(yaku);
		
	}
}



