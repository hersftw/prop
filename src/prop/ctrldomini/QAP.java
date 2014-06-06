package prop.ctrldomini;

import java.util.List;

import prop.domini.afinidad;
import prop.domini.distancia;
import prop.domini.llibre;
import prop.domini.llibreria;

public class QAP {
	
	afinidad afinitats;
	distancia distancies;
	
	public QAP(List<llibre> llibres, llibreria lib, ctrlMatrius mats) {
		afinitats = mats.omplirMatriuAfi(llibres);
		distancies = mats.omplirMatriuDist(lib);
	}
	
	public void executarAlgorisme() {
		branchBoundCota bb = new branchBoundCota(afinitats.afinidades, distancies.getDistancies());
		for (int i = 0; i < bb.mejorSolucion.teclasAssignadas.length; i++) {
            System.out.print(bb.mejorSolucion.teclasAssignadas[i] + " ");
        }
		System.out.println("Cost: "+bb.mejorCost);
	}
}