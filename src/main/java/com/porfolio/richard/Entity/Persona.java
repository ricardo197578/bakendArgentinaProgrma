package com.porfolio.richard.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name="tb_personaNueva")

public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
   @Column(name="Id")


    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
	@Column(name="Nombre")

    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
	@Column(name="Apellido")

    private String apellido;
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
	@Column(name="Imagen")

    private String img; // Es la imagen de portada. Este campo se dejara seteado desde Angular.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

 
    
    
}
