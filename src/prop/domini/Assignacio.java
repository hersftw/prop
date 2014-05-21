package prop.domini;

import prop.domini.llibre;

public class assignacio {

	 private llibre llibre;
	 private nodo nodo;
	 
	 /**Constructora per defecte**/
	 
	 public assignacio(llibre llibre, nodo nodo) {
			
			this.llibre = llibre;
			this.nodo = nodo;
	}
	 
	 
	 /**Consultora del node llibre
	    *
	    * @return el valor de llibre
	    */
	 public llibre getLlibre() {
		return llibre;
	}
	 /**Modificadora del Llibre llibre
	    *
	    * @param llibre 
	    * \pre Cert
	    * \post S'ha assignat el llibre a l'assignació
	    */
	public void setLlibre(llibre llibre) {
		this.llibre = llibre;
	}
	
	/**Consultora del node nodo
    * \pre Cert
    * \post S'ha retornat el node
    * @return el valor de nodo
    */
	public nodo getNodo() {
		return nodo;
	}
	
	/**Modificadora del node nodo
    *
    * @param nodo
    * \pre Cert
    * \post S'ha assignat el node a l'assignació
    */
	public void setNodo(nodo nodo) {
		this.nodo = nodo;
	}

	

	
}
