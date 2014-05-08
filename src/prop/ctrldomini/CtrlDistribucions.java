package prop.ctrldomini;

import java.util.ArrayList;
import java.util.List;
import prop.domini.Distribucio;
import prop.domini.Assignacio;


public class CtrlDistribucions {

	private List<Distribucio> distrib;
	
	public void inicialitzarDistribucions(){
		distrib = new ArrayList<Distribucio>(); 
	}
	
	public void afegirDistribucio(Distribucio distribucio) {
		distribucio.setNum(distrib.size());
		distrib.add(distribucio);
	}
	
	public void consultarDistribucio(int num){
		Distribucio dis = null;
		try{
			dis = distrib.get(num);
			dis.mostrarDistribucio();
		
		}
		catch (Exception e){
			System.out.println("Error:No s'ha trobat la distribucio");
		}
	}
	
	public void deleteDistribucio(int num){
		Distribucio dis = null;
		try{
			dis = distrib.get(num);
			distrib.remove(dis);
		
		}
		catch (Exception e){
			System.out.println("Error:No s'ha trobat la distribucio");
		}
		
	}
	
	
	public void modificarDistribucio(int num, int isbn1, int isbn2) {
		
		
		Distribucio dis = null;
		try{
		dis = distrib.get(num);
		
		}
		catch (Exception e){
			System.out.println("Error:No s'ha trobat la distribucio");
		}
		
		
			Assignacio as1 = dis.consultarAssignacio(isbn1);
			Assignacio as2 = dis.consultarAssignacio(isbn2);
			if(as1 == null || as2 == null) {
				throw new IllegalArgumentException("Error: Assignacio no trobada");
			}
			dis.editarAssignacions(as1, as2);
			
		
		
	}
	
	
	
}
