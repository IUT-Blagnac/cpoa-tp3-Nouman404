package pizza;
/**
 * @author HAMDI (from O'Reilly Head-First series)
 */
public abstract class Pizza {
	private String nom;

	
	public void preparer() {
		System.out.println("preperer");
	}

	public void cuire() {
		System.out.println("cuire");
	}

	public void couper() {
		System.out.println("couper");
	}

	public void emballer() {
		System.out.println("emballer");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


}
