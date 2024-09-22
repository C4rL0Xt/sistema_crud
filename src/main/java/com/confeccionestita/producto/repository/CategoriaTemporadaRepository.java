package com.confeccionestita.producto.repository;

import com.confeccionestita.producto.entity.CategoriaTemporada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaTemporadaRepository extends JpaRepository<CategoriaTemporada,Integer> {
}
