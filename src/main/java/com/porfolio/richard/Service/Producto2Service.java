package com.porfolio.richard.Service;

import com.porfolio.richard.Entity.Producto2;
import com.porfolio.richard.Repository.Producto2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class Producto2Service {

    @Autowired
    Producto2Repository producto2Repository;

 public List<Producto2> obtenerTodos(){
        List<Producto2> lista = producto2Repository.findAll();
        return lista;
    }

    public Optional<Producto2> obtenerPorId(Long id){
        return producto2Repository.findById(id);
    }

    public Optional<Producto2> obtenerPorNombre(String np){
        return producto2Repository.findByNombreProducto(np);
    }

    public void guardar(Producto2 producto2){
        producto2Repository.save(producto2);
    }

    public void borrar(Long id){
        producto2Repository.deleteById(id);
	}

    public boolean existePorNombre(String np){
        return producto2Repository.existsByNombreProducto(np);
    }

    public boolean existePorId(Long id){
        return producto2Repository.existsById(id);

        }

}

