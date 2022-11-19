package com.pruebacorta2;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //-------------------------------------------------------------------------Estos son los datos iniciales.
        ListaClientesMaletas data = new ListaClientesMaletas();
        data.initClientes();
        System.out.println("### Esta es la lista original ###\n");
        data.verClientesMaletas();
        System.out.println("\n### Fin de la lista original ###\n");
        data.initListaMaletas();
        System.out.println("\n### Esta es la lista de Maletas ###\n");
        data.listMaletas.verMaletas();
        System.out.println("\n### Fin de la lista Maletas ###\n");
        ////-------------------------------------------------------------------------Fin son los datos iniciales.
        //Nuevos clientes

    }

}
