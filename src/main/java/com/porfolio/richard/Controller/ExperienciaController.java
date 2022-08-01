package com.porfolio.richard.Controller;

import com.porfolio.richard.DTO.Mensaje;
import com.porfolio.richard.Entity.Experiencia;
import com.porfolio.richard.Service.ExperienciaService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@RestController
@RequestMapping("/api/experiencia")
@CrossOrigin(origins= {"*"})

public class ExperienciaController {

    @Autowired
    ExperienciaService experienciaService;
@GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> getLista(){
        List<Experiencia> lista = experienciaService.obtenerTodos();
        return new ResponseEntity<List<Experiencia>>(lista, HttpStatus.OK);
    }
    @GetMapping("/detalle/{id}")
    public ResponseEntity<Experiencia> getOne(@PathVariable Long id){
        if(!experienciaService.existePorId(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND); 
	   
	    Experiencia experiencia = experienciaService.obtenerPorId(id).get();
        return new ResponseEntity<Experiencia>(experiencia,HttpStatus.OK);
    }



    @PostMapping("nuevo")
    public ResponseEntity<?> create(@RequestBody  Experiencia experiencia){

        experienciaService.guardar(experiencia);
	return new ResponseEntity(new Mensaje ("experiencia guardada"),HttpStatus.CREATED);

    }

    @PutMapping("/actualizar/{idExp}")
    public ResponseEntity<?> update(@RequestBody Experiencia experiencia, @PathVariable("idExp") Long idExp){
	Experiencia experienciaUpdate = experienciaService.obtenerPorId(idExp).get();

        experienciaUpdate.setTituloExp(experiencia.getTituloExp());
        experienciaUpdate.setFechaExp(experiencia.getFechaExp());
       	experienciaUpdate.setDescExp(experiencia.getDescExp());
        experienciaUpdate.setImagenExp(experiencia.getImagenExp());

        experienciaService.guardar(experienciaUpdate);
		return new ResponseEntity(new Mensaje ("experiencia actualizada"),HttpStatus.CREATED);
    }


    @DeleteMapping("/borrar/{idExp}")
    public ResponseEntity<?> delete(@PathVariable Long idExp){
   //	if(!experienciaService.existePorId(id))
     //       return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND); 
   	    experienciaService.borrar(idExp);
	     return new ResponseEntity(new Mensaje ("experiencia eliminada"),HttpStatus.OK);

    }
}

