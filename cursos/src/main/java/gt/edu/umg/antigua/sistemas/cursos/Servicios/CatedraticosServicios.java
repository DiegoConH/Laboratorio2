package gt.edu.umg.antigua.sistemas.cursos.Servicios;

import gt.edu.umg.antigua.sistemas.cursos.dao.CatedraticoRepositorio;
import gt.edu.umg.antigua.sistemas.cursos.dao.CursoRepositorio;
import gt.edu.umg.antigua.sistemas.cursos.model.Catedratico;
import gt.edu.umg.antigua.sistemas.cursos.model.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatedraticosServicios {
    @Autowired
    private CatedraticoRepositorio CS;

    public List<Catedratico> lista(){
        return (List<Catedratico>) this.CS.findAll();
    }

    public Catedratico crea(Catedratico catedratico){
        return this.CS.save(catedratico);
    }
}
