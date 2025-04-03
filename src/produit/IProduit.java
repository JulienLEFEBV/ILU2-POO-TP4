package produit;

public interface IProduit {

	String getNom();

	String decrireProduit();
	
	public default int calculerPrix(int prix) {
		return prix;
	};
}