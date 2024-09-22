package com.confeccionestita.producto.service;

import com.confeccionestita.producto.entity.CategoriaColor;
import com.confeccionestita.producto.repository.CategoriaColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaColorImpl implements IColorService{

    @Autowired
    private CategoriaColorRepository colorRepository;

    @Override
    public List<CategoriaColor> findAll() {
        return colorRepository.findAll();
    }
}
