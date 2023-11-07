package programafinal;

import javax.swing.JOptionPane;

public class ListaSimplementeEnlazada {

    private Nodo inicio, fin;

    public ListaSimplementeEnlazada() {
        this.inicio = null;
        this.fin = null;
    }

    //aqui se ponene los metodos de la lista
    public void AgregarAlInicio(Tienda nuevaTienda) {

        Nodo nodoNuevo = new Nodo(nuevaTienda, inicio);
        inicio = nodoNuevo;

        if (fin == null) {
            fin = inicio;
        }

    }

    public void MostrarLista() {

        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista de tiendas está vacía", "Lista de Tiendas", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder storeList = new StringBuilder("Lista de Tiendas:\n\n");
        int i = 1;
        Nodo current = inicio;
        while (current != null) {
            storeList.append("Tienda: " + i + "\n");

            Tienda tienda = current.getTienda();
            storeList.append("Nombre: ").append(tienda.getNombre()).append("\n");
            storeList.append("Ubicación: ").append(tienda.getUbicacion()).append("\n");
            storeList.append("\n");
            current = current.siguiente;
            i++;
        }

        JOptionPane.showMessageDialog(null, storeList.toString(), "Lista de Tiendas", JOptionPane.INFORMATION_MESSAGE);

    }

    public int GestionarTienda() {
        int index;

        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista de tiendas está vacía", "Lista de Tiendas", JOptionPane.INFORMATION_MESSAGE);
        }

        StringBuilder storeList = new StringBuilder("Lista de Tiendas:\n\n");
        int i = 1;
        Nodo current = inicio;
        while (current != null) {
            storeList.append("Tienda: " + i + "\n");

            Tienda tienda = current.getTienda();
            storeList.append("Nombre: ").append(tienda.getNombre()).append("\n");
            storeList.append("Ubicación: ").append(tienda.getUbicacion()).append("\n");
            storeList.append("\n");
            current = current.siguiente;
            i++;
        }

        index = Integer.parseInt(JOptionPane.showInputDialog(null, storeList.toString(), "Lista de Tiendas", JOptionPane.INFORMATION_MESSAGE));
        return index;
    }

    public boolean estaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregarAlFinal(Tienda nuevaTienda2) {

        Nodo nuevoNodo = new Nodo(nuevaTienda2);

        if (!estaVacia()) {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        } else {
            inicio = fin = nuevoNodo;
        }

    }

    public Tienda eliminarAlInicio() {

        if (estaVacia()) {
            JOptionPane.showMessageDialog(null,
                    "La lista esta vacia");
            return null;
        } else {

            Tienda tiendaEliminada = inicio.getTienda();

            if (inicio == fin) {

                inicio = fin = null;
            } else {

                inicio = inicio.siguiente;
            }
            JOptionPane.showMessageDialog(null, ""
                    + "Tienda eliminada: " + tiendaEliminada.toString());

            return tiendaEliminada;
        }

    }

    //metodo elimina del final y retorna lo que se elimino
    public Tienda eliminarAlFinal() {

        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            return null;
        } else {
            Tienda tiendaEliminada;

            if (inicio == fin) {

                tiendaEliminada = fin.getTienda();
                inicio = fin = null;
            } else {
                Nodo temporal = inicio;

                while (temporal.siguiente != fin) {
                    temporal = temporal.siguiente;
                }

                tiendaEliminada = fin.getTienda();
                fin = temporal;
                fin.siguiente = null;
            }
            JOptionPane.showMessageDialog(null, "Tienda eliminada: " + tiendaEliminada.toString());
            return tiendaEliminada;
        }

    }

    
    
    public Tienda obtenerTiendaPorIndice(int indice) {
    if (estaVacia() || indice < 0) {
        return null; // La lista está vacía o el índice es inválido
    }

    Nodo current = inicio;
    int i = 1;

    while (current != null && i < indice) {
        current = current.siguiente;
        i++;
    }

    if (current != null) {
        return current.getTienda(); // Devuelve la tienda en el índice especificado
    } else {
        return null; // El índice está fuera de rango
    }
}

    
    

}
