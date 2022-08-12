package com.porfolio.richard.Service;

import com.porfolio.richard.Model.Persona;
import java.util.List;

public interface PersonaService {
    public List<Persona> findAll();
    public Persona save(Persona persona);
    public Persona findById(Integer id);
    public void delete(Integer id);

}
