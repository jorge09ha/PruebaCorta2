package com.pruebacorta2;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class ListaMaletas {

    private Node<Maleta> head;
    private Node<Maleta> tail;

    public void insert(Maleta maleta) {
        Node<Maleta> nuevoNodo = new Node<>(maleta);

        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);
            head.setBack(tail);//
        } else {
            Node<Maleta> aux = head;
            int i = 1;
            while (aux != tail) {
                i++;
                aux = aux.getNext();
            }
            if (i > 2) {
                aux = head;
                i = 1;
                while (aux != tail) {
                    i++;
                    aux = aux.getNext();
                }
                if (maleta.getPeso() % 2 == 0) {
                    System.out.println("El peso de la maleta es par inserta " + maleta.toString() + " en la última posición");
                    nuevoNodo.setBack(tail);//
                    tail.setNext(nuevoNodo);
                    tail = nuevoNodo;
                    tail.setNext(head);
                    head.setBack(tail);//

                } else {
                    System.out.println("El peso de la maleta impar inserta " + maleta.toString() + " en la tercera posición");
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
                nuevoNodo.setBack(tail);//
                tail.setNext(nuevoNodo);
                tail = nuevoNodo;
                tail.setNext(head);
                head.setBack(tail);//

            }
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
