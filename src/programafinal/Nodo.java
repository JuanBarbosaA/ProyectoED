
package programafinal;


public class Nodo {

    public Tienda tienda;
    public Nodo siguiente;

    //constructor para agregar al final
    public Nodo(Tienda t) {
        this.tienda = t;
        this.siguiente = null;
    }
    
    //constructor para agregar al inicio

    public Nodo(Tienda t, Nodo n) {
        this.tienda = t;
        this.siguiente = n;
    }
    
    public Tienda getTienda(){
        return tienda;
    }
    
}
