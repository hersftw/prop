package prop.ctrldomini;

import java.util.Arrays;
import java.util.Collections;

import prop.ctrldomini.hungarianAlgorithm;


public class GLB {

	
	public static double[][] sol;
	public static double f;
	private static hungarianAlgorithm hungar = new hungarianAlgorithm();
	
	public static double fitaGLB(double[][] A, double[][] D){
		matcalc(A, D);
		f = hungar.computeAssignments(sol);
		return f;
	}
	
	private static void matcalc(double[][] A, double[][] D){
		
		sol = new double[D.length][D.length];
		Double[][] mat1 = new Double[D.length][D.length - 1];
		
		for(int i = 0;i < D.length;++i) {
	        for(int j = 0;j < i;++j) mat1[i][j] = D[i][j];
	        for(int j = i + 1;j < D.length;++j) mat1[i][j-1] = D[i][j];
	        Arrays.sort(mat1[i],Collections.reverseOrder());
	      }
		
		Double[] a = new Double[D.length - 1];
		for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < i; j++) a[j] = A[i][j];
            for (int j = i + 1; j < D.length; j++) a[j - 1] = A[i][j];
            Arrays.sort(a); 
            for (int j = 0; j < D.length; j++) {
                double pseudores = A[i][i] * D[j][j];
                for (int k = 0; k < D.length - 1; k++) pseudores += a[k] * mat1[j][k];
                sol[i][j] = pseudores;
            }
        }
	}
}
