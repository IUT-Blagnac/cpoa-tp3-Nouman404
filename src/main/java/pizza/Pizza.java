package pizza;
/**
 * @author HAMDI (from O'Reilly Head-First series)
 */
public abstract class Pizza {
	private String nom;

	
	public void preparer() {
		System.out.println("Préparation");
	}

	public void cuire() {
		System.out.println("Cuisson 25 minutes à 180°");
	}

	public void couper() {
		System.out.println("Découpage en parts triangulaires");
	}

	public void emballer() {
		System.out.println("Emballage dans une boîte carré");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


}
