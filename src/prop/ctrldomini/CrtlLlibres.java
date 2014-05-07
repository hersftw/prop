package prop.ctrldomini;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import prop.domini.Llibre;

public class CrtlLlibres {
	private List<Llibre> llibres;
	
	public void inicialitzarLlibres(){
		llibres = new ArrayList<Llibre>();
	}
	
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
	
	public void afegirLlibre(Llibre llibre){
		llibres.add(llibre);
	}
	
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
