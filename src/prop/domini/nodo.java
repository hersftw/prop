package prop.domini;

public class nodo {
	protected int x;
	protected int y;
	
	/**@brief Constructora per defecte.
    *
    * @param coordenada x del node.
    * @param coordenada y del node.
    * \pre x >= 0, y >= 0.
    * \post El resultat es un nodo amb coordenades x i y.
    */
	public nodo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**@brief Consultora del parametre x.
    *
    * \pre cert.
    * \post Retorna la coordenada x.
    */
	public int getX() {
		return x;
	}
	
	/**@brief Modificadora del parametre x.
	* 
    * @param coordenada x del nodo
    * \pre x >= 0.
    * \post El resultat es la nova coordenada x.
    */
	public void setX(int x) {
		this.x = x;
	}
	
	/**@brief Consultora del parametre y.
    *
    * \pre cert.
    * \post Retorna la coordenada y.
    */
	public int getY() {
		return y;
	}
	
	/**@brief Modificadora del parametre y.
	* 
    * @param coordenada x del nodo
    * \pre y >= 0.
    * \post El resultat es la nova coordenada y.
    */
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public boolean equals(Object o) {
		nodo other = (nodo) o;
		return x == other.x & y == other.y;
	}
	

}
