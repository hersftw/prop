package prop.ctrldomini;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import prop.domini.afinidad;
import prop.domini.llibre;
import prop.domini.categoria;

public class calculAfinitats {
	public static ctrlCategories ctrl;
	public static crtlLlibres ctrll;
	
	public static void main(String[] args) {
		ctrl = new ctrlCategories();
		ctrll = new crtlLlibres();
		ctrl.inicialitzarCategories();
		ctrl.afegirCategoria("Ciencies", "Biblioteca");
		ctrl.afegirCategoria("Informatica", "Ciencies");
		ctrl.afegirCategoria("Fisica", "Ciencies");
		ctrl.afegirCategoria("Forces", "Fisica");
		ctrl.afegirCategoria("Cuina", "Biblioteca");
		ctrl.afegirCategoria("Art", "Biblioteca");
		ctrl.afegirCategoria("Pintura", "Art");
		ctrl.afegirCategoria("Musica", "Art");
		ctrl.afegirCategoria("Tralla", "Musica");
		ctrl.afegirCategoria("Metall", "Musica");
		ctrll.afegirLlibre(1, "a", "a", "a", 1, "Tralla");
		ctrll.afegirLlibre(2, "a", "a", "a", 2, "Forces");
		ctrll.afegirLlibre(3, "a", "a", "a", 3, "Pintura");
		ctrll.afegirLlibre(4, "a", "a", "a", 4, "Tralla");
		ctrll.afegirLlibre(5, "a", "a", "a", 5, "Fisica");
		ctrll.afegirLlibre(6, "a", "a", "a", 6, "Metall");
		ctrll.afegirLlibre(7, "a", "a", "a", 7, "Informatica");
		ctrll.afegirLlibre(8, "a", "a", "a", 8, "Informatica");
		ctrll.afegirLlibre(9, "a", "a", "a", 9, "Cuina");
		ctrll.afegirLlibre(10, "a", "a", "a", 10, "Musica");
		List<llibre> llibres = ctrll.getLlibres();
		afinidad afi = new afinidad(llibres.size());
		afi = omplirMatriu(llibres);
	}
	
	public static int calcularAfinitat(String a, String b) {
		//double afi = 0;
		int afi = 0;
		categoria c1 = ctrl.getCategoria(a);
		categoria c2 = ctrl.getCategoria(b);
		List<String> llista1 = new ArrayList<String>();
		List<String> llista2 = new ArrayList<String>();
		llista1.add(c1.getNom());
		llista2.add(c2.getNom());
		while (!c1.getNom().equals("Biblioteca")) {
			//System.out.println("Nom while1: "+c1.getNom());
			//System.out.println("Pare while1: "+c1.getPare());
			llista1.add(c1.getPare());
			c1 = ctrl.getCategoria(c1.getPare());
		}
		//System.out.println("Abans de while2: "+c2.getNom());
		while (!c2.getNom().equals("Biblioteca")) {
			//System.out.println("Nom while2: "+c2.getNom());
			//System.out.println("Pare while2: "+c2.getPare());
			llista2.add(c2.getPare());
			c2 = ctrl.getCategoria(c2.getPare());
		}
		//
		/*Iterator<String> it = llista1.iterator();
		while(it.hasNext()) System.out.print(it.next()+" ");
		System.out.println();
		Iterator<String> it2 = llista2.iterator();
		while(it2.hasNext()) System.out.print(it2.next()+" ");*/
		
		boolean trobat = false;
		int i = 0;
		while(!trobat) {
			int index = llista1.indexOf(llista2.get(i));
			if (index != -1) {
				if (!llista1.get(index).equals("Biblioteca")) afi = 100-((index+i)*10);
				trobat = true;
				//System.out.println("Index: "+index+ " i: "+i);
				//System.out.println("afi calculada: "+afi);
			}
			else ++i;
		}
		//System.out.println("Afinitat asignada: "+afi);
		return afi;
	}
	
	public static afinidad omplirMatriu(List<llibre> llibres) {
		afinidad afi = new afinidad(llibres.size());
		for (int i = 0; i < llibres.size(); ++i) {
			for (int j = 0; j < llibres.size(); ++j) {
				//System.out.println("Inserto "+llibres.get(i).getCategoria()+ " i "+llibres.get(j).getCategoria());
				afi.insertar_afinidad(i, j, calcularAfinitat(llibres.get(i).getCategoria(), llibres.get(j).getCategoria()));
				System.out.print(afi.consultar_afinidad(i, j)+" ");
			}
			System.out.println();
		}
		return afi;
	}
}