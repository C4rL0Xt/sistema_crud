package com.confeccionestita.producto.repository;

import com.confeccionestita.producto.entity.CategoriaPrincipal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaPrincipalRepository extends JpaRepository<CategoriaPrincipal,Integer> {
}
