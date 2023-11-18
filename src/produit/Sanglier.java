package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;

	public Sanglier(String unite,int poids,Gaulois chasseur) {
		super("sanglier", unite);
		this.poids=poids;
		this.chasseur=chasseur;
	}

	@Override
	public String getDescription() {
		return  getNom() + " de " + poids +" " + unite + " chassé par " + chasseur.getNom() + ".";
	}

}
