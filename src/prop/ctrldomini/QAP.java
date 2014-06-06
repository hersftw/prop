package prop.ctrldomini;

import java.util.List;

import prop.domini.llibre;
import prop.domini.llibreria;

public class QAP {
	
	int[][] afinitats;
	double[][] distancies;
	
	public QAP(List<llibre> llibres, llibreria lib, ctrlMatrius mats) {
		this.afinitats = afinitats;
		this.distancies = distancies;
		
	}
	
	public void executarAlgorisme() {
		branchBoundCota bb = new branchBoundCota(afinitats, distancies);
		for (int i = 0; i < bb.mejorSolucion.teclasAssignadas.length; i++) {
            System.out.print(bb.mejorSolucion.teclasAssignadas[i] + " ");
        }
		System.out.println("Cost: "+bb.mejorCost);
	}
}