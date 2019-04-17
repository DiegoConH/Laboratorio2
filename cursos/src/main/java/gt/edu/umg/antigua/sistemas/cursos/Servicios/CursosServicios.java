package gt.edu.umg.antigua.sistemas.cursos.Servicios;

import gt.edu.umg.antigua.sistemas.cursos.dao.CursoRepositorio;
import gt.edu.umg.antigua.sistemas.cursos.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursosServicios {
    @Autowired
    private CursoRepositorio CR;

    public List<Curso> lista(){
        return (List<Curso>) this.CR.findAll();
    }

    public Curso crea(Curso curso){
        return this.CR.save(curso);
    }
}
