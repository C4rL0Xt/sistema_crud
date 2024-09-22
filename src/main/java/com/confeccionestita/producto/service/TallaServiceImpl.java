package com.confeccionestita.producto.service;

import com.confeccionestita.producto.entity.CategoriaTalla;
import com.confeccionestita.producto.repository.CategoriaTallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TallaServiceImpl implements ITallaService{

    @Autowired
    private CategoriaTallaRepository tallaRepository;

    @Override
    public List<CategoriaTalla> findAll() {
        return tallaRepository.findAll();
    }
}
