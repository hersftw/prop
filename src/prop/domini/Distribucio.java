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
	
	
	/**Afegeix una assignacio a la distribucio
	    * 
	    * @param as Assignacio que s'afegeix a la distribucio. 
	    */
	public void AfegirAssignacio(Assignacio as){
		distribucio[as.getNodo().getX()][as.getNodo().getY()] = as.getLlibre();
	}
	
	/**Mostra la Distribucio de les assignacions
    * 
    * 
    */
	
	public void mostrarDistribucio() {
		for(int i = 0; i < distribucio.length; ++i) {
			for(int j = 0; j < distribucio[0].length; ++j){
				System.out.println(distribucio[i][j].getId()+" "+i+" "+j+ " ");
			}
			System.out.println("/n");
		}
	}
	

	
	
	
	/**Edita la distribucio, intercanviant dues assignacions de lloc
	    * 
	    * 
	    */
	public void editarAssignacions(Assignacio as1, Assignacio as2)  {
		int tempx = as1.getNodo().getX();
		int tempy = as1.getNodo().getY();
		as1.getNodo().setX(as2.getNodo().getX());
		as1.getNodo().setY(as2.getNodo().getY());
		as2.getNodo().setX(tempx);
		as2.getNodo().setY(tempy);
	}
	
	 /**Consultora del paràmetre num.
    *
    * @return    el valor que té num.

    */

	public int getNum() {
		return num;
	}

	/**Modificadora del parametre num de la distribucio
	    * 
	    * @param num  el nou numero de la distribucio
	    */
	public void setNum(int num) {
		this.num = num;
	}
	
}
