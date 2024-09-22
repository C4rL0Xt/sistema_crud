package com.confeccionestita.producto.repository;

import com.confeccionestita.producto.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {

    Producto findByProductoId(Integer id);
}
