package com.lite.proyecto1.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Estudiante extends Persona{

    private String numeroEstudiante;
    private Double promedioNotas;

    public static ArrayList<String> listadoAsignaturas = new ArrayList( Arrays.asList("Matematica","Literatura","Quimica"));
    private List<String> seminariosTomados = new ArrayList( Arrays.asList("Automatizacion","Inteligencia Artificial","Finanzas"));

    public Estudiante(String nombre, String numeroCelular, String correoElectronico, Direccion direccion, String numeroEstudiante, Double promedioNotas) {
        super(nombre, numeroCelular, correoElectronico, direccion);
        this.numeroEstudiante = numeroEstudiante;
        this.promedioNotas = promedioNotas;
    }

    public String getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(String numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public Double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(Double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

}
