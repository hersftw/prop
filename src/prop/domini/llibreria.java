package prop.domini;

public class llibreria extends conjuntoNodos {
	protected int prestatges;
	protected int ubicacions;
	
	/**Constructora por defecto
    *
    * @param prestatges Numero de prestatges de la llibreria. 
    * @param ubicacions  Numero d'ubicacions de la llibreria.
    */
	
	public llibreria(int prestatges, int ubicacions)  {
		super();
		this.prestatges = prestatges;
		this.ubicacions = ubicacions;
		
	}
	
	 /**Consultora del parametre prestatges.
    *
    * @return  els prestatges que te la llibreria.

    */
	
	public int getPrestatges(){
		return prestatges;
	}
	
	 /**Consultora del parametre ubicacions.
    *
    * @return  les ubicacions que conte la llibreria.

    */
	
	public int getUbicacions(){
		return ubicacions;
	}
	
	/**Modificadora del parametre prestatges de la llibreria
	    * 
	    * @param prestatges   nou numero de prestatges.
	    */
		
	public void setPrestatges(int prestatges){
		this.prestatges = prestatges;
	}
	
	/**Modificadora del parametre ubicacions de la llibreria
	    * 
	    * @param ubicacions   nou numero d'ubicacions. 
	    */

	public void setUbicacions(int ubicacions){
		this.ubicacions = ubicacions;
	}
	
}
