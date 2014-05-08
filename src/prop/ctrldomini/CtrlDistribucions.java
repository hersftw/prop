package prop.ctrldomini;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import prop.domini.Distribucio;
import prop.domini.Assignacio;

public class CtrlDistribucions {

	private List<Distribucio> distrib;
	
	public void inicialitzarDistribucio(){
		distrib = new ArrayList<Distribucio>(); 
	}
	
	public void afegirDistribucio(Distribucio distribucio) {
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
		boolean trobat = false;
		Distribucio dis = null;
		Iterator<Distribucio> it = distrib.iterator();
		while(!trobat & it.hasNext()){
			dis = it.next();
			if (dis.getNum() == num) trobat = true;
		}
		if (trobat) {
			Distribucio dismod = dis;
			Assignacio as1 = dismod.consultarAssignacio(isbn1);
			Assignacio as2 = dismod.consultarAssignacio(isbn2);
			if(as1 == null || as2 == null) {
				throw new IllegalArgumentException("Error: Assignacio no trobada");
			}
			dismod.editarAssignacions(as1, as2);
			distrib.add(dismod);
		}
		else System.out.println("Error:la distribucio no ha estat trobada");
	}
	
	
	
}
