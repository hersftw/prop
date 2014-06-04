package prop.presentacio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.text.Position;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import prop.ctrldomini.*;
import prop.domini.categoria;
import prop.domini.llibre;

public class CtrlPresentacio {
	
	ctrlCategories ctrlCat;
	crtlLlibres ctrlLlib;
	ctrlDistribucions ctrlDist;
	ctrlPersistencia ctrlPers;
	
	vistaAfegirLlibre vistaAfegirLlib;
	vistaCanviarOrdre vistaCanviarOrd;
	vistaCMELlibre vistaCMELlib;
	vistaCrearCategoria vistaCrearCat;
	vistaEliminarCategoria vistaElimCat;
	vistaGestionarCategoria vistaGestCat;
	vistaGestionarEstructura vistaGestEstr;
	vistaGestionarLlibres vistaGestLlib;
	vistaGestionarSolucions vistaGestSol;
	vistaImportarExportar vistaImpExp;
	vistaMenuPrincipal vistaMenu;
	vistaModificarNomCat vistaModCat;
	vistaMostrarJerarquia vistaJerar;
	
	HashSet<String> hash;
	
	public CtrlPresentacio() {
		ctrlCat = new ctrlCategories();
		ctrlLlib = new crtlLlibres();
		ctrlDist = new ctrlDistribucions();
		
		vistaGestCat = new vistaGestionarCategoria(this);
		ctrlCat.inicialitzarCategories();
		hash = new HashSet<String>();
	}
	
	public void iniciarPresentacio() {
		//vistaMenu.mostrarVista();
		vistaGestCat.mostrarVista();
	}
	
	public void omplirArbre(JTree arbre, DefaultTreeModel model) {
		//arbre.removeAll();
		//model.reload();
		//HashSet<String> hash;
		//hash = new HashSet<String>();
		DefaultMutableTreeNode root = (DefaultMutableTreeNode)model.getRoot();
		//root.removeAllChildren();
		Iterator<List<categoria>> it = ctrlCat.getCategories().iterator();
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
			//model.reload();
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
				//model.reload();
				arbre.expandPath(path);
			}
			
		}
		//model.reload();
		//System.out.println(hash.size());
	}
	
	public void omplirArbre2(JTree arbre, DefaultTreeModel model) {
		ctrlCat.mostrarCategories();
		arbre.removeAll();
		model.reload();
		HashSet<String> hashCanviarOrdre;
		hashCanviarOrdre = new HashSet<String>();
		DefaultMutableTreeNode root = (DefaultMutableTreeNode)model.getRoot();
		//root.removeAllChildren();
		Iterator<List<categoria>> it = ctrlCat.getCategories().iterator();
		it.next();
		while(it.hasNext()) {
			List<categoria> llista = it.next();
			TreePath path = arbre.getNextMatch(llista.get(0).getPare(), 0, Position.Bias.Forward);
			DefaultMutableTreeNode pare = (DefaultMutableTreeNode) path.getLastPathComponent();
			DefaultMutableTreeNode fill = new DefaultMutableTreeNode(llista.get(0).getNom());
			if (!hashCanviarOrdre.contains(fill.toString())) {
				model.insertNodeInto(fill, pare, pare.getChildCount());
				hashCanviarOrdre.add(fill.toString());
			}
			//model.reload();
			arbre.expandPath(path);
			Iterator<categoria> it2 = llista.iterator();
			it2.next();
			while(it2.hasNext()) {
				categoria cat = it2.next();
				path = arbre.getNextMatch(cat.getPare(), 0, Position.Bias.Forward);
				pare = (DefaultMutableTreeNode) path.getLastPathComponent();
				fill = new DefaultMutableTreeNode(cat.getNom());
				if (!hashCanviarOrdre.contains(fill.toString())) {
					model.insertNodeInto(fill, pare, pare.getChildCount());
					hashCanviarOrdre.add(fill.toString());
				}
				//model.reload();
				arbre.expandPath(path);
			}
			
		}
		//model.reload();
		//System.out.println(hash.size());
	}
	
	// Categories
	
	public void afegirCategoria(String nom, String pare) {
		ctrlCat.afegirCategoria(nom, pare);
	}
	
	public void canviarCategories(String cat1, String cat2) {
		ctrlCat.canviarCategories(cat1, cat2);
	}
	
	public void eliminarCategoria(String nom) {
		ctrlCat.eliminarCategoria(nom);
	}
	
	public void ModificarCategories(String vell, String nou) {
		ctrlCat.modificarCategories(vell, nou);
	}
	
	// Llibres
	
	public void afegirLlibre(int isbn, String titol, String autor, String editorial, int any, String categoria) {
		ctrlLlib.afegirLlibre(isbn, titol, autor, editorial, any, categoria);
	}
	
	public void consultarLlibre(int isbn) {
		llibre ll = ctrlLlib.consultarLlibre(isbn);
		
	}
	
	public void modificarLlibre(int isbn1, int isbn2, String titol, String autor,  String editorial, int any, String categoria ){
		ctrlLlib.modificarLlibre(isbn1, isbn2, titol, autor, editorial, any, categoria);
	}
	
	public void eliminarLlibre(int isbn){
		ctrlLlib.eliminarLlibre(isbn);
	}
	
	// Vistes
	
	public void mostraGestioCategories(JPanel vista) {
		vistaCrearCat.amagarVista();
		vistaGestCat.activar();
	}
	
	public void mostraCrearCategoria(JPanel vista) {
		vistaGestCat.desactivar();
		if (vistaCrearCat == null) vistaCrearCat = new vistaCrearCategoria(this);
		vistaCrearCat.mostrarVista();
	}
	
	

	
	
}