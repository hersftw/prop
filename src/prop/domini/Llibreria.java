package prop.domini;

public class Llibreria extends ConjuntoNodos {
	protected int prestatges;
	protected int ubicacions;
	
	/**Constructora por defecto
    *
    * @param prestatges Número de prestatges de la llibreria. 
    * @param ubicacions  Número d'ubicacions de la llibreria.
    */
	
	public Llibreria(int prestatges, int ubicacions)  {
		super();
		this.prestatges = prestatges;
		this.ubicacions = ubicacions;
		
	}
	
	 /**Consultora del paràmetre prestatges.
    *
    * @return  els prestatges que té la llibreria.

    */
	
	public int getPrestatges(){
		return prestatges;
	}
	
	 /**Consultora del paràmetre ubicacions.
    *
    * @return  les ubicacions que conté la llibreria.

    */
	
	public int getUbicacions(){
		return ubicacions;
	}
	
	/**Modificadora del paràmetre prestatges de la llibreria
	    * 
	    * @param prestatges   nou número de prestatges.
	    */
		
	public void setPrestatges(int prestatges){
		this.prestatges = prestatges;
	}
	
	/**Modificadora del paràmetre ubicacions de la llibreria
	    * 
	    * @param ubicacions   nou número d'ubicacions. 
	    */

	public void setUbicacions(int ubicacions){
		this.ubicacions = ubicacions;
	}
	
	
	
}
