package com.porfolio.richard.Controller;

import com.porfolio.richard.Entity.ExperienciaRichard;
import com.porfolio.richard.Service.ExperienciaRichardService;
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
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.http.HttpStatus;


@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class ExperienciaRichardController {
    @Autowired
    private ExperienciaRichardService experienciaRichardService;

    //listar
    @GetMapping("/experiencia")
    public List<ExperienciaRichard> listar()
    {
        return experienciaRichardService.findAll();
    }

    //guardar
    @PostMapping("/experiencia")
     @PreAuthorize("hasRole('ADMIN')")
    public  ExperienciaRichard guardar(@RequestBody ExperienciaRichard experienciaRichard)
    {
        return experienciaRichardService.save(experienciaRichard);
    }

    //get una tarea
    @GetMapping("/experiencia{id}")
    @PreAuthorize("hasRole('ADMIN')")

    public ExperienciaRichard getUnaExperienciaRichard(@PathVariable Integer id)
    {
        return experienciaRichardService.findById(id);
    }

    //Modeficar
    @PutMapping("/experiencia/{id}")
    @PreAuthorize("hasRole('ADMIN')")

    public ExperienciaRichard modifecar(@RequestBody ExperienciaRichard experienciaRichard,@PathVariable Integer id)
    {
        ExperienciaRichard experienciaRichardActual= experienciaRichardService.findById(id);
        experienciaRichardActual.setEmpresa(experienciaRichard.getEmpresa());
        experienciaRichardActual.setFechaInicioExp(experienciaRichard.getFechaInicioExp());
        experienciaRichardActual.setFechaFinExp(experienciaRichard.getFechaFinExp());
        experienciaRichardActual.setDescripcionExp(experienciaRichard.getDescripcionExp());
        experienciaRichardActual.setImagenExp(experienciaRichard.getImagenExp());

        return experienciaRichardService.save(experienciaRichardActual);
    }

    @DeleteMapping("/experiencia/{id}")
    @PreAuthorize("hasRole('ADMIN')")

        public void eliminar(@PathVariable Integer id)
    {
        experienciaRichardService.delete(id);
    }

}



