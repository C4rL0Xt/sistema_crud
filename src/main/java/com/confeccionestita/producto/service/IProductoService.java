package com.confeccionestita.producto.service;

import com.confeccionestita.producto.entity.Producto;

import java.util.List;

public interface IProductoService {

    List<Producto> listAll();

    Producto findByProductoId(Integer id);

    Producto save(Producto producto);

    void delete(Integer productoId);
}
