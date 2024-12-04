package Controlador;

public class nodo<x> {
    public nodo<x> siguiente; // Nodo siguiente genérico
    public nodo<x> anterior;  // Nodo anterior genérico
    public x dato;            // Dato almacenado en el nodo

    public nodo(x valor) {
        siguiente = null;
        anterior = null;
        dato = valor;
    }
}
