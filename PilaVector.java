package Pilas;

import java.util.ArrayList;
import java.util.List;

public class PilaVector {

    private static final int INICIAL = 49; // Tamaño de la pila

    private int cima; // valor del elemento en la cima de la pila

    private List<Object> listaPila; // Array de objetos que representan la pila

    public PilaVector() {
        cima = -1;
        listaPila = new ArrayList<>(INICIAL);
    }

    public void insertar(Object elemento) throws Exception {
       cima++;
         listaPila.add(cima, elemento);
    }
    public Object quitar() throws Exception {
        Object aux;
        if (pilaVacia()) {
            throw new Exception("Pila Vacia (Underflow)");
        }
        aux = listaPila.remove(cima);
        cima--;
        return aux;
    }

    public boolean pilaVacia() {
        return cima == -1;
    }


    public boolean pilaLlena() {
        return cima == INICIAL - 1;
    }

    public void limpiarPila() throws Exception {
        while (!pilaVacia()) quitar();

    }
}
