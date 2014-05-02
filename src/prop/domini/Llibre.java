package prop.domini;

public class Llibre extends Elemento {
	
	private String titol;
	private String autor;
	private String editorial;
	private int any;
	
	
	public Llibre(int id, String autor, String titol, String editorial,
			int any) {
		super(id);
		this.autor = autor;
		this.titol = titol;
		this.editorial = editorial;
		this.any = any;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTitol() {
		return titol;
	}


	public void setTitol(String titol) {
		this.titol = titol;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public int getAny() {
		return any;
	}


	public void setAny(int any) {
		this.any = any;
	}
	
	
}
