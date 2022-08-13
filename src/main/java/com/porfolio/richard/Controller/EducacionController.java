package com.porfolio.richard.Controller;

import com.porfolio.richard.Model.Educacion;
import com.porfolio.richard.Service.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class EducacionController {
    @Autowired
    private EducacionService EducacionService;

    //listar
    @GetMapping("/educacion")
    public List<Educacion> listar()
    {
        return educacionService.findAll();
	
	}

    //guardar
    @PostMapping("/educacion")
    public  Educacion guardar(@RequestBody Educacion educacion)
    {
        return educacionService.save(educacion);
    }

    //get una tarea
    @GetMapping("/educacion{id}")
    public Educacion getUnaEducacion(@PathVariable Integer id)
    {
        return educacionService.findById(id);
    }

    //Modeficar
    @PutMapping("/educacion/{id}")
    public Educacion modifecar(@RequestBody Educacion educacion,@PathVariable Integer id)
    {
        Educacion educacionActual= educacionService.findById(id);
        educacionActual.setTitulo(educacion.getTitulo());
        educacionActual.setFecha(educacion.getFecha());
	educacionActual.setDescripcion(educacion.getDescripcion());
	educacionActual.setImagen(educacion.getImagen());

	return educacionService.save(educacionActual);
    }
   
    @DeleteMapping("/educacion/{id}")
    public void eliminar(@PathVariable Integer id)
    {
        educacionService.delete(id);
    }

}
