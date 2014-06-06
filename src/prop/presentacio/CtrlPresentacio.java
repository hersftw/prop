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
import prop.domini.llibreria;

public class CtrlPresentacio {
	
	ctrlCategories ctrlCat;
	crtlLlibres ctrlLlib;
	ctrlDistribucions ctrlDist;
	ctrlPersistencia ctrlPers;
	ctrlMatrius ctrlMats;
	llibreria lib;
	
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
		//ctrlMats = new ctrlMatrius();
		
		vistaMenu = new vistaMenuPrincipal(this);
		ctrlCat.inicialitzarCategories();
		hash = new HashSet<String>();
	}
	
	public void iniciarPresentacio() {
		//vistaMenu.mostrarVista();
		vistaMenu.mostrarVista();
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
	
	public void modificarCategories(String vell, String nou) {
		ctrlCat.modificarCategories(vell, nou);
	}
	
	// Llibres
	
	public void afegirLlibre(int isbn, String titol, String autor, String editorial, int any, String categoria) {
		ctrlLlib.afegirLlibre(isbn, titol, autor, editorial, any, categoria);
	}
	
	public void consultarLlibre(int isbn, StringBuilder titol, StringBuilder autor, StringBuilder editorial, int[] any, StringBuilder categoria) {
		ctrlLlib.consultarLlibre(isbn, titol, autor, editorial, any, categoria);
	}
	
	public void modificarLlibre(int isbn1, int isbn2, String titol, String autor,  String editorial, int any, String categoria ){
		ctrlLlib.modificarLlibre(isbn1, isbn2, titol, autor, editorial, any, categoria);
	}
	
	public void eliminarLlibre(int isbn){
		ctrlLlib.eliminarLlibre(isbn);
	}
	
	public boolean existeix (int isbn) {
		return ctrlLlib.existeix(isbn);
	}
	
	public void afegirDistribucio(int n, int np) {
		ctrlDist.afegirDistribucio(n, np);
		ctrlLlib.setN(n);
		lib = new llibreria(np, n);
	}
	
	public boolean estaPle(){
		return ctrlLlib.getN() == ctrlLlib.numLlibres();
		
	}
	
	public boolean existeixCat(String categoria) {
		return ctrlCat.existeix(categoria);
	}
	
	public int[] generarSolucio() {
		ctrlMats = new ctrlMatrius(ctrlCat, ctrlLlib);
		QAP sol = new QAP(ctrlLlib.getLlibres(), lib, ctrlMats);
		int[] vec = sol.executarAlgorisme();
		return vec;
	}
	
	// Vistes
	
	public void mostraPrincipal() {
		if (vistaGestCat != null) vistaGestCat.setVisible(false);
		if (vistaGestEstr != null) vistaGestEstr.setVisible(false);
		if (vistaGestLlib != null) vistaGestLlib.setVisible(false);
		if (vistaGestSol != null) vistaGestSol.setVisible(false);
		if (vistaJerar != null) vistaJerar.setVisible(false);
		if (vistaImpExp != null) vistaImpExp.setVisible(false);
		vistaMenu = new vistaMenuPrincipal(this);
		vistaMenu.setVisible(true);
	}
	
	// Vistes - Gestió
	
	public void mostraGestioCategories() {
		if (vistaCrearCat != null) vistaCrearCat.setVisible(false);
		if (vistaModCat != null) vistaModCat.setVisible(false);
		if (vistaCanviarOrd != null) vistaCanviarOrd.setVisible(false);
		if (vistaElimCat != null) vistaElimCat.setVisible(false);
		if (vistaMenu != null) vistaMenu.setVisible(false);
		vistaGestCat = new vistaGestionarCategoria(this);
		vistaGestCat.mostrarVista();
	}
	
	public void mostraGestioEstructura() {
		vistaMenu.setVisible(false);
		vistaGestEstr = new vistaGestionarEstructura(this);
		vistaGestEstr.setVisible(true);
	}
	
	public void mostraJerarquia() {
		hash.clear();
		vistaMenu.setVisible(false);
		vistaJerar = new vistaMostrarJerarquia(this);
		vistaJerar.setVisible(true);
	}
	
	public void mostraGestioLlibres() {
		vistaMenu.setVisible(false);
		if (vistaAfegirLlib != null) vistaAfegirLlib.setVisible(false);
		if (vistaCMELlib != null) vistaCMELlib.setVisible(false);
		vistaGestLlib = new vistaGestionarLlibres(this);
		vistaGestLlib.setVisible(true);
	}
	
	public void mostraGestioSolucions() {
		vistaMenu.setVisible(false);
		vistaGestSol = new vistaGestionarSolucions(this);
		vistaGestSol.setVisible(true);
	}

	public void mostraImportar() {
		vistaMenu.setVisible(false);
		vistaImpExp = new vistaImportarExportar(this);
		vistaImpExp.setVisible(true);
	}
	
	// Vistes - Categories
	
	public void mostraCrearCategoria() {
		hash.clear();
		vistaGestCat.setVisible(false);
		vistaCrearCat = new vistaCrearCategoria(this);
		vistaCrearCat.mostrarVista();
	}
	
	public void mostraModifCat() {
		vistaGestCat.setVisible(false);
		vistaModCat = new vistaModificarNomCat(this);
		vistaModCat.mostrarVista();
	}
	
	public void mostraElimCat() {
		vistaGestCat.setVisible(false);
		vistaElimCat = new vistaEliminarCategoria(this);
		vistaElimCat.setVisible(true);
	}
	
	public void mostraCanviarOrdre() {
		vistaGestCat.setVisible(false);
		vistaCanviarOrd = new vistaCanviarOrdre(this);
		vistaCanviarOrd.setVisible(true);
	}
	
	// Vistes - Llibres
	
	public void mostraAfegirLlibre() {
		vistaGestLlib.setVisible(false);
		vistaAfegirLlib = new vistaAfegirLlibre(this);
		vistaAfegirLlib.setVisible(true);
	}
	
	public void mostraCMELlibre() {
		vistaGestLlib.setVisible(false);
		vistaCMELlib = new vistaCMELlibre(this);
		vistaCMELlib.setVisible(true);
	}

	//Importar/Exportar
	
	public void importar(String path){
		gestorDades gd = new gestorDades(this);
		gd.leerJuegoDePrueba(path);
	}
	
	public void crearLlibreria(int n, int np) {
		lib = new llibreria(np, n);
	}
	
	
	
}