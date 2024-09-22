package com.confeccionestita.producto.repository;

import com.confeccionestita.producto.entity.CategoriaColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaColorRepository extends JpaRepository<CategoriaColor,Integer> {

}
