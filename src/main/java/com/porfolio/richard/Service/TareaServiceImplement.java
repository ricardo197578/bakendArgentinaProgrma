package com.porfolio.richard.Service;

import com.porfolio.richard.Dao.TareaDao;
import com.porfolio.richard.Model.Tarea;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class TareaServiceImplement  implements TareaService{
    @Autowired
    private TareaDao tareaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Tarea> findAll()
    {
        return (List<Tarea>) tareaDao.findAll();
    }
    
    @Override
     @Transactional(readOnly=false)
    public Tarea save(Tarea tarea)
    {
        return tareaDao.save(tarea);
    }
    
    @Override
     @Transactional(readOnly=true)
    public Tarea findById(Integer id)
    {
        return tareaDao.findById(id).orElse(null);
    }
    
    @Override
     @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        tareaDao.deleteById(id);
    }
    
}
