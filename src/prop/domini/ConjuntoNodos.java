package prop.domini;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoNodos {
	private List<Nodo> c;

	/**Constructora por defecto**/
	public ConjuntoNodos() {
		c = new ArrayList<Nodo>();
	}
	
	/**Añadir nodo
    *
    * @param n nodo a añadir
    */
	public void addNodo(Nodo n) {
		if (c.contains(n)) c.add(n);
		else System.out.println("Error:Nodo no valido");
	}
	
	/**Obtener nodo
    *
    * @param coordenada x del nodo
    * @param coordenada y del nodo
    */
	public Nodo getNodo(int x, int y) {
		Nodo n = new Nodo(x, y);
		return c.get(c.indexOf(n));
	}
	
	/**Destructora nodo
    *
    * @param coordenada x del nodo
    * @param coordenada y del nodo
    */
	public void deleteNodo(int x, int y) {
		Nodo n = new Nodo(x, y);
		try {
			c.remove(c.indexOf(n));
        }
        catch(Exception e)  {
            System.out.println("Error:Nodo no valido");
        }
	}

}
