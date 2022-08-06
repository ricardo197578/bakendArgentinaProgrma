package com.porfolio.richard.Service;

import com.porfolio.richard.Repository.ExperienciaRichardRepository;
import com.porfolio.richard.Entity.ExperienciaRichard;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ExperienciaRichardServiceImplement  implements ExperienciaRichardService{
    @Autowired
    private ExperienciaRichardRepository experienciaRichardRepository;

    @Override
    @Transactional(readOnly=true)
    public List<ExperienciaRichard> findAll()
    {
        return (List<ExperienciaRichard>) experienciaRichardRepository.findAll();
    }

    @Override
     @Transactional(readOnly=false)
    public ExperienciaRichard save(ExperienciaRichard experienciaRichard)
    {
        return experienciaRichardRepository.save(experienciaRichard);
    }

    @Override
     @Transactional(readOnly=true)
    public ExperienciaRichard findById(Integer id)
    {
        return experienciaRichardRepository.findById(id).orElse(null);
    }

    @Override
     @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        experienciaRichardRepository.deleteById(id);
    }

}


