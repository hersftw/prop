package prop.ctrldomini;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import prop.domini.*;

public class ctrlCategories {
	private List<List<categoria>> categories;
	
	/**@brief Constructora per defecte.
    *
    * S'executa automaticament a la hora de declarar un controlador de categories.
    * \pre Cert.
    * \post El resultat es un controlador de categories buit.
    */
	public ctrlCategories() {
		
	}
	
	/**@brief Inicialitzar arbre de categories.
    *
    * \pre Cert.
    * \post El resultat es un arbre de categories amb l'arrel principal Biblioteca creada.
    */
	public void inicialitzarCategories() {
		categories = new ArrayList<List<categoria>>();
		categoria c = new categoria("Biblioteca", null);
		List<categoria> llista = new ArrayList<categoria>();
		llista.add(c);
		categories.add(llista);
	}
	
	/**@brief Afegir categoria.
    *
    * @param nom Nom de la categoria a afegir.
    * \pre Cert.
    * \post El resultat es l'arbre de categories amb la categoria afegida.
    */
	public void afegirCategoria(String nom, String pare) {
		categoria c = new categoria(nom, pare);
		List<categoria> llista = new ArrayList<categoria>();
		llista.add(c);
		Boolean trobat = false;
		int i = 0;
		Iterator<List<categoria>> it = categories.iterator();
		while(it.hasNext() & !trobat) {
			List<categoria> cat = it.next();
			if (cat.get(0).getNom().equals(pare)) {
				cat.add(c);
				categories.set(i, cat);
				trobat = true;
			}
			i++;
		}
		categories.add(llista);
	}
	
	/**@brief Eliminar node.
    *
    * @param nom Nom de la categoria a eliminar.
    * \pre Cert.
    * \post El resultat es l'arbre de categories amb la categoria eliminada.
    */
	public void eliminarCategoria(String nom) {
		Boolean trobat = false;
		int i = 0;
		String pare = null;
		List<categoria> fills = new ArrayList<categoria>();
		Iterator<List<categoria>> it = categories.iterator();
		while(it.hasNext() & !trobat) {
			List<categoria> cat = it.next();
			if(cat.get(0).getNom().equals(nom)) {
				pare = cat.get(0).getPare();
				Iterator<categoria> it2 = cat.iterator();
				if (it2.hasNext()) it2.next();
				while (it2.hasNext()){
					categoria fill = it2.next();
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
			List<categoria> cat = it.next();
			if(cat.get(0).getNom().equals(pare)) {
				Iterator<categoria> it3 = cat.iterator();
				while(it3.hasNext()) {
					if (it3.next().getNom().equals(nom)) it3.remove();
				}
				for (int j = 0;j<fills.size();++j) {
					cat.add(fills.get(j));
				}
				trobat = true;
			}
		}
	}
	
	/**@brief Modificar categoria.
    *
    * @param vell Nom antic de la categoria
    * @param nou Nom nou de la categoria
    * \pre Cert.
    * \post El resultat es l'arbre de categories amb la categoria canviada de nom.
    */
	public void modificarCategories(String vell, String nou) {
		Boolean trobat = false;
		int i = 0;
		String pare = null;
		Iterator<List<categoria>> it = categories.iterator();
		while (it.hasNext() & !trobat) {
			List<categoria> llista = it.next();
			if (llista.get(0).getNom().equals(vell)) {
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
			List<categoria> llista = it.next();
			if (llista.get(0).getNom().equals(pare)) {
				Iterator<categoria> it2 = llista.iterator();
				while(it2.hasNext()) {
					categoria cat = it2.next();
					if (cat.getNom().equals(vell)) {
						cat.setNom(nou);
						llista.set(i, cat);
						trobat = true;
					}
					++i;
				}
			}
		}
	}
	
	/**@brief Canviar categories.
    *
    * @param cat1 Categoria 1 a intercanviar
    * @param cat2 Categoria 2 a intercanviar
    * \pre Cert.
    * \post El resultat es l'arbre de categories amb les categories 1 i 2 intercanviades.
    */
	public void canviarCategories(String cat1, String cat2) {
		Iterator<List<categoria>> it = categories.iterator();
		int i, j;
		boolean find1, find2;
		find1 = find2 = false;
		i = j = 0;
		String pare1 = null;
		String pare2 = null;
		while (it.hasNext()) {
			List<categoria> llista = it.next();
			if (llista.get(0).getNom().equals(cat1)) {
				pare1 = llista.get(0).getPare();
				find1 = true;
			}
			else if (!find1) ++i;
			if (llista.get(0).getNom().equals(cat2))	{
				pare2 = llista.get(0).getPare();
				find2 = true;
			}
			else if (!find2) ++j;
		}
		categories.get(i).get(0).setPare(pare2);
		categoria c1 = categories.get(i).get(0);
		categories.get(j).get(0).setPare(pare1);
		categoria c2 = categories.get(j).get(0);
		
		find1 = find2 = false;
		it = categories.iterator();
		while(it.hasNext()) {
			List<categoria> llista = it.next();
			if (llista.get(0).getNom().equals(pare1)) {
				Iterator<categoria> it2 = llista.iterator();
				while(it2.hasNext()) if (it2.next().getNom().equals(cat1) & !find1) {
					it2.remove();
					find1 = true;
				}
				llista.add(c2);
			}
			if (llista.get(0).getNom().equals(pare2)) {
				Iterator<categoria> it3 = llista.iterator();
				while(it3.hasNext()) if (it3.next().getNom().equals(cat2) & !find2) {
					it3.remove();
					find2 = true;
				}
				llista.add(c1);
			}
		}
	}
	
	/**@brief Mostrar categories.
    * \pre Cert
    * \post S'ha mostrat l'arbre de categories.
    */
	public void mostrarCategories_old() {
		Iterator<List<categoria>> it = categories.iterator();
		while (it.hasNext()) {
			Iterator<categoria> it2 = it.next().iterator();
			while(it2.hasNext()) {
				System.out.print(it2.next().getNom()+" ");
			}
			System.out.println();
		}
	}
	
	public void mostrarCategories() {
		Iterator<List<categoria>> it = categories.iterator();
		while (it.hasNext()) {
			Iterator<categoria> it2 = it.next().iterator();
			while(it2.hasNext()) {
				System.out.print(it2.next().getNom()+" ");
			}
			System.out.println();
		}
	}
}