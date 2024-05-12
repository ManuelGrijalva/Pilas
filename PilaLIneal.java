package Pilas;

public class PilaLIneal {
    private static final int TAMPILA = 49; // Tamaño de la pila

    private int cima; // valor del elemento en la cima de la pila

    private Object[] listaPila; // Array de objetos que representan la pila

    public PilaLIneal() {
        cima = -1;
        listaPila = new Object[TAMPILA];
    }

    public void insertar(Object elemento) throws Exception {
        if (pilaLlena()) {
            throw new Exception("Ups, StackOverflow");

        }
        //cima++;
        listaPila[++cima] = elemento;
    }
    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()) {
            throw new Exception("Pila Vacia (Underflow)");
        }
        aux = listaPila[cima];
        cima--;
        return aux;
    }

    public boolean pilaVacia() {
        return cima == -1;
    }


    public boolean pilaLlena() {
        return cima == TAMPILA - 1;
    }

    public void limpiarPila() {
        cima = -1;
    }
}
