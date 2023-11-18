package produit;

public class Poisson extends Produit {
	private String datePeche;

	public Poisson(String datePeche) {
		super("poisson", "gramme");
		this.datePeche=datePeche;

	}

	@Override
	public String getDescription() {
		return  getNom() + " péché " + datePeche + ".";
	}

	@Override
	public double calculerPrix(double prix) {	
		return prix;
	}

}
