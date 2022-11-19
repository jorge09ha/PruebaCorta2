package com.pruebacorta2;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class ListaClentesMaletas {

    private Node<Cliente> head;
    private Node<Cliente> tail;

    public void initData() {
        insert(new Cliente(31, "Jorge", "Hernandez", "Araya", "11111111", 325, 5, "80x20"));//1
        insert(new Cliente(22, "Ana", "Herrera", "Ramirez", "22222222", 245, 10, "120x30"));//2
        insert(new Cliente(16, "Hillary", "Molina", "Saborio", "33333333", 965, 15, "100x60"));//3
        insert(new Cliente(35, "Juan", "Morera", "Obando", "44444444", 125, 15, "150x75"));//4
        insert(new Cliente(18, "Alexis", "Muños", "Gonzalez", "55555555", 658, 6, "55x20"));//5
        insert(new Cliente(45, "Valentina", "Carmona", "Solano", "66666666", 125, 9, "88x65"));//6
        insert(new Cliente(28, "Erick", "Flores", "Mesen", "206900400", 255, 12, "130x65"));//7
        System.out.println("### Esta es la lista original ###\n");
        verClientesMaletas();
        System.out.println("\n### Fin de la lista original ###\n");
    }

    public void initListaMaletas() {

        if (head != null) {
            ListaMaletas listMaletas = new ListaMaletas();
            Node<Cliente> aux = head;
            while (aux != tail) {
                listMaletas.insert(new Maleta(aux.getValue().getPeso(), aux.getValue().getTamanio(), aux.getValue().getCedula()));
                aux = aux.getNext();
            }
            listMaletas.insert(new Maleta(aux.getValue().getPeso(), aux.getValue().getTamanio(), aux.getValue().getCedula()));
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
