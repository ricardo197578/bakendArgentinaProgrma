package com.porfolio.richard.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_persona")
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;

    @Column(name="Nombre")
    private String Nombre;

    @Column(name="Apellido")
    private String Apellido;

   @Column(name="Titulo")
    private String Titulo;
 
   @Column(name="Descripcion")
    private String Descripcion;
   
    @Column(name="Imagen")
    private String Imagen;
  
    //id
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    
    //Nombre
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    //Apellido
    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido =Apellido;
    }

    //Titulo

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo =Titulo;
    }

    //Dscripcion
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion =Descripcion;
    }

    //imagen
    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen =Imagen;
    }

}

