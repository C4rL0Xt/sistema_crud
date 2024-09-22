package com.confeccionestita.producto.service;

import com.confeccionestita.producto.entity.CategoriaPrincipal;

import java.util.List;

public interface ICPrincipalService {

    List<CategoriaPrincipal> findAll();
}
