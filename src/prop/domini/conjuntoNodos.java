package prop.domini;

import java.util.ArrayList;
import java.util.List;

public class conjuntoNodos {
	protected List<nodo> c;

	/**@brief Constructora per defecte.
    *
    * S'executa automaticament a la hora de declarar un conjunt de nodes.
    * \pre Cert.
    * \post El resultat es un conjunt de nodes buit.
    */
	public conjuntoNodos() {
		c = new ArrayList<nodo>();
	}
	
	/**@brief Afegir node.
    *
    * @param n node a afegir.
    * \pre Cert.
    * \post El resultat es el conjunt de nodes amb el node afegit.
    */
	public void addNodo(nodo n) {
		if (c.contains(n)) System.out.println("Error:El nodo esta en la lista.");
		else c.add(n);
	}
	
	/**@brief Consultora node.
    *
    * @param coordenada x del node.
    * @param coordenada y del node.
    * \pre Cert.
    * \post Retorna el node amb coordenades x i y.
    */
	public nodo getNodo(int x, int y) {
		nodo n = new nodo(x, y);
		if (!c.contains(n)) {
			System.out.println("Error:El nodo no existe.");
			return new nodo(-1, -1);
		}
		return c.get(c.indexOf(n));
	}
	
	/**@brief Destructora node.
    *
    * @param coordenada x del node.
    * @param coordenada y del node.
    * \pre Cert.
    * \post El resultat es el conjunt de nodes sense el node amb coordenades x i y.
    */
	public void deleteNodo(int x, int y) {
		nodo n = new nodo(x, y);
		try {
			c.remove(c.indexOf(n));
        }
        catch(Exception e)  {
            System.out.println("Error:Nodo no valido");
        }
	}

}
