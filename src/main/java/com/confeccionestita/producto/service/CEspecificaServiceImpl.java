package com.confeccionestita.producto.service;

import com.confeccionestita.producto.entity.CategoriaEspecifica;
import com.confeccionestita.producto.repository.CategoriaEspecificaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CEspecificaServiceImpl implements ICEspecificaService{

    @Autowired
    private CategoriaEspecificaRepository especificaRepository;

    @Override
    public List<CategoriaEspecifica> findAll() {
        return especificaRepository.findAll();
    }
}
