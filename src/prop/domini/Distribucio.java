package prop.domini;



public class Distribucio {
	private int num;
	private Llibre[][] distribucio;
	
	/**Constructora por defecto**/
	
	public Distribucio(int num, int n, int np) {
		this.setNum(num);
		this.distribucio = new Llibre[n/np][np];
		
	}
	
	public void AfegirAssignacio(Assignacio as){
		
	}
	
	/**Mostrar una Distribució d'assignacions
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
	
	/**Consultar una Distribució d'assignacions
	    * 
	    * 
	    */
	
	public Llibre[][] consultarDistribucio() {
			return distribucio;
		
	}
	
	
	
	/**Edita, intercanviant dues assignacions de lloc
	    * 
	    * 
	    */
	public void editarAssignacions(Assignacio as1, Assignacio as2)  {
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
