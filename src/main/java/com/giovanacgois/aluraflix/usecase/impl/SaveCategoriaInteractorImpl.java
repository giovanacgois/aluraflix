package com.giovanacgois.aluraflix.usecase.impl;

import com.giovanacgois.aluraflix.domain.Categoria;
import com.giovanacgois.aluraflix.infrastructure.CategoriaRepository;
import com.giovanacgois.aluraflix.usecase.SaveCategoriaInteractor;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaRequest;
import com.giovanacgois.aluraflix.usecase.mapper.CategoriaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveCategoriaInteractorImpl implements SaveCategoriaInteractor {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public Categoria execute(CategoriaRequest categoriaRequest) {
        return categoriaRepository.save(CategoriaMapper.fromRequestToDomain(categoriaRequest));
    }
}
