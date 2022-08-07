package com.porfolio.richard.Service;

import com.porfolio.richard.Entity.Experiencia;
import com.porfolio.richard.Repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ExperienciaService {

    @Autowired
    ExperienciaRepository experienciaRepository;

    public List<Experiencia> obtenerTodos(){
        List<Experiencia> lista = experienciaRepository.findAll();
        return lista;
    }
public Optional<Experiencia> obtenerPorId(Long idExp){
        return experienciaRepository.findById(idExp);
    }
    
	public Optional<Experiencia> obtenerPorNombre(String np){
        return experienciaRepository.findByTituloExp(np);
    }
    public void guardar(Experiencia experiencia){
        experienciaRepository.save(experiencia);
    }
//cabio en id por idExp
    public void borrar(Long idExp){
        experienciaRepository.deleteById(idExp);
    }

    public boolean existePorNombre(String np){
        return experienciaRepository.existsByTituloExp(np);
    }
    public boolean existePorId(Long id){
        return experienciaRepository.existsById(id);
    }


}

