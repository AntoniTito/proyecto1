package com.lite.proyecto1.Service;

import com.lite.proyecto1.model.Estudiante;

import java.util.List;

public interface EstudianteService {

    public List<Estudiante> listarEstudiantes();
    public List<Estudiante> filtrarNombre();
    public List<Estudiante> filtrarTelefono();
    public List<Estudiante> filtrarNota();

    public List<Estudiante> filtrarNombreDesc();
    public List<Estudiante> filtrarTelefonoDesc();
    public List<Estudiante> filtrarNotaDesc();

}
