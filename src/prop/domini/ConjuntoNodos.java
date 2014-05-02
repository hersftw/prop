package prop.domini;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoNodos {
	private List<Nodo> c;

	//Constructora ConjuntoNodos
	public ConjuntoNodos() {
		c = new ArrayList<Nodo>();
	}
	
	public void addNodo(Nodo n) {
		c.add(n);
	}
	
	public Nodo getNodo(Nodo n) {
		return c.get(c.indexOf(n));
	}
	
	public void deleteNodo(Nodo n) {
		c.remove(c.indexOf(n));
	}

}
