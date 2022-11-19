package com.pruebacorta2;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class Maleta {

    private int peso;
    private String tamanio;

    public Maleta(int peso, String tamanio) {
        this.peso = peso;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Maleta{" + "peso=" + peso + ", tamanio=" + tamanio + '}';
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

}
