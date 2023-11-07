
package programafinal;


public class Tienda {

    int index;
    String nombre;
    String ubicacion;
    
    ListaDoblementeEnlazada listaProducto;
    Cola listaCola;
    
    public Tienda() {
    }

    public Tienda(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Tienda(int index, String nombre, String ubicacion) {
        this.index = index;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Tienda(int index, String nombre, String ubicacion, ListaDoblementeEnlazada listaProducto, Cola listaCola) {
        this.index = index;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listaProducto = listaProducto;
        this.listaCola = listaCola;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ListaDoblementeEnlazada getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ListaDoblementeEnlazada listaProducto) {
        this.listaProducto = listaProducto;
    }

    public Cola getListaCola() {
        return listaCola;
    }

    public void setListaCola(Cola listaCola) {
        this.listaCola = listaCola;
    }

    
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nUbicacion: " + ubicacion;
    }
    
}
