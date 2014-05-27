package prop.domini;

public class llibre extends elemento {
	
	private String titol;
	private String autor;
	private String editorial;
	private int any;
	private String categoria;
	
	
    /**Constructora
    *
    * @param id Identificador del llibre, no pot haver repetits. 
    * @param titol Indica el nom del llibre.
    * @param autor Indica el nom del autor del llibre.
    * @param editorial Indica la editorial que va publicar el llibre.
    * @param any Indica el any en que es va publicar el llibre.
    * @param categoria Indica la categoria temàtica a la que pertany el llibre.
    * 
    * \pre Cert.
    * \post El resultat es un llibre amb tots els seus parametres.
    */
	
	public llibre(int id, String titol, String autor,  String editorial,
			int any, String categoria) {
		super(id);
		this.autor = autor;
		this.titol = titol;
		this.editorial = editorial;
		this.any = any;
		this.categoria = categoria; 
	}

	
	 /**Consultora del parametre id.
    *
    * @return el valor que pren id.
    * 
    * \pre Cert.
    * \post Retorna la id.

    */
	
	public int getId() {
		return super.getId();
	}


	/**Modificadora del parametre id del llibre
    *
    * @param id Indica el nou id del llibre.
    * 
    * \pre Ha de ser una id valida.
    * \post El parametre this.id passa a ser id.
    */
	
	public void setId(int id) {
		super.setId(id);
	}
	

		 /**Consultora del parametre titol.
    *
    * @return el valor que pren titol. 
    * 
    * \pre Cert.
    * \post Retorna el titol del llibre.

    */
	
	public String getTitol() {
		return titol;
	}
	
	
	/**Modificadora del parametre titol del llibre
    *
    * @param titol Indica el nou titol del llibre.
    */

	public void setTitol(String titol) {
		this.titol = titol;
	}
	
	
	 /**Consultora del parametre Autor.
    *
    * @return el valor que pren autor.

    */

	public String getAutor() {
		return autor;
	}


	/**Modificadora del parametre Autor del llibre
    *
    * @param autor Indica el nou autor del llibre.
    */
	
	public void setAutor(String autor) {
		this.autor = autor;
	}


	 /**Consultora del parametre editorial.
    *
    * @return el valor que pren editorial.

    */
	
	public String getEditorial() {
		return editorial;
	}

	
	/**Modificadora del parametre editorial del llibre
    *
    * @param editorial Indica la nova editorial del llibre.
    */
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	
	 /**Consultora del parametre any.
    *
    * @return el valor que pren any.

    */
	
	public int getAny() {
		return any;
	}


	/**Modificadora del parametre any del llibre
    *
    * @param any Indica el nou any de publicacio del llibre.
    */
	
	public void setAny(int any) {
		this.any = any;
	}

	
	 /**Consultora del parametre categoria.
    *
    * @return el valor que pren categoria.

    */
	
	public String getCategoria() {
		return categoria;
	}


	/**Modificadora del parametre id del llibre
    *
    * @param categoria Indica la nova categoria del llibre.
    */
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
