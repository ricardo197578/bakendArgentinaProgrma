package com.porfolio.richard.Dao;

import com.porfolio.richard.Entity.Tarea;
import org.springframework.data.repository.CrudRepository;



public interface TareaDao extends CrudRepository<Tarea, Integer>{
    
}
