package com.confeccionestita.producto.service;

import com.confeccionestita.producto.entity.Producto;
import com.confeccionestita.producto.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto findByProductoId(Integer id) {
        return productoRepository.findByProductoId(id);
    }

    @Override
    public Producto save(Producto producto) {


        return productoRepository.save(producto);
    }

    @Override
    public void delete(Integer productoId) {
        productoRepository.deleteById(productoId);
    }
}
