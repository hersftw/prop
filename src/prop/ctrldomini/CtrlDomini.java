package prop.ctrldomini;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import prop.presentacio.*;
import prop.domini.*;

public class CtrlDomini {
	private List<List<Categoria>> categories;
	
	private void inicialitzarCategories() {
		Categoria c = new Categoria("Biblioteca");
		List<Categoria> llista = new ArrayList<Categoria>();
		llista.add(c);
		categories.add(llista);
	}
	
	private void afegirCategoria(String nom, String pare) {
		Categoria c = new Categoria(nom);
		List<Categoria> llista = new ArrayList<Categoria>();
		llista.add(c);
		Boolean trobat = false;
		int i = 0;
		Iterator<List<Categoria>> it = categories.iterator();
		while(it.hasNext() & !trobat) {
			List<Categoria> cat = it.next();
			if (cat.get(0).getNom() == pare) {
				cat.add(c);
				categories.set(i, cat);
				trobat = true;
			}
			i++;
		}
		categories.add(llista);
	}
	
	private void mostrarCategories() {
		Iterator<List<Categoria>> it = categories.iterator();
		while (it.hasNext()) {
			
		}
	}
}