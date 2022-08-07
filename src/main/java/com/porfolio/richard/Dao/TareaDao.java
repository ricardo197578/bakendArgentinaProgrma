package com.porfolio.richard.Dao;

import com.porfolio.richard.Model.Tarea;
import org.springframework.data.repository.CrudRepository;



public interface TareaDao extends CrudRepository<Tarea, Integer>{
    
}
