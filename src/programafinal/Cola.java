
package programafinal;


public class Cola {

    NodoCola inicio;
    NodoCola fin;
    int tama;

    public Cola() {
        inicio = fin = null;
        tama = 0;
    }

    // Método para saber si está vacía
    public boolean estaVacia() {
        return inicio == null;
    }

    // Método para insertar elemento
    public void insertar(Cliente cliente) {
        NodoCola nuevo = new NodoCola(cliente);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tama++;
    }

    // Quitar elemento de la cola
    public Cliente quitar() {
        Cliente cliente = inicio.cliente;
        inicio = inicio.siguiente;
        tama--;
        return cliente;
    }

    // Quién está al inicio de la cola
    public Cliente inicioCola() {
        return inicio.cliente;
    }

    // Tamaño de la cola
    public int tamaCola() {
        return tama;
    }
    
}
