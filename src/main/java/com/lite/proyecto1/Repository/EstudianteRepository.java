package com.lite.proyecto1.Repository;

import com.lite.proyecto1.model.Direccion;
import com.lite.proyecto1.model.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public class EstudianteRepository {
    private Direccion direccion = new Direccion();
    private Estudiante estudiante1 = new Estudiante("estudiante1","111111111","estudiante1@gmail.com",null,"1", 16.0);
    private Estudiante estudiante2 = new Estudiante("estudiante2","222222222","estudiante2@gmail.com",null,"2", 14.0);
    private Estudiante estudiante3 = new Estudiante("estudiante3","333333333","estudiante3@gmail.com",null,"3", 17.0);
    private Estudiante estudiante4 = new Estudiante("estudiante4","444444444","estudiante4@gmail.com",null,"4", 14.0);
    private Estudiante estudiante5 = new Estudiante("estudiante5","555555555","estudiante5@gmail.com",null,"5", 18.0);
    private Estudiante estudiante6 = new Estudiante("estudiante6","666666666","estudiante6@gmail.com",null,"6", 12.0);
    private Estudiante estudiante7 = new Estudiante("estudiante7","777777777","estudiante7@gmail.com",null,"7", 19.0);
    private Estudiante estudiante8 = new Estudiante("estudiante8","888888888","estudiante8@gmail.com",null,"8", 20.0);
    private Estudiante estudiante9 = new Estudiante("estudiante9","999999999","estudiante9@gmail.com",null,"9", 15.0);
    private Estudiante estudiante10 = new Estudiante("estudiante10","000000000","estudiante10@gmail.com",null,"10", 11.0);


    private List<Estudiante> listaEstudiantes = new ArrayList<>(Arrays.asList(estudiante1,estudiante2,estudiante3,estudiante4, estudiante5, estudiante6, estudiante7,estudiante8, estudiante9, estudiante10));

    public EstudianteRepository(){

    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
}
