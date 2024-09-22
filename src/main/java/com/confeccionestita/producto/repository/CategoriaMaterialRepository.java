package com.confeccionestita.producto.repository;

import com.confeccionestita.producto.entity.CategoriaMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaMaterialRepository extends JpaRepository<CategoriaMaterial,Integer> {
}
