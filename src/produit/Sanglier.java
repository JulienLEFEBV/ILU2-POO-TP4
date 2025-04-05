package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	
	private int poids;
	private Gaulois chasseur;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier",Unite.KG);
		this.poids=poids;
		this.chasseur=chasseur;
	}
	
	public String decrireProduit() {
		return "sanglier de "+poids+" kg chassé par "+chasseur.getNom()+".";
	}
	
	@Override
	public int calculerPrix(int prix) {
		return (prix * poids)/1000;
	}
	
}
