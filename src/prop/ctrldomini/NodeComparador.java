package prop.ctrldomini;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alejandro.del.amo.gonzalez
 */

import java.util.Comparator;



public class nodeComparador implements Comparator<node>
{
    @Override
    public int compare(node x, node y)
    {
        // Compara los costes de los nodos y devuelve un valor 
        // indicando si es major,menor o igual
        if (x.cost < y.cost)
        {
            return -1;
        }
        if (x.cost > y.cost)
        {
            return 1;
        }
        return 0;
    }
}