package prop.domini;

import java.util.ArrayList;
import java.util.List;

public class conjuntoNodos {
	protected List<nodo> c;

	/**Constructora por defecto**/
	public conjuntoNodos() {
		c = new ArrayList<nodo>();
	}
	
	/**Añadir nodo
    *
    * @param n nodo a añadir
    */
	public void addNodo(nodo n) {
		if (c.contains(n)) System.out.println("Error:El nodo esta en la lista.");
		else c.add(n);
	}
	
	/**Obtener nodo
    *
    * @param coordenada x del nodo
    * @param coordenada y del nodo
    */
	public nodo getNodo(int x, int y) {
		nodo n = new nodo(x, y);
		if (!c.contains(n)) {
			System.out.println("Error:El nodo no existe.");
			return new nodo(-1, -1);
		}
		return c.get(c.indexOf(n));
	}
	
	/**Destructora nodo
    *
    * @param coordenada x del nodo
    * @param coordenada y del nodo
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
