package com.porfolio.richard.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="experiencia")
public class Experiencia {
	/*defino los atributos de la entidades*/

		@Id
		@GeneratedValue (strategy = GenerationType.AUTO)
		private Long id;
		@NotBlank
                @Column(unique=true)
		private String tituloExp;
		private String fechaExp;
		private String descExp;
		private String imagenExp;
		private String nombreExp;

	
		/*constructor vacio*/
		public Experiencia(){
		}
	
		/*constructor parametrizado*/
		public Experiencia (String tituloExp,String fechaExp,String descExp,String imagenExp,String nombreExp){
		
		this.tituloExp = tituloExp;
		this.fechaExp = fechaExp;
		this.descExp = descExp;
		this.imagenExp = imagenExp;
		this.nombreExp = nombreExp;
		
		}

		public Long getId(){
			return id;
		}
		public void setId(Long id){
			this.id = id;
		}
		public String getTituloExp(){
			return tituloExp;
		}
		public void setTituloExp(String tituloExp){
			this.tituloExp = tituloExp;
		}

		public String getFechaExp(){
			return fechaExp;
		}
		public void setFechaExp (String fechaExp){
			this.fechaExp = fechaExp;
		}
		public String getDescExp(){
			return descExp;
		}
		public void setDescExp(String descExp){
			this.descExp = descExp;
		}
		public String getImagenExp(){
			return imagenExp;
		}
		public void setImagenExp(String imagenExp){
			this.imagenExp = imagenExp;
		}

		 public String getNombreExp(){
                        return nombreExp;
                }
                public void setNombreExp(String nombreExp){
                        this.nombreExp = nombreExp;
                }


	}
	




