/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.richard.CrudCode.Dao;

import com.porfolio.richard.CrudCode.Model.Tarea;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author yonder
 */

public interface TareaDao extends CrudRepository<Tarea, Integer>{
    
}
