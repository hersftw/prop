package prop.domini;

import java.util.ArrayList;
import java.util.List;

public class Distribucio {
	private int num;
	private List<Assignacio> a;
	
	public Distribucio(int num) {
		this.num = num;
		this.a = new ArrayList<Assignacio>();
		
	}
	
	public List<Assignacio> consultarDistribucio() {
		for(int i = 0; i < a.size(); ++i) {
			return a;
		}
	}
	
	
	public void deleteAssignacio(Assignacio as) {
		a.remove(a.indexOf(as));
	}
	
	
	public void editAssignacions(Assignacio as1, Assignacio as2)  {
		
	}
	
}
