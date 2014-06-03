package prop.presentacio;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import javax.swing.JTree;
import javax.swing.text.Position;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import prop.ctrldomini.*;
import prop.domini.categoria;

public class CtrlPresentacio {
	
	ctrlCategories categ;
	
	public CtrlPresentacio() {
		categ = new ctrlCategories();
		categ.inicialitzarCategories();
	}
	
	public void omplirArbre(JTree arbre, DefaultTreeModel model) {
		categ.afegirCategoria("Ciencies", "Biblioteca");
		categ.afegirCategoria("Llengües", "Biblioteca");
		categ.afegirCategoria("Art", "Biblioteca");
		categ.afegirCategoria("Informatica", "Ciencies");
		categ.afegirCategoria("Física", "Ciencies");
		categ.afegirCategoria("Java", "Informatica");
		categ.afegirCategoria("Java2", "Java");
		categ.afegirCategoria("Pintura", "Art");
		categ.afegirCategoria("Cubisme", "Pintura");
		categ.afegirCategoria("Anglès", "Llengües");
		Iterator<List<categoria>> it = categ.getCategories().iterator();
		HashSet<String> hash = new HashSet<String>();	
		it.next();
		while(it.hasNext()) {
			List<categoria> llista = it.next();
			TreePath path = arbre.getNextMatch(llista.get(0).getPare(), 0, Position.Bias.Forward);
			DefaultMutableTreeNode pare = (DefaultMutableTreeNode) path.getLastPathComponent();
			DefaultMutableTreeNode fill = new DefaultMutableTreeNode(llista.get(0).getNom());
			if (!hash.contains(fill.toString())) {
				model.insertNodeInto(fill, pare, pare.getChildCount());
				hash.add(fill.toString());
			}
			model.reload();
			arbre.expandPath(path);
			Iterator<categoria> it2 = llista.iterator();
			it2.next();
			while(it2.hasNext()) {
				categoria cat = it2.next();
				path = arbre.getNextMatch(cat.getPare(), 0, Position.Bias.Forward);
				pare = (DefaultMutableTreeNode) path.getLastPathComponent();
				fill = new DefaultMutableTreeNode(cat.getNom());
				if (!hash.contains(fill.toString())) {
					model.insertNodeInto(fill, pare, pare.getChildCount());
					hash.add(fill.toString());
				}
				model.reload();
				arbre.expandPath(path);
			}
		}
	}
}