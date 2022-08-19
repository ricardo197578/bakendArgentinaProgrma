package com.porfolio.richard.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_experiencia")
public class ExperienciaRichard {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;

    @Column(name="Empresa")
    private String Empresa;
	
    @Column(name="FechaInicioExp")
    private String FechaInicioExp;

    @Column(name="FechaFinExp")
    private String FechaFinExp;

    @Column(name="DescripcionExp")
    private String DescripcionExp;

    @Column(name="ImagenExp")
    private String ImagenExp;


    //id
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    //Empresa	    
    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    //inicio
    public String getFechaInicioExp() {
   	return FechaInicioExp;
    }

    public void setFechaInicioExp(String FechaInicioExp){
	    this.FechaInicioExp = FechaInicioExp;
    }

    //fin
    public String getFechaFinExp() {
        return FechaFinExp;
    }

    public void setFechaFinExp(String FechaFinExp){
            this.FechaFinExp = FechaFinExp;
    }

    //descripcion
    public String getDescripcionExp() {
        return DescripcionExp;
    }
    
    public void setDescripcionExp(String DescripcionExp){
            this.DescripcionExp = DescripcionExp;
    }
	
    //Imagen
    public String getImagenExp() {
        return ImagenExp;
    }
    
    public void setImagenExp(String ImagenExp){
            this.ImagenExp = ImagenExp;
    }


}

