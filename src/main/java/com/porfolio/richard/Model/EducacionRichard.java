package com.porfolio.richard.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_educacion")
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;

    @Column(name="Titulo")
    private String Titulo;
   
    @Column(name="Fecha")
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

    //Titulo
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
   //Fecha
    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha =Fecha;
    }
    //Dscripcion
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion =Descripcion;
    
    //imagen
    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen =Imagen;
    }

}

