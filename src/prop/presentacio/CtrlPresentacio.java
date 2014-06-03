package prop.presentacio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.swing.JTree;
import javax.swing.text.Position;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import prop.ctrldomini.*;
import prop.domini.categoria;

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
	
	public CtrlPresentacio() {
		ctrlCat = new ctrlCategories();
		/*ctrlLlib = new crtlLlibres();
		ctrlDist = new ctrlDistribucions();
		ctrlPers = new ctrlPersistencia();
		vistaAfegirLlib = new vistaAfegirLlibre(this);
		vistaCanviarOrd = new vistaCanviarOrdre(this);
		vistaCMELlib = new vistaCMELlibre(this);
		vistaCrearCat = new vistaCrearCategoria(this);
		vistaElimCat = new vistaEliminarCategoria(this);
		vistaGestCat = new vistaGestionarCategoria(this);
		vistaGestEstr = new vistaGestionarEstructura(this);
		vistaGestLlib = new vistaGestionarLlibres(this);
		vistaGestSol = new vistaGestionarSolucions(this);
		vistaImpExp = new vistaImportarExportar(this);
		vistaModCat = new vistaModificarNomCat(this);
		vistaJerar = new vistaMostrarJerarquia(this);*/
		vistaMenu = new vistaMenuPrincipal(this);
		ctrlCat.inicialitzarCategories();
	}
	
	public void iniciarPresentacio() {
		vistaMenu.mostrarVista();
	}
	
	public void omplirArbre(JTree arbre, DefaultTreeModel model) {
		arbre.removeAll();
		model.reload();
		Iterator<List<categoria>> it = ctrlCat.getCategories().iterator();
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
	
	public void afegirCategoria(String nom, String pare) {
		ctrlCat.afegirCategoria(nom, pare);
	}
	
}