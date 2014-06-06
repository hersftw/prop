package prop.ctrldomini;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import prop.domini.afinidad;
import prop.domini.distancia;
import prop.domini.distanciaCluster;
import prop.domini.llibre;
import prop.domini.categoria;
import prop.domini.llibreria;
import prop.domini.nodo;

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
		afi = omplirMatriuAfi(llibres);
		
		nodo a = new nodo(0, 0);
		nodo b = new nodo(4, 1);
		llibreria lib = new llibreria(2, 10);
		System.out.println(calcularDistancia(a, b));
		
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
			llista1.add(c1.getPare());
			c1 = ctrl.getCategoria(c1.getPare());
		}
		while (!c2.getNom().equals("Biblioteca")) {
			llista2.add(c2.getPare());
			c2 = ctrl.getCategoria(c2.getPare());
		}
		
		boolean trobat = false;
		int i = 0;
		while(!trobat) {
			int index = llista1.indexOf(llista2.get(i));
			if (index != -1) {
				if (!llista1.get(index).equals("Biblioteca")) afi = 100-((index+i)*10);
				trobat = true;
			}
			else ++i;
		}
		return afi;
	}
	
	public static afinidad omplirMatriuAfi(List<llibre> llibres) {
		afinidad afi = new afinidad(llibres.size());
		for (int i = 0; i < llibres.size(); ++i) {
			for (int j = 0; j < llibres.size(); ++j) {
				afi.insertar_afinidad(i, j, calcularAfinitat(llibres.get(i).getCategoria(), llibres.get(j).getCategoria()));
				System.out.print(afi.consultar_afinidad(i, j)+" ");
			}
			System.out.println();
		}
		return afi;
	}
	
	public static double calcularDistancia(nodo a, nodo b) {
		double x = Math.pow(a.getX()-b.getX(),2);
		double y = Math.pow(a.getX()-b.getY(), 2);
		System.out.println(Math.sqrt(x+y));
		return Math.sqrt(x+y);
	}
	
	public static distancia omplirMatriuDist(llibreria lib) {
		//int cols = lib.getUbicacions()/lib.getPrestatges();
		List<nodo> llista = lib.getNodes();
		distancia mat = new distancia(lib.getUbicacions());
		for(int i = 0; i < lib.getUbicacions(); ++i) {
			for (int j = 0; j < lib.getUbicacions(); ++j) {
				mat.setDistancia(i, i, calcularDistancia(llista.get(i),llista.get(j)));
				
			}
		}
		return mat;
	}
}