package com.porfolio.richard.Repository;

import com.porfolio.richard.Entity.Producto2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto2, Long> {
    Optional<Producto2> findByNombreProducto(String np);
    boolean existsByNombreProducto(String np);
}

