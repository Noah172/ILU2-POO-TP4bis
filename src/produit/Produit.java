package produit;

public abstract class Produit implements IProduit {
	protected String nom;
	protected String unite;
	
	public Produit(String nom, String unite) {
		super();
		this.nom = nom;
		this.unite = unite;
	}
	
	@Override
	public String getNom() {
		return nom;
	}
	@Override
	public abstract String getDescription();
}
