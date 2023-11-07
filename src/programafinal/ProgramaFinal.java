package programafinal;

import javax.swing.JOptionPane;

public class ProgramaFinal {

    public static void main(String[] args) {

        ListaSimplementeEnlazada listaTiendas = new ListaSimplementeEnlazada();
        int opcion = 0;
        int index = 0;
        
        
        //Productos tienda1
        ListaDoblementeEnlazada listaProductosTienda1 = new ListaDoblementeEnlazada();
        Producto prod1t1 = new Producto(1, "Aceite", 5800, 42, "Alimentos");
        listaProductosTienda1.agregarAlFinal(prod1t1);
        
        Producto prod2t1 = new Producto(2, "Harina", 3200, 65, "Alimentos");
        listaProductosTienda1.agregarAlFinal(prod2t1);
        
        Producto prod3t1 = new Producto(3, "Cepillo de dientes", 1500, 12, "Aseo");
        listaProductosTienda1.agregarAlFinal(prod3t1);
        
        Producto prod4t1 = new Producto(4, "Escoba", 4000, 10, "Hogar");
        listaProductosTienda1.agregarAlFinal(prod4t1);
        
        //clientes tienda1
        Cola colaClientesTienda1 = new Cola();
        Cliente cli1t1 = new Cliente(1, "Juan", "Barbosa");
        colaClientesTienda1.insertar(cli1t1);
        Cliente cli2t1 = new Cliente(2, "Diego", "Rodriguez");
        colaClientesTienda1.insertar(cli2t1);
        Cliente cli3t1 = new Cliente(3, "Camilo", "Cifuentes");
        colaClientesTienda1.insertar(cli3t1);
        //tienda1
        Tienda tienda1 = new Tienda(1, "Tienda1", "Facatativá", listaProductosTienda1, colaClientesTienda1);
        listaTiendas.agregarAlFinal(tienda1);
        
        
   
        
        //productos tienda2
        ListaDoblementeEnlazada listaProductosTienda2 = new ListaDoblementeEnlazada();
        Producto prod1t2= new Producto(1, "Jabon", 8200, 14, "Aseo");
        listaProductosTienda2.agregarAlFinal(prod1t2);
        
        Producto prod2t2 = new Producto(2, "Servilleta de papel", 2500, 23, "Papeleria");
        listaProductosTienda2.agregarAlFinal(prod2t2);
        
        Producto prod3t2 = new Producto(3, "Azucar", 1700, 30, "Alimentos");
        listaProductosTienda2.agregarAlFinal(prod3t2);
        
        //clientes tienda1
        Cola colaClientesTienda2 = new Cola();
        Cliente cli1t2 = new Cliente(1, "Sebastian", "Moreno");
        colaClientesTienda2.insertar(cli1t2);
        Cliente cli2t2 = new Cliente(2, "Laura", "Peña");
        colaClientesTienda2.insertar(cli2t2);
        Cliente cli3t2 = new Cliente(3, "Tatiana", "Acosta");
        colaClientesTienda2.insertar(cli3t2);
        //tienda1
        Tienda tienda2 = new Tienda(2, "Tienda2", "Facatativá", listaProductosTienda2, colaClientesTienda2);
        listaTiendas.agregarAlFinal(tienda2);
        
        
        
        
        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                        + "1. Gestionar tienda"
                        //+ "2. Agregar un elemento al inicio de la lista"
                        + "\n2. Agregar tienda (al final de la lista)"
                        + "\n3. Mostrar lista de tiendas"
                        + "\n4. Eliminar tienda (desde el inicio)"
                        + "\n5. Eliminar tienda (desde el final)"
                        + "\n6. Salir", "Menu Tienda", 3));

                switch (opcion) {
                    case 1:
                        //mostrar tiendas y seleccionar 1
                        index = listaTiendas.GestionarTienda();
                        System.out.println("INDEX " + index);

                        //acedemos a la tienda con ese index
                        Tienda TiendaIndex = listaTiendas.obtenerTiendaPorIndice(index);
                        if (TiendaIndex != null) {
                            System.out.println("");
                        } else {
                            System.out.println("No sirve");
                        }

                        //muestra menu de la tienda index
                        //y si desea gestionar productos o clientes m
                        int decision
                                = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "¿Qué desea gestionar de "
                                        + TiendaIndex.getNombre() + "?"
                                        + "\n1. Productos"
                                        + "\n2. Clientes",
                                        "Gestión Tienda",
                                        JOptionPane.INFORMATION_MESSAGE));

                        if (decision == 1) {

                            //ListaDoblementeEnlazada listaProductos = new ListaDoblementeEnlazada();
                            //ya se inicializo y el tienda index llama a su propia lista
                            int opcionProd = 0;

                            do {
                                try {

                                    opcionProd = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                                            + "¿Qué deseas hacer?"
                                            + "\n1. Agregar producto (al inicio)"
                                            + "\n2. Agregar producto (al final)"
                                            + "\n3. Mostrar lista productos (de inicio a fin)"
                                            + "\n4. Mostrar lista productos (de fin a inicio)"
                                            + "\n5. Volver"
                                            ,"Menu Productos "+TiendaIndex.getNombre(), 3));

                                    switch (opcionProd) {
                                        case 1:
                                            
                                            int id = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                    "Ingresa el id del producto",
                                                    "Agregando producto al inicio", 3));
                                            String nombre = JOptionPane.showInputDialog(null,
                                                    "Ingresa el nombre del producto",
                                                    "Agregando producto al inicio", 3);
                                            double precio = Double.parseDouble(JOptionPane.showInputDialog(null,
                                                    "Ingresa el precio del producto",
                                                    "Agregando producto al inicio", 3));
                                            int stock = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                    "Ingresa stock del producto",
                                                    "Agregando producto al inicio", 3));
                                            String categoria = JOptionPane.showInputDialog(null,
                                                    "Ingresa categoria del producto",
                                                    "Agregando producto al inicio", 3);
                                            Producto productoInicio = new Producto(id, nombre, precio, stock, categoria);
                                            TiendaIndex.listaProducto.agregarAlInicio(productoInicio);
                                            
                                            break;

                                        case 2:
                                            int id2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el ID del producto", "Agregando producto al final", 3));
                                            String nombre2 = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto", "Agregando producto al final", 3);
                                            double precio2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el precio del producto", "Agregando producto al final", 3));
                                            int stock2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el stock del producto", "Agregando producto al final", 3));
                                            String categoria2 = JOptionPane.showInputDialog(null, "Ingresa la categoría del producto", "Agregando producto al final", 3);

                                            Producto productoFinal = new Producto(id2, nombre2, precio2, stock2, categoria2);
                                            TiendaIndex.listaProducto.agregarAlFinal(productoFinal);
                                            break;
                                        case 3:
                                            if (!TiendaIndex.listaProducto.estaVacia()) {
                                                TiendaIndex.listaProducto.mostrarListaInicioFin();
                                            } else {
                                                JOptionPane.showMessageDialog(null, "No hay productos en la lista", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            break;
                                        case 4:
                                            if (!TiendaIndex.listaProducto.estaVacia()) {
                                                TiendaIndex.listaProducto.mostrarListaFinInicio();
                                            } else {
                                                JOptionPane.showMessageDialog(null, "No hay productos en la lista", "Lista vacía", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            break;
                                        case 5:
                                            
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "La opcion no esta en el menu",
                                                    "Incorrecto", JOptionPane.INFORMATION_MESSAGE);
                                    }

                                } catch (NumberFormatException n) {
                                    JOptionPane.showMessageDialog(null, "Error: " + n.getMessage());
                                }
                            } while (opcionProd != 5);

                        } else if (decision == 2) {

                            int opcionCli = 0;

                            do {
                                try {
                                    opcionCli = Integer.parseInt(JOptionPane.showInputDialog(null,
                                            "¿Qué deseas hacer?"
                                            + "\n1. Insertar cliente en la cola\n"
                                            + "2. Atender cliente de la cola\n"
                                            + "3. ¿La cola está vacía?\n"
                                            + "4. Cliente ubicado al inicio de la cola\n"
                                            + "5. Tamaño de la cola\n"
                                            + "6. Salir",
                                            "Menú clientes "+TiendaIndex.getNombre(),
                                            JOptionPane.QUESTION_MESSAGE));

                                    switch (opcionCli) {
                                        case 1:
                                            int numeroCola = Integer.parseInt(JOptionPane.showInputDialog(null,
                                                    "Ingresa numero de cola del cliente",
                                                    "Insertando en la cola",
                                                    JOptionPane.QUESTION_MESSAGE));

                                            
                                            String nombre = JOptionPane.showInputDialog(null,
                                                    "Ingresa el nombre del cliente",
                                                    "Insertando en la cola",
                                                    JOptionPane.QUESTION_MESSAGE);

                                            String apellido = JOptionPane.showInputDialog(null,
                                                    "Ingresa el apellido del cliente",
                                                    "Insertando en la cola",
                                                    JOptionPane.QUESTION_MESSAGE);

                                            Cliente cliente = new Cliente(numeroCola, nombre, apellido);
                                            TiendaIndex.listaCola.insertar(cliente);
                                            break;

                                        case 2:
                                            if (!TiendaIndex.listaCola.estaVacia()) {
                                                Cliente clienteAtendido = TiendaIndex.listaCola.quitar();
                                                JOptionPane.showMessageDialog(null, "Atendiendo a cliente: " + clienteAtendido,
                                                        "Atendiendo cliente", JOptionPane.INFORMATION_MESSAGE);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "La cola está vacía",
                                                        "Cola vacía", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            break;

                                        case 3:
                                            if (TiendaIndex.listaCola.estaVacia()) {
                                                JOptionPane.showMessageDialog(null, "La cola está vacía",
                                                        "Cola vacía", JOptionPane.INFORMATION_MESSAGE);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "La cola no está vacía",
                                                        "Cola no vacía", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            break;

                                        case 4:
                                            if (!TiendaIndex.listaCola.estaVacia()) {
                                                JOptionPane.showMessageDialog(null, "Cliente ubicado al inicio de la cola: " + TiendaIndex.listaCola.inicioCola(),
                                                        "Cola vacía", JOptionPane.INFORMATION_MESSAGE);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "La cola está vacía",
                                                        "Cola vacía", JOptionPane.INFORMATION_MESSAGE);
                                            }
                                            break;

                                        case 5:
                                            JOptionPane.showMessageDialog(null, "El tamaño de la cola es " + TiendaIndex.listaCola.tamaCola(),
                                                    "Tamaño de la cola", JOptionPane.INFORMATION_MESSAGE);
                                            break;

                                        case 6:
                                            JOptionPane.showMessageDialog(null, "Finalizado",
                                                    "Fin", JOptionPane.INFORMATION_MESSAGE);
                                            System.exit(0);
                                            break;

                                        default:
                                            JOptionPane.showMessageDialog(null, "Opción incorrecta",
                                                    "Cuidado", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                } catch (NumberFormatException n) {
                                    JOptionPane.showMessageDialog(null, "Error: " + n.getMessage());
                                }
                            } while (opcionCli != 6);

                        } else {
                            System.out.println("Opcion incorrecta");
                        }

                        break;

                        //sin uso
                    case 0:
                        String nombre = JOptionPane.showInputDialog(null,
                                "Ingrese el nombre de la tienda",
                                "Agregando tienda al inicio de la lista", JOptionPane.INFORMATION_MESSAGE);

                        String ubicacion = JOptionPane.showInputDialog(null,
                                "Ingrese la ubicacion de la tienda",
                                "Agregando tienda al inicio de la lista", JOptionPane.INFORMATION_MESSAGE);

                        Tienda nuevaTienda = new Tienda(nombre, ubicacion);

                        listaTiendas.AgregarAlInicio(nuevaTienda);

                        break;

                    case 2:

                        String nombre2 = JOptionPane.showInputDialog(null,
                                "Ingrese el nombre de la tienda",
                                "Agregando tienda al inicio de la lista", JOptionPane.INFORMATION_MESSAGE);

                        String ubicacion2 = JOptionPane.showInputDialog(null,
                                "Ingrese la ubicacion de la tienda",
                                "Agregando tienda al inicio de la lista", JOptionPane.INFORMATION_MESSAGE);

                        Tienda nuevaTienda2 = new Tienda(nombre2, ubicacion2);

                        listaTiendas.agregarAlFinal(nuevaTienda2);

                        break;

                    case 3:

                        listaTiendas.MostrarLista();

                        break;

                    case 4:
                        listaTiendas.eliminarAlInicio();
                        break;

                    case 5:
                        listaTiendas.eliminarAlFinal();
                        break;

                    case 6:
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } while (opcion != 6);

    }

}
