package com.porfolio.richard.Dao;

import com.porfolio.richard.Entity.Tarea;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;




public interface TareaDao extends JpaRepository<Tarea, Integer>{
    
}
