package prop.domini;
/**
 * autor: Martí Roig Planas
 * versión: 1.0
 */

public class elemento {
    
    private int id;                     // Id de un elemento
    private static int numElem = 0;     // Nombre de elementos
    
    
    public elemento(){
        id = numElem;
        numElem++;
    }
    
    public elemento(int ident){
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

