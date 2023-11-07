

package programafinal;


public class Cliente {
    
    int numeroCola;
    String nombre;
    String apellido;

    public Cliente() {
    }

    public Cliente(int numeroCola, String nombre, String apellido) {
        this.numeroCola = numeroCola;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getNumeroCola() {
        return numeroCola;
    }

    public void setNumeroCola(int numeroCola) {
        this.numeroCola = numeroCola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Número en cola " + numeroCola + ", Nombre: "+ nombre +" "+ apellido;
    }
    
    
    
    
}
