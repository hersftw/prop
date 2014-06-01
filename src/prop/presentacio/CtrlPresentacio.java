package prop.presentacio;

import java.util.Iterator;
import java.util.List;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import prop.ctrldomini.*;
import prop.domini.categoria;

public class CtrlPresentacio {
	
	ctrlCategories categ;
	
	public CtrlPresentacio() {
		categ = new ctrlCategories();
		categ.inicialitzarCategories();
	}
	
	public void omplirArbre(DefaultMutableTreeNode top) {
		categ.afegirCategoria("C1", "Biblioteca");
		categ.afegirCategoria("C2", "Biblioteca");
		categ.afegirCategoria("C1.1", "C1");
		Iterator<List<categoria>> it = categ.getCategories().iterator();
		it.next();
		while(it.hasNext()) {
			List<categoria> llista = it.next();
			Iterator<categoria> it2 = llista.iterator();
			System.out.println(llista.get(0).getNom());
			DefaultMutableTreeNode pare = new DefaultMutableTreeNode(llista.get(0).getNom());
			if (llista.get(0).getPare() == "Biblioteca") top.add(pare);
			it2.next();
			while(it2.hasNext()) {
				DefaultMutableTreeNode fill = new DefaultMutableTreeNode(it2.next().getNom());
				pare.add(fill);
			}
			System.out.println(top);
		}
	}
}
