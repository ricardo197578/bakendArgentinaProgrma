package com.porfolio.richard.Repository;

import com.porfolio.richard.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia,Long> {
	Optional<Experiencia> findByTituloExp(String np);
   	 boolean existsByTituloExp(String np);

}
