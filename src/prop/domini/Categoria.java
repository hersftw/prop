package prop.domini;

public class Categoria {
	private String nom;
	
	
    /**Constructora por defecte
    *
    * @param nom Indica el nom de la categoria.
    */

	public Categoria(String nom) {
		this.nom = nom;
	}

	
	 /**Consultora del paràmetre nom.
    *
    * @return el valor que pren nom.

    */
	
	public String getNom() {
		return nom;
	}

	
	/**Modificadora del parametre nom de la categoria.
    *
    * @param nom Indica el nou nom de la categoria.
    */
	
	public void setNom(String nom) {
		this.nom = nom;
	}
		

}