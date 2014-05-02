package prop.domini;

public class Llibreria extends ConjuntoNodos {
	protected int prestatges;
	protected int ubicacions;
	
	public Llibreria(int prestatges, int ubicacions)  {
		super();
		this.prestatges = prestatges;
		this.ubicacions = ubicacions;
		
	}
	
	public int getPrestatges(){
		return prestatges;
	}
	
	public int getUbicacions(){
		return ubicacions;
	}
	
	public void setPrestatges(int prestatges){
		this.prestatges = prestatges;
	}

	public void setUbicacions(int ubicacions){
		this.ubicacions = ubicacions;
	}
	
	
	
}
