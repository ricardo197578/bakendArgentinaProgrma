package com.porfolio.richard.Controller;

import com.porfolio.richard.Model.Persona;
import com.porfolio.richard.Service.PersonaService;
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
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    //listar
    @GetMapping("/persona")
    public List<Persona> listar()
    {
        return personaService.findAll();
    }

    //guardar
    @PostMapping("/persona")
    public  Persona guardar(@RequestBody Persona persona)
    {
        return personaService.save(persona);
    }

    //get una persona
    @GetMapping("/persona{id}")
    public Persona getUnaPersona(@PathVariable Integer id)
    {
        return personaService.findById(id);
    }

    //Modeficar
    @PutMapping("/persona/{id}")
    public Persona modifecar(@RequestBody Persona persona,@PathVariable Integer id)
    {
        Persona personaActual= personaService.findById(id);
        personaActual.setNombre(persona.getNombre());
        personaActual.setApellido(persona.getApellido());
	personaActual.setTitulo(persona.getTitulo());
	personaActual.setDescripcion(persona.getDescripcion());
	personaActual.setImagen(persona.getImagen());


        return personaService.save(personaActual);
    }

    @DeleteMapping("/persona/{id}")
    public void eliminar(@PathVariable Integer id)
    {
        personaService.delete(id);
    }


