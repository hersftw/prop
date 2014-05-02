package prop.domini;

public class Nodo {
	private int x;
	private int y;
	
	/**Constructora por defecto
    *
    * @param coordenada x del nodo
    * @param coordenada y del nodo
    */
	public Nodo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	 /**Consultora del parametro x**/
	public int getX() {
		return x;
	}
	
	/**Modificadora del parametro x del nodo
    *
    * @param coordenada x del nodo
    */
	public void setX(int x) {
		this.x = x;
	}
	
	/**Consultora del parametro y**/
	public int getY() {
		return y;
	}
	
	/**Modificadora del parametro y del nodo
    *
    * @param coordenada y del nodo
    */
	public void setY(int y) {
		this.y = y;
	}

}
