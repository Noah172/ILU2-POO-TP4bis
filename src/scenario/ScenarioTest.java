package scenario;


import produit.Poisson;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;
import produit.Produit;
import personnages.Gaulois;



public class ScenarioTest {

	public static void main(String[] args) {
		
		Gaulois gaulois=new Gaulois("Obelix", 32);
		Produit poisson = new Poisson("mardi", "kilo");
        Produit sanglier = new Sanglier("kilo",35,gaulois);
        
        System.out.println(poisson.getDescription());
        System.out.println(sanglier.getDescription());
        
        IEtal[] marche = new IEtal[3];
        Etal<Sanglier> etalSanglier = new Etal<>();
        Etal<Poisson> etalPoisson = new Etal<>();
        marche[0] = etalSanglier;
        marche[1] = etalPoisson;
        

	}

}
