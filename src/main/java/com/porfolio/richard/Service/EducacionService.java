package com.porfolio.richard.Service;

import com.porfolio.richard.Model.Educacion;
import java.util.List;

public interface EducacionService {
    public List <Educacion> findAll();
    public Educacion save(Educacion educacion);
    public Educacion findById(Integer id);
    public void delete(Integer id);

}

