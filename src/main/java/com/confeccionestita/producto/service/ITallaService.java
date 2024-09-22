package com.confeccionestita.producto.service;

import com.confeccionestita.producto.entity.CategoriaTalla;
import com.confeccionestita.producto.repository.CategoriaTallaRepository;

import java.util.List;

public interface ITallaService {

    List<CategoriaTalla> findAll();

}
