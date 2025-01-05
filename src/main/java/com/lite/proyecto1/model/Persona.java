package com.lite.proyecto1.model;

public class Persona {
    private String nombre;
    private String numeroCelular;
    private String correoElectronico;
    private Direccion direccion;


    public Persona() {
    }

    public Persona(String nombre, String numeroCelular, String correoElectronico, Direccion direccion) {
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

    public String comprarPaseEstacionamiento(){
        return "Se realizo la compra del Estacionamiento";
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}
