package com.porfolio.richard.Repository;

import com.porfolio.richard.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Long> {
 Optional<Educacion> findByTituloEdu(String np);
    boolean existsByTituloEdu(String np);

}
