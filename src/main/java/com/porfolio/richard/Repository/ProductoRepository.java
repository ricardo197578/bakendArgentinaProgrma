package com.porfolio.richard.Repository;

import com.porfolio.richard.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    Optional<Producto> findByNombreProducto(String np);
    boolean existsByNombreProducto(String np);
}
