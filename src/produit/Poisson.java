package produit;

public class Poisson extends Produit {
	private String datePeche;

	public Poisson(String datePeche,String unite) {
		super("poisson", unite);
		this.datePeche=datePeche;

	}

	@Override
	public String getDescription() {
		return  getNom() + " péché " + datePeche + ".";
	}

}
