package com.porfolio.richard.Controller;

import com.porfolio.richard.DTO.Mensaje;
import com.porfolio.richard.Entity.Educacion;
import com.porfolio.richard.Service.EducacionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@RestController
@RequestMapping("/api/educacion")
@CrossOrigin(origins= {"*"})

public class EducacionController {

    @Autowired
    EducacionService educacionService;

@GetMapping("/lista")
    public ResponseEntity<List<Educacion>> getLista(){
        List<Educacion> lista = educacionService.obtenerTodos();
        return new ResponseEntity<List<Educacion>>(lista, HttpStatus.OK);
    }
    @GetMapping("/detalle/{id}")
    public ResponseEntity<Educacion> getOne(@PathVariable Long id){
        Educacion educacion = educacionService.obtenerPorId(id).get();
        return new ResponseEntity<Educacion>(educacion, HttpStatus.OK);
    }

 

    @PostMapping("/nuevo-educacion")
    public ResponseEntity<Educacion> create(@RequestBody  Educacion educacion){
        educacionService.guardar(educacion);
        return new ResponseEntity(new Mensaje("educacion guardada"),HttpStatus.CREATED);
        
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Educacion> update(@RequestBody Educacion educacion, @PathVariable("id") Long id){
	Educacion educacionUpdate = educacionService.obtenerPorId(id).get();

        educacionUpdate.setTituloEdu(educacion.getTituloEdu());
        educacionUpdate.setFechaEdu(educacion.getFechaEdu());
	 educacionUpdate.setFechaEdu(educacion.getFechaEdu());
	 educacionUpdate.setDescEdu(educacion.getDescEdu());
	 educacionUpdate.setImagenEdu(educacion.getImagenEdu());



        educacionService.guardar(educacionUpdate);
	return new ResponseEntity(new Mensaje ("educacion actualizada"),HttpStatus.CREATED);
        
    }


    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<Educacion> delete(@PathVariable Long id){
             educacionService.borrar(id);
       return new ResponseEntity(new Mensaje ("educacion eliminada"),HttpStatus.OK);
    }
}

