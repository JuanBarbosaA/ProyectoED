

package programafinal;

import javax.swing.JOptionPane;


public class ListaDoblementeEnlazada {

    private NodoDoble inicio, fin;
    
    public ListaDoblementeEnlazada(){
        inicio = fin = null;
    }
    
    //metodo estavaia la lista?
    public boolean estaVacia(){
        return inicio == null; 
    }
    
    //metodo agrega nodo al final
    public void agregarAlFinal(Producto producto){
        if(!estaVacia()){
            //min tiene un nodo
            fin = new NodoDoble(producto, null, fin);
            fin.anterior.siguiente=fin;
        }
        else{
            //si aun no hay nodos
            inicio = fin = new NodoDoble(producto);
        }
    }
    
    //metodo agregar al inicio
    public void agregarAlInicio(Producto producto){
        if(!estaVacia()){
            //min tiene un nodo
            inicio = new NodoDoble(producto, inicio, null);
            inicio.siguiente.anterior = inicio;
        }
        else{
            //si aun no hay nodos
            inicio = fin = new NodoDoble(producto);
        }
    }
    
    //mostrar la lista inicio a fin
    public void mostrarListaInicioFin(){
        if(!estaVacia()){
            //hay algo en lista
            String datos = "";
            NodoDoble auxiliar = inicio;
            while(auxiliar!=null){
                //mostrar datos
                datos=datos+auxiliar.producto.toString();
                auxiliar=auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos, 
                    "Mostrando Lista de inicio a fin",
                    JOptionPane.INFORMATION_MESSAGE);
              
        }
        else{
            JOptionPane.showMessageDialog(null, "lista vacia");
        }
        
       
    }
    
    //metodo mostrar la lista de fin a inicio
    public void mostrarListaFinInicio(){
        if(!estaVacia()){
            //hay algo en lista
            String datos = "<=>";
            NodoDoble auxiliar = fin;
            while(auxiliar!=null){
                //mostrar datos
                datos=datos+"["+auxiliar.producto.toString()+"]<=>";
                auxiliar=auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos, 
                    "Mostrando Lista de inicio a fin",
                    JOptionPane.INFORMATION_MESSAGE);
              
        }
    }
    
}
