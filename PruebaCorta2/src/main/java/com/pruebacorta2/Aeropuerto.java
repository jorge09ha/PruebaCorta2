package com.pruebacorta2;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class Aeropuerto {

    private Node<Cliente> head;
    private Node<Cliente> tail;

    public void initData() {
        initInsert(new Cliente(31, "Jorge", "Hernandez", "Araya", "206900400", 325, 5, "80x20"));//1
        initInsert(new Cliente(22, "Ana", "Herrera", "Ramirez", "206900400", 245, 10, "120x30"));//2
        initInsert(new Cliente(16, "Hillary", "Molina", "Saborio", "206900400", 965, 15, "100x60"));//3
        initInsert(new Cliente(35, "Juan", "Morera", "Obando", "206900400", 125, 15, "150x75"));//4
        initInsert(new Cliente(18, "Alexis", "Muños", "Gonzalez", "206900400", 658, 6, "55x20"));//5
        initInsert(new Cliente(45, "Valentina", "Carmona", "Solano", "206900400", 125, 9, "88x65"));//6
        initInsert(new Cliente(28, "Erick", "Flores", "Mesen", "206900400", 255, 12, "130x65"));//7
        printList();
    }

    public void initInsert(Cliente cli) {

        Node<Cliente> nuevoNodo = new Node<>(cli);

        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);
            head.setBack(tail);//

        } else if (head.getValue().getEdad() > cli.getEdad()) {
            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);
            head.setBack(tail);//

        } else if (tail.getValue().getEdad() <= cli.getEdad()) {
            nuevoNodo.setBack(tail);//
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(head);
            head.setBack(tail);//

        } else {

            Node<Cliente> aux = head;
            while (aux.getNext().getValue().getEdad() < cli.getEdad()) {
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
            nuevoNodo.setBack(aux);//

            aux.getNext().setBack(nuevoNodo);//
            nuevoNodo.setBack(aux);//
        }
    }

    public void insert(int value) {

    }

    public void printList() {

        if (head != null) {
            Node<Cliente> aux = head;
            while (aux != tail) {
                System.out.println(aux.getValue().toString()+" Maleta{peso="+aux.getValue().getPeso()+", tamaño= "+aux.getValue().getTamanio()+"}");
                aux = aux.getNext();
            }
            System.out.println(aux.getValue().toString()+" Maleta{peso="+aux.getValue().getPeso()+", tamaño= "+aux.getValue().getTamanio()+"}");
        } else {
            System.out.println("\nNo hay nada en la lista.");
        }

    }

}
