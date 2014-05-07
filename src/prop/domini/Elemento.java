package prop.domini;
/**
 * autor: Martí Roig Planas
 * versión: 1.0
 */

public class Elemento {
    
    private int id;                     // Id de un elemento
    private static int numElem = 0;     // Nombre de elementos
    
    
    public Elemento(){
        id = numElem;
        numElem++;
    }
    
    public Elemento(int ident){
        id = ident;
        numElem++;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int ident) {
        id = ident;
    }
}

