package com.confeccionestita.producto.controller;

import com.confeccionestita.producto.entity.Producto;
import com.confeccionestita.producto.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoRestController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listProducts() {
        return productoService.listAll();
    }

}
