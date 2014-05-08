package prop.domini;

public class Categoria {
	private String nom;
	private String pare;
	
	
    /**Constructora
    *
    * @param nom Indica el nom de la categoria.
    */

	public Categoria(String nom, String pare) {
		this.nom = nom;
		this.pare = pare;
	}

	
	 /**Consultora del paràmetre nom.
    *
    * @return el valor que pren nom.

    */
	
	public String getNom() {
		return nom;
	}
	/**Consultora del paràmetre pare.
    *
    * @return el valor que pren pare.

    */
	public String getPare() {
		return pare;
	}

	
	/**Modificadora del parametre nom de la categoria.
    *
    * @param nom Indica el nou nom de la categoria.
    */
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**Modificadora del parametre pare de la categoria.
    *
    * @param pare Indica el nou nom de la categoria superior.
    */
	public void setPare(String pare) {
		this.pare = pare;
	}
}