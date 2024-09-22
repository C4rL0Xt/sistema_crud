package com.confeccionestita.producto.repository;

import com.confeccionestita.producto.entity.CategoriaTalla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaTallaRepository extends JpaRepository<CategoriaTalla,String> {
}
