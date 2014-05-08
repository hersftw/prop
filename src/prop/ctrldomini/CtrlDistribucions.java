package prop.ctrldomini;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
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
		boolean trobat = false;
		Distribucio dis = null;
		Iterator<Distribucio> it = distrib.iterator();
		while(!trobat & it.hasNext()){
			dis = it.next();
			if (dis.getNum() == num) trobat = true;
		}
		if (trobat) {
			dis.mostrarDistribucio();
		
		}
		else System.out.println("Error:la distribucio no ha estat trobada");
	}
	
	public void deleteDistribucio(int num){
		boolean trobat = false;
		Distribucio dis = null;
		Iterator<Distribucio> it = distrib.iterator();
		while(!trobat & it.hasNext()) {
			dis = it.next();
			if(dis.getNum() == num) trobat = true;
		}
		if (trobat) {
			distrib.remove(dis);
		}
		else System.out.println("Error: la distribucio no ha estat trobada");
	}
	
	public void modificarDistribucio(int num, int isbn1, int isbn2) {
		
		/*Distribucio dis = null;
		Iterator<Distribucio> it = distrib.iterator();
		while(!trobat & it.hasNext()){
			dis = it.next();
			if (dis.getNum() == num) trobat = true;
		}*/
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
