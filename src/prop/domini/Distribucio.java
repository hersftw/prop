package prop.domini;
import prop.domini.Llibre;



public class Distribucio {
	private int num;
	private Llibre[][] distribucio;
	
	
	
	/**Constructora por defecto
    *
    * @param num Indica el numero de distribucio. 
    * @param n  Numero d'ubicacions de la distribucio.
    * @param np Numero de prestatges de la distribucio.
    */
	
	public Distribucio(int num, int n, int np) {
		this.setNum(num);
		this.distribucio = new Llibre[np][n/np];
		
	}
	
	
	/**Afegeix una assignació a la distribució
	    * 
	    * @param as Assignació que s'afegeix a la distribució. 
	    */
	public void AfegirAssignacio(Assignacio as){
		
	}
	
	/**Mostra la Distribució de les assignacions
    * 
    * 
    */
	
	public void mostrarDistribucio() {
		for(int i = 0; i < distribucio.length; ++i) {
			for(int j = 0; j < distribucio[0].length; ++j){
				System.out.println(distribucio[i][j]+" "+i+" "+j);
			}
		}
	}
	

	
	
	
	/**Edita la distribució, intercanviant dues assignacions de lloc
	    * 
	    * 
	    */
	public void editarAssignacions(Assignacio as1, Assignacio as2)  {
		
	}
	
	 /**Consultora del paràmetre num.
    *
    * @return    el valor que té num.

    */

	public int getNum() {
		return num;
	}

	/**Modificadora del paràmetre num de la distribució
	    * 
	    * @param num  el nou número de la distribució
	    */
	public void setNum(int num) {
		this.num = num;
	}
	
}
