package scenario;

import produit.IProduit;
import produit.Poisson;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;
import personnages.Gaulois;

public class ScenarioTest {

	public static void main(String[] args) {

//		Gaulois gaulois=new Gaulois("Obelix", 32);
//		IProduit poisson = new Poisson("mardi", "kilo");
//        IProduit sanglier = new Sanglier("kilo",35,gaulois);
//        
//        System.out.println(poisson.getDescription());
//        System.out.println(sanglier.getDescription());
//        
//        IEtal[] marche = new IEtal[3];
//        OLDEtal<Sanglier> etalSanglier = new OLDEtal<>();
//        OLDEtal<Poisson> etalPoisson = new OLDEtal<>();
//        marche[0] = etalSanglier;
//        marche[1] = etalPoisson;

		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 9);
		Gaulois obelix = new Gaulois("Obélix", 20);
		Gaulois asterix = new Gaulois("Asterix", 6);

		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);

		Sanglier[] sangliersObelix = { sanglier1, sanglier2 };
		Sanglier[] sangliersAsterix = { sanglier3, sanglier4 };

		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = { poisson1 };

		// Créerle arché
		Etal<IProduit>[] marche = new Etal[3];
		marche[1] = new Etal<>(obelix, sangliersObelix, sangliersObelix.length, 8.0);
		marche[0] = new Etal<>(asterix, sangliersAsterix, sangliersAsterix.length, 10.0);
		marche[2] = new Etal<>(ordralfabetix, poissons, poissons.length, 7.0);

		// Placer les étals dans le marché
		marche[1].installerVendeur(obelix, sangliersObelix, 8);
		marche[0].installerVendeur(asterix, sangliersAsterix, 10);
		marche[2].installerVendeur(ordralfabetix, poissons, 7);

		StringBuilder chaine = new StringBuilder("ETAT MARCHE\n");

		chaine.append(marche[0].etatEtal() + "\n");
		chaine.append(marche[1].etatEtal() + "\n");
		chaine.append(marche[2].etatEtal() + "\n");

		chaine.append("ACHAT\n");

		int sangliersAchetes = 0;
		int quantiteSouhaitee = 3;
		int numeroEtal = 0;

		for (IEtal etal : marche) {
			if (sangliersAchetes >= quantiteSouhaitee) {
				break;
			}
			int quantiteDisponible = etal.contientProduit("sanglier", quantiteSouhaitee - sangliersAchetes);
			if (quantiteDisponible > 0) {
				double prixTotal = etal.acheterProduit(quantiteDisponible);
				sangliersAchetes += quantiteDisponible;
				chaine.append("\nA l'etal " + numeroEtal + " je paye " + prixTotal + " sous.");

			}
			numeroEtal++;
		}
		chaine.append("\nJ'ai acheté " + sangliersAchetes + " sangliers, j'en voulais " + quantiteSouhaitee + " !\n");

		chaine.append("\nETAT MARCHE A LA FIN\n\n");

		chaine.append(marche[0].etatEtal() + "\n");
		chaine.append(marche[1].etatEtal() + "\n");
		chaine.append(marche[2].etatEtal() + "\n");

		System.out.println(chaine.toString());

		;

	}

}
