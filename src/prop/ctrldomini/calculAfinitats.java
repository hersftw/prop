package prop.ctrldomini;
import java.util.List;

import prop.domini.afinidad;
import prop.domini.llibre;
import prop.domini.categoria;

public class calculAfinitats {
	public static ctrlCategories ctrl;
	
	public static void main(String[] args) {
		ctrl = new ctrlCategories();
		ctrl.inicialitzarCategories();
		ctrl.afegirCategoria("Hola", "Biblioteca");
		double d = calcularAfinitat("Hola", "Hola");
	}
	
	public static double calcularAfinitat(String a, String b) {
		double afi = 0;
		categoria c1 = ctrl.getCategoria(a);
		categoria c2 = ctrl.getCategoria(b);
		System.out.println(c1.getNom()+ " "+c1.getPare());
		List<String> llista1, llista2;
		while (!c1.getPare().equals("Biblioteca")) {
			llista1.add(e)
		}
		return afi;
	}
}
