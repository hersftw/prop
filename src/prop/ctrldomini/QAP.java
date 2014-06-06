package prop.ctrldomini;

public class QAP {
	
	int[][] afinitats;
	double[][] distancies;
	
	public QAP(List<llibre> llibres,) {
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