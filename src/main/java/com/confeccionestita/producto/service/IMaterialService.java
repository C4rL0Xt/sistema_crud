package com.confeccionestita.producto.service;

import com.confeccionestita.producto.entity.CategoriaMaterial;

import java.util.List;

public interface IMaterialService {


    List<CategoriaMaterial> findAll();
}
