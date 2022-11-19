package com.pruebacorta2;

/**
 *
 * @author Jorge Hernandez Araya | jorge09ha
 */
public class Cliente extends Maleta {

    private int Edad, numVuelo;
    private String nombre, apellido1, apellido2, cedula;

    public Cliente(int Edad, String nombre, String apellido1, String apellido2, String cedula, int numVuelo, int peso, String tamanio) {
        super(peso, tamanio);
        this.Edad = Edad;
        this.numVuelo = numVuelo;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Edad=" + Edad + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", cedula=" + cedula + ", numVuelo=" + numVuelo + '}';
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    

}
