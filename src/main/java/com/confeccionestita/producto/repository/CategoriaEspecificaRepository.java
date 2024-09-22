package com.confeccionestita.producto.repository;

import com.confeccionestita.producto.entity.CategoriaEspecifica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaEspecificaRepository extends JpaRepository<CategoriaEspecifica,Integer> {
}
