package com.pruebacorta2;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class ListaDetallada {

    private Node<Cliente> head;
    private Node<Cliente> tail;
    public ListaMaletas listMaletas = new ListaMaletas();

    public void initClientes() {
        insert(new Cliente(31, "Jorge", "Hernandez", "Araya", "11111111", 325, 5, "80x20"));//1
        insert(new Cliente(22, "Ana", "Herrera", "Ramirez", "22222222", 245, 10, "120x30"));//2
        insert(new Cliente(16, "Hillary", "Molina", "Saborio", "33333333", 965, 15, "100x60"));//3
        insert(new Cliente(35, "Juan", "Morera", "Obando", "44444444", 125, 15, "150x75"));//4
        insert(new Cliente(18, "Alexis", "Muños", "Gonzalez", "55555555", 658, 6, "55x20"));//5
        insert(new Cliente(45, "Valentina", "Carmona", "Solano", "66666666", 125, 9, "88x65"));//6
        insert(new Cliente(28, "Erick", "Flores", "Mesen", "7777777", 255, 12, "130x65"));//7
    }

    public void initListaMaletas() {

        if (head != null) {
            Node<Cliente> temp = head;
            while (temp != tail) {
                listMaletas.insert(new Maleta(temp.getValue().getPeso(), temp.getValue().getTamanio(), temp.getValue().getCedula()));
                temp = temp.getNext();
            }
            listMaletas.insert(new Maleta(temp.getValue().getPeso(), temp.getValue().getTamanio(), temp.getValue().getCedula()));
        } else {
            System.out.println("\nNo hay nada en la lista.");
        }
    }

    public void insert(Cliente cli) {

        Node<Cliente> nuevoNodo = new Node<>(cli);

        if (head == null) {
            head = nuevoNodo;
            tail = head;
            tail.setNext(head);

        } else if (head.getValue().getEdad() > cli.getEdad()) {
            nuevoNodo.setNext(head);
            head = nuevoNodo;
            tail.setNext(head);

        } else if (tail.getValue().getEdad() <= cli.getEdad()) {
            tail.setNext(nuevoNodo);
            tail = nuevoNodo;
            tail.setNext(head);

        } else {

            Node<Cliente> aux = head;
            while (aux.getNext().getValue().getEdad() < cli.getEdad()) {
                aux = aux.getNext();
            }
            nuevoNodo.setNext(aux.getNext());
            aux.setNext(nuevoNodo);
        }
    }

    public void verClientesMaletas() {

        if (head != null) {
            Node<Cliente> aux = head;
            while (aux != tail) {
                System.out.println(aux.getValue().toString() + " Maleta{peso=" + aux.getValue().getPeso() + ", tamaño= " + aux.getValue().getTamanio() + "}");
                aux = aux.getNext();
            }
            System.out.println(aux.getValue().toString() + " Maleta{peso=" + aux.getValue().getPeso() + ", tamaño= " + aux.getValue().getTamanio() + "}");
        } else {
            System.out.println("\nNo hay nada en la lista.");
        }

    }

}
