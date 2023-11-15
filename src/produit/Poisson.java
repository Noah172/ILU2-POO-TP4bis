package produit;

public class Poisson extends Produit {
	private String datePeche;

	public Poisson(String nom, String unite,String datePeche) {
		super(nom, unite);
		this.datePeche=datePeche;

	}

	@Override
	public String getDescription() {
		return  getNom() + " pêché " + datePeche + ".";
	}

}
