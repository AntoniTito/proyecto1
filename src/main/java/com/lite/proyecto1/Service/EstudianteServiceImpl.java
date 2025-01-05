package com.lite.proyecto1.Service;

import com.lite.proyecto1.Repository.EstudianteRepository;
import com.lite.proyecto1.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository repositorioEstudiante;

    @Autowired
    public EstudianteServiceImpl(EstudianteRepository repositorioEstudiante) {
        this.repositorioEstudiante = repositorioEstudiante;
    }
    @Override
    public List<Estudiante> listarEstudiantes(){
        return repositorioEstudiante.getListaEstudiantes();
    }

    @Override
    public List<Estudiante> filtrarNombre() {

        Collections.sort(repositorioEstudiante.getListaEstudiantes(), Comparator.comparing(Estudiante::getNombre));
        System.out.println("Estudiantes: " + repositorioEstudiante.getListaEstudiantes());
        return repositorioEstudiante.getListaEstudiantes();
    }

    @Override
    public List<Estudiante> filtrarTelefono() {
        Collections.sort(repositorioEstudiante.getListaEstudiantes(), Comparator.comparing(Estudiante::getNumeroCelular));
        return repositorioEstudiante.getListaEstudiantes();
    }

    @Override
    public List<Estudiante> filtrarNota() {
        Collections.sort(repositorioEstudiante.getListaEstudiantes(), Comparator.comparing(Estudiante::getPromedioNotas));
        return repositorioEstudiante.getListaEstudiantes();
    }



    @Override
    public List<Estudiante> filtrarNombreDesc() {
        Collections.sort(repositorioEstudiante.getListaEstudiantes(), Comparator.comparing(Estudiante::getNombre).reversed());
        return repositorioEstudiante.getListaEstudiantes();
    }

    @Override
    public List<Estudiante> filtrarTelefonoDesc() {
        Collections.sort(repositorioEstudiante.getListaEstudiantes(), Comparator.comparing(Estudiante::getNumeroCelular).reversed());
        return repositorioEstudiante.getListaEstudiantes();
    }

    @Override
    public List<Estudiante> filtrarNotaDesc() {
        Collections.sort(repositorioEstudiante.getListaEstudiantes(), Comparator.comparing(Estudiante::getPromedioNotas).reversed());
        return repositorioEstudiante.getListaEstudiantes();
    }


}
