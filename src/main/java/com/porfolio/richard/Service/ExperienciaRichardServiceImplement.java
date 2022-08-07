package com.porfolio.richard.Service;

import com.porfolio.richard.Dao.ExperienciaRichardDao;
import com.porfolio.richard.Model.ExperienciaRichard;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ExperienciaRichardServiceImplement  implements ExperienciaRichardService{
    @Autowired
    private ExperienciaRichardDao experienciaRichardDao;

    @Override
    @Transactional(readOnly=true)
    public List<ExperienciaRichard> findAll()
    {
        return (List<ExperienciaRichard>) experienciaRichardDao.findAll();
    }

    @Override
     @Transactional(readOnly=false)
    public ExperienciaRichard save(ExperienciaRichard experienciaRichard)
    {
        return experienciaRichardDao.save(experienciaRichard);
    }

    @Override
     @Transactional(readOnly=true)
    public ExperienciaRichard findById(Integer id)
    {
        return experienciaRichardDao.findById(id).orElse(null);
    }

    @Override
     @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        experienciaRichardDao.deleteById(id);
    }

}

