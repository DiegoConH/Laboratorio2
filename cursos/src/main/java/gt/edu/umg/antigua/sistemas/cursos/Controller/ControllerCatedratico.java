package gt.edu.umg.antigua.sistemas.cursos.Controller;


import gt.edu.umg.antigua.sistemas.cursos.Servicios.CatedraticosServicios;
import gt.edu.umg.antigua.sistemas.cursos.model.Catedratico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/catedratico")

public class ControllerCatedratico {
    @Autowired
    private CatedraticosServicios Cate;

    @GetMapping("/buscar")
    public List<Catedratico> variable2 () {
        return this.Cate.lista();
    }

    @PostMapping("/crear")
    public Catedratico crear(Catedratico catedratico){
        return this.Cate.crea(catedratico);
    }


}
