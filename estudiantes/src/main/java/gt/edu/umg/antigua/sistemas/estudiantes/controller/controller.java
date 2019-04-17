package gt.edu.umg.antigua.sistemas.estudiantes.controller;

import gt.edu.umg.antigua.sistemas.estudiantes.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import gt.edu.umg.antigua.sistemas.estudiantes.servicios.EstudianteServicios;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class controller {
    @Autowired
    private EstudianteServicios variable;

    @GetMapping("/buscar")
    public List<Estudiante> variable2 () {
        return this.variable.lista();
    }

    @PostMapping("/crear")
    public Estudiante crear(Estudiante estudiante){
        return this.variable.crea(estudiante);
    }


}
