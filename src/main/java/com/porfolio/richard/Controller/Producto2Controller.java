package com.porfolio.richard.Controller;

import com.porfolio.richard.DTO.Mensaje;
import com.porfolio.richard.Entity.Producto2;
import com.porfolio.richard.Service.Producto2Service;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@RequestMapping("/api/productos2")
@CrossOrigin(origins= {"*"})

public class Producto2Controller {
 @Autowired
    Producto2Service producto2Service;

    @GetMapping("/lista")
    public ResponseEntity<List<Producto2>> getLista(){
        List<Producto2> lista = producto2Service.obtenerTodos();
        return new ResponseEntity<List<Producto2>>(lista, HttpStatus.OK);
    }

    @GetMapping("/detalle/{id}")
    public ResponseEntity<Producto2> getOne(@PathVariable Long id){
        if(!producto2Service.existePorId(id))
            return new ResponseEntity(new Mensaje("no existe ese producto"), HttpStatus.NOT_FOUND);
        Producto2 producto2 = producto2Service.obtenerPorId(id).get();
        return new ResponseEntity<Producto2>(producto2, HttpStatus.OK);
    }
@PostMapping("nuevo")
  public ResponseEntity<?> create(@RequestBody Producto2 producto2){
        if(StringUtils.isBlank(producto2.getNombreProducto()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if((Integer)producto2.getPrecio() == null || producto2.getPrecio()==0)
            return new ResponseEntity(new Mensaje("el precio es obligatorio"), HttpStatus.BAD_REQUEST);
        if(productoService.existePorNombre(producto2.getNombreProducto()))
            return new ResponseEntity(new Mensaje("ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        producto2Service.guardar(producto2);
        return new ResponseEntity(new Mensaje("producto guardado"), HttpStatus.CREATED);
    }
@PutMapping("/actualizar/{id}")
    public ResponseEntity<?> update(@RequestBody Producto2 producto2, @PathVariable("id") Long id){
        if(!producto2Service.existePorId(id))
            return new ResponseEntity(new Mensaje("no existe ese producto"), HttpStatus.NOT_FOUND);
        if(StringUtils.isBlank(producto2.getNombreProducto()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if((Integer)producto2.getPrecio() == null || producto2.getPrecio()==0)
            return new ResponseEntity(new Mensaje("el precio es obligatorio"), HttpStatus.BAD_REQUEST);
        if(producto2Service.existePorNombre(producto2.getNombreProducto()) &&
                producto2Service.obtenerPorNombre(producto2.getNombreProducto()).get().getId() != id)
 return new ResponseEntity(new Mensaje("ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        Producto2 prodUpdate = producto2Service.obtenerPorId(id).get();
        prodUpdate.setNombreProducto(producto2.getNombreProducto());
        prodUpdate.setPrecio(producto2.getPrecio());
        producto2Service.guardar(prodUpdate);
        return new ResponseEntity(new Mensaje("producto actualizado"), HttpStatus.CREATED);
    }
@DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if(!producto2Service.existePorId(id))
            return new ResponseEntity(new Mensaje("no existe ese producto"), HttpStatus.NOT_FOUND);
        producto2Service.borrar(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }
}

