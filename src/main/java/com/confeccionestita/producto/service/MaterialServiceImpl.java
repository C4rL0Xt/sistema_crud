package com.confeccionestita.producto.service;

import com.confeccionestita.producto.entity.CategoriaMaterial;
import com.confeccionestita.producto.repository.CategoriaMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialServiceImpl implements IMaterialService {

    @Autowired
    private CategoriaMaterialRepository materialRepository;

    @Override
    public List<CategoriaMaterial> findAll() {
        return materialRepository.findAll();
    }
}
