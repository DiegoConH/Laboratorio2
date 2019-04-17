package gt.edu.umg.antigua.sistemas.cursos.Controller;

import gt.edu.umg.antigua.sistemas.cursos.Servicios.CursosServicios;
import gt.edu.umg.antigua.sistemas.cursos.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.util.List;
@RestController
@RequestMapping("/cursos")
public class ControllerCurso {
    @Autowired
    private CursosServicios Cur;

    @GetMapping("/buscar")
    public List<Curso> variable2 () {
        return this.Cur.lista();
    }

    @PostMapping("/crear")
    public Curso crear(Curso curso){
        return this.Cur.crea(curso
        );
    }

}
