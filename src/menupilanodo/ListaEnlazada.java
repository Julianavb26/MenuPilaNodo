package menupilanodo;

import javax.swing.JOptionPane;

public class ListaEnlazada {

    private Nodo cabeza;

    public void insertarNodo(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        }
        JOptionPane.showMessageDialog(null, "Nodo insertado con éxito.");
    }

    public void eliminarNodo() {
        if (cabeza != null) {
            cabeza = cabeza.siguiente;
            JOptionPane.showMessageDialog(null, "Nodo eliminado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        }
    }

    public boolean listaVacia() {
        return cabeza == null;
    }

    public void mostrarUltimoValor() {
        if (cabeza != null) {
            JOptionPane.showMessageDialog(null, "Último valor ingresado en la lista: " + cabeza.valor);
        } else {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        }
    }

    public int contarNodos() {
        int contador = 0;
        Nodo nodoActual = cabeza;
        while (nodoActual != null) {
            contador++;
            nodoActual = nodoActual.siguiente;
        }
        return contador;
    }

    public void vaciarLista() {
        cabeza = null;
        JOptionPane.showMessageDialog(null, "La lista ha sido vaciada.");
    }

    public void mostrarLista() {
        StringBuilder contenido = new StringBuilder();
        Nodo nodoActual = cabeza;
        if (nodoActual == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        } else {
            while (nodoActual != null) {
                contenido.append(nodoActual.valor).append("  ");
                nodoActual = nodoActual.siguiente;
            }
            JOptionPane.showMessageDialog(null, "Contenido de la lista: [" + contenido.toString()+"]");
        }
    }
}
