package com.confeccionestita.producto.service;

import com.confeccionestita.producto.entity.CategoriaTalla;
import com.confeccionestita.producto.entity.CategoriaTemporada;

import java.util.List;

public interface ITemporadaService {

    List<CategoriaTemporada> findAll();
}
