package gt.edu.umg.antigua.sistemas.cursos.dao;

import gt.edu.umg.antigua.sistemas.cursos.model.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepositorio extends CrudRepository <Curso, Long> {
}
