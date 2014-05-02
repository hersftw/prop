package prop.domini;

import java.util.ArrayList;
import java.util.List;

public class Distribucio {
	private int num;
	private int[][] distribucio;
	
	/**Constructora por defecto**/
	
	public Distribucio(int num, int n, int np) {
		this.num = num;
		this.distribucio = new int[n/np][np];
		
	}
	
	public void AfegirAssignacio(Assignacio as){
		
	}
	
	/**Mostrar una Distribució d'assignacions
    * 
    * 
    */
	
	public void mostrarDistribució() {
		for(int i = 0; i < distribucio.length; ++i) {
			for(int j = 0; j < distribucio[0].length; ++j){
				System.out.println(distribucio[i][j]+" "+i+" "+j);
			}
		}
	}
	
	/**Consultar una Distribució d'assignacions
	    * 
	    * 
	    */
	
	public int consultarDistribucio() {
		for(int i = 0; i < distribucio.length; ++i) {
			return distribucio[i][j];
		}
	}
	
	
	
	/**Edita, intercanviant dues assignacions de lloc
	    * 
	    * 
	    */
	public void editAssignacions(Assignacio as1, Assignacio as2)  {
		
	}
	
}
