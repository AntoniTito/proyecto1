package com.lite.proyecto1.Controller;

import com.lite.proyecto1.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService estudianteService;

    @Autowired
    public EstudianteController(EstudianteService estudianteService){
        this.estudianteService = estudianteService;
    }

    @GetMapping
    public ResponseEntity<?> getAllEstudiantes(){
        return ResponseEntity.ok(estudianteService.listarEstudiantes());
    }

    @GetMapping("/nombre/asc")
    public ResponseEntity<?> getAllEstudiantesFiltroNombreAsc(){
        return ResponseEntity.ok(estudianteService.filtrarNombre());
    }

    @GetMapping("/nombre/desc")
    public ResponseEntity<?> getAllEstudiantesFiltroNombreDes(){
        return ResponseEntity.ok(estudianteService.filtrarNombreDesc());
    }

    @GetMapping("/nota/asc")
    public ResponseEntity<?> getAllEstudiantesFiltroNotaAsc(){
        return ResponseEntity.ok(estudianteService.filtrarNota());
    }

    @GetMapping("/nota/desc")
    public ResponseEntity<?> getAllEstudiantesFiltroNotades(){
        return ResponseEntity.ok(estudianteService.filtrarNotaDesc());
    }


    @GetMapping("/telefono/asc")
    public ResponseEntity<?> getAllEstudiantesFiltroTelefonoAsc(){
        return ResponseEntity.ok(estudianteService.filtrarTelefono());
    }
    @GetMapping("/telefono/desc")
    public ResponseEntity<?> getAllEstudiantesFiltroTelefonoDes(){
        return ResponseEntity.ok(estudianteService.filtrarTelefonoDesc());
    }

}
