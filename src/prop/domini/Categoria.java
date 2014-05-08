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

	
	 /**Consultora del parÓmetre nom.
    * \pre Cert
    * \post S'ha retornat el nom de la categoria
    * @return el valor que pren nom.
    */
	public String getNom() {
		return nom;
	}
	
	/**Consultora del parÓmetre pare.
    * \pre Cert
    * \post S'ha retornat el pare de la categoria
    * @return el valor que pren pare.
    */
	public String getPare() {
		return pare;
	}

	
	/**Modificadora del parametre nom de la categoria.
    * 
    * @param nom Indica el nou nom de la categoria.
    * \pre Cert
    * \post S'ha assignat el nom a la categoria
    */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**Modificadora del parametre pare de la categoria.
    *
    * @param pare Indica el nou nom de la categoria superior.
    * \pre Cert
    * \post S'ha assignat el pare a la categoria
    */
	public void setPare(String pare) {
		this.pare = pare;
	}
}