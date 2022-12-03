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
        ListaDetallada data = new ListaDetallada();
        data.initClientes();
        System.out.println("### Esta es la lista Detallada ordenada por edad ###\n");
        data.verClientesMaletas();
        System.out.println("\n### Fin de la lista Detallada ###\n");
        data.initListaMaletas();
        System.out.println("\n### Esta es la lista de Maletas ###\n");
        data.listMaletas.verMaletas();
        System.out.println("\n### Fin de la lista Maletas ###\n");
        ////-------------------------------------------------------------------------Fin son los datos .

    }

}
