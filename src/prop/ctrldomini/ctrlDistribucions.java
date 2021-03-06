package prop.ctrldomini;

import java.util.ArrayList;
import java.util.List;
import prop.domini.distribucio;
import prop.domini.assignacio;


public class ctrlDistribucions {
	
	private List<distribucio> distrib;
	
	/**Constructora per defecte

    */
	public ctrlDistribucions(){
		distrib = new ArrayList<distribucio>(); 
	}
	
	/**Afegeix una distribucio al conjunt de distribucions.
	 * 
	 * @param distribucio Distribucio que s'afegeix al conjunt de distribucions. 

	    */
	
	public void afegirDistribucio(distribucio distribucio) {
		distribucio.setNum(distrib.size());
		distrib.add(distribucio);
	}
	
	public void afegirDistribucio(int n, int np) {
		distribucio dis = new distribucio(distrib.size(), n, np);
		afegirDistribucio(dis);
	}
	
	/**Consulta una distribucio i la mostra
	 * 
	 * @param num numero de la distribucio a consultar. 

	    */
	
	public boolean consultarDistribucio(int num){
		distribucio dis = null;
		try{
			dis = distrib.get(num);
			dis.mostrarDistribucio();
			return true;
		
		}
		catch (Exception e){
			return false;
		}
	}
	
	/**Eliminar una distribucio del conjunt de distribucions
	 * 
	 * @param num numero de la distribucio a eliminar. 

	    */
	
	public boolean deleteDistribucio(int num){
		distribucio dis = null;
		try{
			dis = distrib.get(num);
			distrib.remove(dis);
			return true;
		
		}
		catch (Exception e){
			System.out.println("Error: No s'ha trobat la distribucio");
			return false;
		}
		
	}
	
	/**Modifica una distribucio del conjunt de distribucions, pasant-li dos llibres per a intercanviart-los
	 * 
	 * @param num numero de la distribucio a eliminar. 
	 * @param isbn1 identificador del llibre 1 que es vol intercanviar.
	 * @param isbn2 identificador del llibre 2 que es vol intercanviar.
	    */
	public boolean modificarDistribucio(int num, int isbn1, int isbn2) {
		
		
		distribucio dis = null;
		try{
		dis = distrib.get(num);
		
		}
		catch (Exception e){
			return false;
		}
			
			assignacio as1 = dis.consultarAssignacio(isbn1);
			assignacio as2 = dis.consultarAssignacio(isbn2);
			if(as1 == null || as2 == null) {
				throw new IllegalArgumentException("Error: Assignacio no trobada");
			}
			dis.editarAssignacions(as1, as2);
			return true;
					
	}
	
	public int sizeList (){
		if (!distrib.isEmpty()) return 0;
		else return distrib.size();
	}
	
	
}
