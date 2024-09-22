package com.confeccionestita.producto.repository;

import com.confeccionestita.producto.entity.CategoriaSecundaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaSecundariaRepository extends JpaRepository<CategoriaSecundaria,Integer> {
}
