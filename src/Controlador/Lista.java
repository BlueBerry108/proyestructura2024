package Controlador;

public class Lista<x> {
    public nodo<x> inicio; // Nodo genérico
    public nodo<x> fin;    // Nodo genérico

    public Lista() {
        inicio = null;
        fin = null;
    }

    public void InsertarFinal(x valor) {
        nodo<x> nuevo = new nodo<>(valor);

        if (inicio == null) { // Lista vacía
            inicio = nuevo;
            fin = nuevo;
        } else { // Agregar al final
            nuevo.anterior = fin;
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }
    public nodo <x> buscarElemento(int posicion){
       nodo<x> actual=inicio;
       int i=0;

       while(actual!=null){
           if (i==posicion)return actual;
               i++;
           actual=actual.siguiente;
       }
   return null;
   }

    public void Mostrar() {
        nodo<x> actual = inicio;

        if (actual == null) {
            System.out.println("No hay elementos en la lista.");
            return;
        }

        while (actual != null) {
            System.out.print(actual.dato.toString() + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void Eliminar(int posicion) {
        nodo<x> actual = inicio;
        int i = 0;
        
        //si es el primer nodo
        if (posicion == 0) {
            if (inicio == fin) {//si la lista esta vacia, pq entrara el indice del JTable y si es el primero da 0
                inicio = null;//ni uno ni otro
                fin = null;
            }else{ //si la lista no esta vacia              
                inicio = inicio.siguiente;//inicio apunta al nodo q le sigue 
                inicio.anterior= null;//y la referencia anterior, osea el inicio anterior se convierte en null
//                //asi eliminando el primer nodo
            }            
            return;            
        }

        //busca en q posicion esta el alumno caso no fuese el primer nodo, asi q seria por orden de entrada tbf
        while (actual != null && i < posicion - 1) {
            actual = actual.siguiente;
            i++;
        }//no llega al final, ya que no uso un nodo previo, osea la posicion llega un nodo antes del seleccionado
        //para poder saltarlo(? y asi 
        
        if (actual != null && actual.siguiente != null) {//como no llega al final, actual.sgte no puede ser null toncs
            //entraria si es q se quiere eliminar el nodo final o un nodo q no sea ni final ni inicio
            if (actual.siguiente == fin) {//si es q se tiene q eliminar el final
                actual.siguiente= null;//la referencia sgte de actual se convierte en null ya q este es el nodo final
                fin = actual;//se actualiza el nodo fin a actual (q es un nodo antes del q se elimino)
            }else {//si es q no es el nodo final ni inicio                
                actual.siguiente = actual.siguiente.siguiente;//la referencia sgte apunta al nodo dsps del nodo q se 
                //quiere eliminar
                actual.siguiente.siguiente.anterior= actual;//la referencia anterior apunta al nodo actual; asi saltando
                //el nodo entre ellos(el q se quiere eliminar)
            }
        } 
        
        
//        if (actual != null && actual.siguiente != null) {//no esta al final
//            if (posicion == 0) {
//                inicio = inicio.siguiente;
//            } else {
//                actual.siguiente = actual.siguiente.siguiente;
//            }
//
//            if (actual.siguiente != null) {//no esta al final(?
//                actual.siguiente.anterior = actual;
//            }
//        }
        
    }
}
