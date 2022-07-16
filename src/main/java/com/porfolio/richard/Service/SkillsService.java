package com.porfolio.richard.Service;

import com.porfolio.richard.Entity.Skills;                                  import com.porfolio.richard.Repository.SkillsRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@Transactional
public class SkillsService {

        @Autowired
        SkillsRepository skillsRepository;

	public List<Skills> obtenerTodos(){
        List<Skills> lista = skillsRepository.findAll();
        return lista;
    }

    public Optional<Skills> obtenerPorId(Long id){
        return skillsRepository.findById(id);
    }

    public void guardar(Skills skills){
        skillsRepository.save(skills);
    }

    public void borrar(Long id){
        skillsRepository.deleteById(id);
    }

    

    public boolean existePorId(Long id){
        return skillsRepository.existsById(id);

        }

             

     
}

