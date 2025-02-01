package menupilanodo;

import javax.swing.JOptionPane;

public class MenuPilaNodo {

    public static void main(String[] args) {
        ListaEnlazada enlace = new ListaEnlazada();

        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("***** Menú de Opciones *****\n"
                    + "1. Insertar nodo\n"
                    + "2. Eliminar nodo\n"
                    + "3. ¿La pila está vacía?\n"
                    + "4. ¿Cuál es el último valor en la pila?\n"
                    + "5. ¿Cuántos nodos tiene la lista?\n"
                    + "6. Vaciar Pila\n"
                    + "7. Mostrar contenido de la pila\n"
                    + "8. Salir\n"
                    + "Elija una opción: "));

            switch (op) {
                case 1:
                    int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor:"));
                    enlace.insertarNodo(valor);
                    break;
                case 2:
                    enlace.eliminarNodo();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, enlace.listaVacia() ? "La lista está vacía." : "La lista no está vacía.");
                    break;
                case 4:
                    enlace.mostrarUltimoValor();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "La lista tiene " + enlace.contarNodos() + " nodos.");
                    break;
                case 6:
                    enlace.vaciarLista();
                    break;
                case 7:
                    enlace.mostrarLista();
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (op != 8);
    }
}
