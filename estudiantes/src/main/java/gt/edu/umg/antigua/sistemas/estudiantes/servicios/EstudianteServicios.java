package gt.edu.umg.antigua.sistemas.estudiantes.servicios;


import gt.edu.umg.antigua.sistemas.estudiantes.dao.EstudianteRepositorio;
import gt.edu.umg.antigua.sistemas.estudiantes.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicios {
    @Autowired
    private EstudianteRepositorio er;

    public List<Estudiante> lista(){
        return (List<Estudiante>) this.er.findAll();
    }

    public Estudiante crea(Estudiante estudiante){
        return this.er.save(estudiante);
    }



}
