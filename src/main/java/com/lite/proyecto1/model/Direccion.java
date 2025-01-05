package com.lite.proyecto1.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Direccion {

    private String direccion;
    private String ciudad;
    private String estado;
    private String codigoPostal;
    private String pais;
    private ArrayList<Persona> listaPersonas = new ArrayList<>();

    public Direccion(){

    }

}
