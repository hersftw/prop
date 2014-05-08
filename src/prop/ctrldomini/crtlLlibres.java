package prop.ctrldomini;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import prop.domini.Llibre;

public class crtlLlibres {
	private List<Llibre> llibres;
	
	/**@brief Constructora per defecte.
    *
    * S'executa automaticament a la hora de declarar un crtlLlibres.
    * \pre Cert.
    * \post El resultat es un crtlLlibres buit.
    */
	public void inicialitzarLlibres(){
		llibres = new ArrayList<Llibre>();
	}
	
	/**@brief Consultora d'un llibre.
    *
    * @param isbn del llibre.
    * \pre Cert.
    * \post Retorna el llibre associat al isbn.
    */
	public void consultarLlibre(int isbn){
		boolean find = false;
		Llibre l = null;
		Iterator<Llibre> it = llibres.iterator();
		while(!find & it.hasNext()){
			l = it.next();
			if (l.getId() == isbn) find = true;
		}
		if (find) {
			System.out.println(l.getId());
			System.out.println(l.getTitol());
			System.out.println(l.getAutor());
			System.out.println(l.getEditorial());
			System.out.println(l.getAny());
			System.out.println(l.getCategoria());
		}
		else System.out.println("Error: llibre no trobat!");
	}
	
	/**@brief Afegir llibre.
    *
    * @param llibre a afegir.
    * \pre Cert.
    * \post El resultat es el crtlLlibres amb el llibre afegit.
    */
	public void afegirLlibre(Llibre llibre){
		llibres.add(llibre);
	}
	
	/**@brief Modificadora d'un llibre.
	* 
    * @param isbn del llibre a modificar.
    * @param isbn nou.
    * @param titol nou.
    * @param autor nou.
    * @param editorial nova.
    * @param any nou.
    * @param categoria nova.
    * \pre Cert.
    * \post El resultat es crtlLlibres amb el llibre amb els nous parametres.
    */
	public void modificarLlibre(int isbn1, int isbn2, String titol, String autor,  String editorial,
			int any, String categoria ){
		boolean find = false;
		Llibre l = null;
		Iterator<Llibre> it = llibres.iterator();
		while(!find & it.hasNext()){
			l = it.next();
			if (l.getId() == isbn1) find = true;
		}
		if (find) {
			l.setId(isbn2);
			l.setTitol(titol);
			l.setAutor(autor);
			l.setEditorial(editorial);
			l.setAny(any);
			l.setCategoria(categoria);
		}
		else System.out.println("Error: llibre no trobat!");
	}
	
	/**@brief Destructora d'un llibre.
    *
    * @param isbn del llibre a eliminar.
    * \pre Cert.
    * \post El resultat es el crtlLlibres sense el llibre especificat.
    */
	public void eliminarLlibre(int isbn){
		boolean find = false;
		Llibre l = null;
		Iterator<Llibre> it = llibres.iterator();
		while(!find & it.hasNext()){
			l = it.next();
			if (l.getId() == isbn) find = true;
		}
		if (find) {
			llibres.remove(l);
		}
		else System.out.println("Error: llibre no trobat!");
	}
}
