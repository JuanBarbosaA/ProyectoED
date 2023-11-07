

package programafinal;


public class NodoDoble {
    
    public Producto producto;
    NodoDoble siguiente;
    NodoDoble anterior;
    
    
    //constructor para cuando no hay nodos aun
    public NodoDoble(Producto producto){
        this(producto,null,null);
    }
    
    //constructor para cuando ya hay nodos
    public NodoDoble(Producto producto, NodoDoble s, NodoDoble a){
        this.producto = producto;
        siguiente = s;
        anterior = a;
    }
    
    
    
}
