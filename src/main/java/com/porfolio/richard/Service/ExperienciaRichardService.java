package com.porfolio.richard.Service;

import com.porfolio.richard.Model.ExperienciaRichard;
import java.util.List;

public interface ExperienciaRichardService {
    public List<ExperienciaRichard> findAll();
    public ExperienciaRichard save(ExperienciaRichard experienciaRichard);
    public ExperienciaRichard findById(Integer id);
    public void delete(Integer id);

}

