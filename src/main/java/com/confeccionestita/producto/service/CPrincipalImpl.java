package com.confeccionestita.producto.service;

import com.confeccionestita.producto.entity.CategoriaPrincipal;
import com.confeccionestita.producto.repository.CategoriaPrincipalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CPrincipalImpl implements ICPrincipalService {

    @Autowired
    private CategoriaPrincipalRepository principalRepository;

    @Override
    public List<CategoriaPrincipal> findAll() {
        return principalRepository.findAll();
    }
}
