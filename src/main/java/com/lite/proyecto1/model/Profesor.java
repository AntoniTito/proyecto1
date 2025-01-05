package com.lite.proyecto1.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Profesor extends Persona {

    private Double salario;
    private List<String> materiasDictadas = new ArrayList( Arrays.asList("Matematica","Programacion","Finanzas"));


    public Profesor() {
        super();
    }

    public Profesor(String nombre, String numeroCelular, String correoElectronico, Direccion direccion) {
        super(nombre, numeroCelular, correoElectronico, direccion);
    }

}
