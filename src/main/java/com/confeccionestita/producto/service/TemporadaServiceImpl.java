package com.confeccionestita.producto.service;

import com.confeccionestita.producto.entity.CategoriaTemporada;
import com.confeccionestita.producto.repository.CategoriaTemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemporadaServiceImpl implements ITemporadaService{

    @Autowired
    private CategoriaTemporadaRepository temporadaRepository;


    @Override
    public List<CategoriaTemporada> findAll() {
        return temporadaRepository.findAll();
    }
}
