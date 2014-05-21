package prop.domini;
import prop.domini.llibre;

public class distribucio {
	private int num;
	public llibre[][] distribucio;
	
		public distribucio() {
		// TODO Auto-generated constructor stub
	}
	
	/**Constructora por defecto
    *
    * @param num Indica el numero de distribucio. 
    * @param n  Numero d'ubicacions de la distribucio.
    * @param np Numero de prestatges de la distribucio.
    */
	

	
	public distribucio(int num, int n, int np) {
		this.setNum(num);
		this.distribucio = new llibre[np][n/np];
		
	}
	
	/**Afegeix una assignacio a la distribucio
	    * 
	    * @param as Assignacio que s'afegeix a la distribucio. 
	    */
	public void afegirAssignacio(assignacio as){
		
		if(as.getNodo().getX() >= distribucio.length || as.getNodo().getX() < 0 || as.getNodo().getY() >= distribucio[0].length || as.getNodo().getY() < 0) {
            throw new IllegalArgumentException("Error al asignar las posiciones x e y");

		}
		else distribucio[as.getNodo().getX()][as.getNodo().getY()] = as.getLlibre();
	}
	
	/**Mostra la Distribucio de les assignacions
    * 
    * 
    */
	
	public void mostrarDistribucio() {
		
		for(int i = 0; i < distribucio.length; ++i) {
			for(int j = 0; j < distribucio[0].length; ++j){
				System.out.print(" en la pos "+i+" "+j+ " isbn:"+ distribucio[i][j].getId()+" |");
			}
			System.out.println();
		}
	}
	

	
	
	
	/**Edita la distribucio, intercanviant dues assignacions de lloc
	    * 
	    * 
	    */
	public void editarAssignacions(assignacio as1, assignacio as2)  {
		int tempx = as1.getNodo().getX();
		int tempy = as1.getNodo().getY();
		as1.getNodo().setX(as2.getNodo().getX());
		as1.getNodo().setY(as2.getNodo().getY());
		as2.getNodo().setX(tempx);
		as2.getNodo().setY(tempy);
		afegirAssignacio(as1);
		afegirAssignacio(as2);
	}
	
	
	/**Consulta el conjunt de llibres de la distribucio
	    * 
	    * 
	    */
	public llibre[][] consultarDistribucio(){
		return distribucio;
	}
	
	/**Consulta una ubicacio i el llibre assignat
	    * 
	    * 
	    */
	public assignacio consultarAssignacio(int isbn) {
		
		for(int i = 0; i < distribucio.length; ++i) {
			for(int j = 0; j < distribucio[0].length; ++j){
				if(distribucio[i][j].getId() == isbn) {
					nodo no = new nodo(i, j);
					assignacio as = new assignacio(distribucio[i][j], no);
					return as;
				}
			}
		}
		return null;
	}

	 /**Consultora del parametre num.
    *
    * @return    el valor que te num.

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
