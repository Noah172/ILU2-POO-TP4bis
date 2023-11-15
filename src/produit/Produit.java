package produit;

public abstract class Produit {
	protected String nom;
	protected String unite;
	
	public Produit(String nom, String unite) {
		super();
		this.nom = nom;
		this.unite = unite;
	}
	
	public String getNom() {
		return nom;
	}
	public abstract String getDescription();
}
