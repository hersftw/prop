package prop.domini;
import prop.domini.Categoria;

public class Llibre extends Elemento {
	
	private String titol;
	private String autor;
	private String editorial;
	private int any;
	private Categoria categoria;
	
	
    /**Constructora por defecte
    *
    * @param id Identificador del llibre, no pot haver repetits. 
    * @param titol Indica el nom del llibre.
    * @param autor Indica el nom del autor del llibre.
    * @param editorial Indica la editorial que va publicar el llibre.
    * @param any Indica el any en que es va publicar el llibre.
    * @param categoria Indica la categoria tem�tica a la que pertany el llibre.
    */
	
	public Llibre(int id, String titol, String autor,  String editorial,
			int any, Categoria categoria) {
		super(id);
		this.autor = autor;
		this.titol = titol;
		this.editorial = editorial;
		this.any = any;
		this.categoria = categoria; 
	}

	
	 /**Consultora del par�metre id.
    *
    * @return el valor que pren id.

    */
	
	public int getId() {
		return id;
	}


	/**Modificadora del parametre id del llibre
    *
    * @param id Indica el nou id del llibre.
    */
	
	public void setId(int id) {
		this.id = id;
	}
	

		 /**Consultora del par�metre titol.
    *
    * @return el valor que pren titol. 

    */
	
	public String getTitol() {
		return titol;
	}
	
	
	/**Modificadora del parametre titol del llibre
    *
    * @param titol Indica el nou t�tol del llibre.
    */

	public void setTitol(String titol) {
		this.titol = titol;
	}
	
	
	 /**Consultora del par�metre Autor.
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


	 /**Consultora del par�metre editorial.
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

	
	 /**Consultora del par�metre any.
    *
    * @return el valor que pren any.

    */
	
	public int getAny() {
		return any;
	}


	/**Modificadora del parametre any del llibre
    *
    * @param any Indica el nou any de publicaci� del llibre.
    */
	
	public void setAny(int any) {
		this.any = any;
	}

	
	 /**Consultora del par�metre categoria.
    *
    * @return el valor que pren categoria.

    */
	
	public Categoria getCategoria() {
		return categoria;
	}


	/**Modificadora del parametre id del llibre
    *
    * @param categoria Indica la nova categoria del llibre.
    */
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
}
