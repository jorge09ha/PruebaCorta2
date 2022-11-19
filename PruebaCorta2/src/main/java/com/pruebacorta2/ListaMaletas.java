package com.pruebacorta2;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class ListaMaletas {

    private Node<Maleta> head;
    private Node<Maleta> tail;

    public void insert(Maleta maleta) {
        if (head != null) {
            Node<Maleta> aux = head;
            int i = 1;
            while (aux != tail) {
                i++;
                aux = aux.getNext();
            }
            System.out.println("El tamaño de la lista es: " + i);
            Node<Maleta> nuevoNodo = new Node<>(maleta);

            if (i % 2 == 0) {
                System.out.println("El tamaño de la lista es par inserta " + maleta + " en la última posición");
                nuevoNodo.setBack(tail);//
                tail.setNext(nuevoNodo);
                tail = nuevoNodo;
                tail.setNext(head);
                head.setBack(tail);//

            } else {
                System.out.println("El tamaño de la lista es impar inserta " + maleta + " en la tercera posición");
                i = 1;
                aux = head;
                while (i != 3) {
                    aux = aux.getNext();
                    i++;
                }
                nuevoNodo.setBack(aux.getBack());
                nuevoNodo.setNext(aux);
                aux.setBack(nuevoNodo);
                aux = aux.getBack().getBack();
                aux.setNext(nuevoNodo);
            }

        } else {
            System.out.println("No hay datos");
        }

    }

    public void verMaletas() {
        if (head != null) {
            Node<Maleta> aux = head;
            while (aux != tail) {
                System.out.println(" Maleta{peso=" + aux.getValue().getPeso() + ", tamaño= " + aux.getValue().getTamanio() + ", cliente= " + aux.getValue().getCliCedula() + "}");
                aux = aux.getNext();
            }
            System.out.println(" Maleta{peso=" + aux.getValue().getPeso() + ", tamaño= " + aux.getValue().getTamanio() + ", cliente= " + aux.getValue().getCliCedula() + "}");
        } else {
            System.out.println("\nNo hay nada en la lista.");
        }

    }

}
