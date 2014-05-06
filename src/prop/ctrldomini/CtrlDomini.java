package prop.ctrldomini;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import prop.presentacio.*;
import prop.domini.*;

public class CtrlDomini {
	private List<List<Categoria>> categories;
	
	public void inicialitzarCategories() {
		categories = new ArrayList<List<Categoria>>();
		Categoria c = new Categoria("Biblioteca", null);
		List<Categoria> llista = new ArrayList<Categoria>();
		llista.add(c);
		categories.add(llista);
	}
	
	public void afegirCategoria(String nom, String pare) {
		Categoria c = new Categoria(nom, pare);
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
	
	public void eliminarCategoria(String nom) {
		Boolean trobat = false;
		int i = 0;
		String pare = null;
		List<Categoria> fills = new ArrayList<Categoria>();
		Iterator<List<Categoria>> it = categories.iterator();
		while(it.hasNext() & !trobat) {
			List<Categoria> cat = it.next();
			if(cat.get(0).getNom() == nom) {
				pare = cat.get(0).getPare();
				Iterator<Categoria> it2 = cat.iterator();
				if (it2.hasNext()) it2.next();
				while (it2.hasNext()){
					Categoria fill = it2.next();
					fill.setPare(pare);
					fills.add(fill);
				}
				categories.remove(i);
				trobat = true;
			}
			++i;
		}
		it = categories.iterator();
		trobat = false;
		while(it.hasNext() & !trobat) {
			List<Categoria> cat = it.next();
			if(cat.get(0).getNom() == pare) {
				Iterator<Categoria> it3 = cat.iterator();
				while(it3.hasNext()) {
					if (it3.next().getNom() == nom) it3.remove();
				}
				for (int j = 0;j<fills.size();++j) {
					cat.add(fills.get(j));
				}
				trobat = true;
			}
		}
	}
	
	public void modificarCategories(String vell, String nou) {
		Boolean trobat = false;
		int i = 0;
		String pare = null;
		Iterator<List<Categoria>> it = categories.iterator();
		while (it.hasNext() & !trobat) {
			List<Categoria> llista = it.next();
			if (llista.get(0).getNom() == vell) {
				llista.get(0).setNom(nou);
				pare = llista.get(0).getPare();
				categories.set(i, llista);
				trobat = true;
			}
			++i;
		}
		i = 0;
		trobat = false;
		it = categories.iterator();
		while (it.hasNext() & !trobat) {
			List<Categoria> llista = it.next();
			if (llista.get(0).getNom() == pare) {
				Iterator<Categoria> it2 = llista.iterator();
				while(it2.hasNext()) {
					Categoria cat = it2.next();
					if (cat.getNom() == vell) {
						cat.setNom(nou);
						llista.set(i, cat);
						trobat = true;
					}
					++i;
				}
			}
		}
	}
	
	public void canviarCategories(String cat1, String cat2) {
		Iterator<List<Categoria>> it = categories.iterator();
		Boolean trobat = false;
		int i = 0;
		String pare1 = null;
		String pare2 = null;
		while (it.hasNext() & !trobat){
			List<Categoria> llista = it.next();
			if (llista.get(0).getNom() == cat1) {
				pare1 = llista.get(0).getPare();
				
			}
		}
	}
	
	public void mostrarCategories() {
		Iterator<List<Categoria>> it = categories.iterator();
		while (it.hasNext()) {
			Iterator<Categoria> it2 = it.next().iterator();
			while(it2.hasNext()) {
				System.out.print(it2.next().getNom()+" ");
			}
			System.out.println();
		}
	}
}