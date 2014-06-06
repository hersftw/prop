package prop.ctrldomini;

import java.util.List;

import prop.domini.afinidad;
import prop.domini.distancia;
import prop.domini.llibre;
import prop.domini.llibreria;

public class QAP {
	
	afinidad afinitats;
	distancia distancies;
	List<llibre> llibres;
	
	public QAP(List<llibre> llibres, llibreria lib, ctrlMatrius mats) {
		System.out.println("hola1");
		this.llibres = llibres;
		afinitats = mats.omplirMatriuAfi(llibres);
		distancies = mats.omplirMatriuDist(lib);
		System.out.println("hola2");
	}
	
	public int[] executarAlgorisme() {
		System.out.println("Hola");
		branchBoundCota bb = new branchBoundCota(afinitats.afinidades, distancies.getDistancies());
		for (int i = 0; i < bb.mejorSolucion.teclasAssignadas.length; i++) {
            System.out.print(bb.mejorSolucion.teclasAssignadas[i] + " ");
        }
		System.out.println("Cost: "+bb.mejorCost);
		int[] res = {0};
		for (int i = 0; i < bb.mejorSolucion.teclasAssignadas.length; ++i) {
			res[i] = llibres.get(bb.mejorSolucion.teclasAssignadas[i]).getId();
		}
		return res;
	}
}