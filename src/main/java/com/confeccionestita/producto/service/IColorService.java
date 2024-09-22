package com.confeccionestita.producto.service;

import com.confeccionestita.producto.entity.CategoriaColor;

import java.util.List;

public interface IColorService {

    List<CategoriaColor> findAll();
}
