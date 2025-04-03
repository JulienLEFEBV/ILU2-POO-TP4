package produit;

public enum Unite {
	G("g"),KG("kg"),L("l"),CL("cl"),ML("ml"),PIECE("piece");
		
	private String nom;
		
	private Unite(String nom) {
		this.nom=nom;
	}
		
	public String toString() {
		return nom;
	}

}
