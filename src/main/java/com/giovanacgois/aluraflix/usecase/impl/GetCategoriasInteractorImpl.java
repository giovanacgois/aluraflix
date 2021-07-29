package com.giovanacgois.aluraflix.usecase.impl;

import com.giovanacgois.aluraflix.infrastructure.CategoriaRepository;
import com.giovanacgois.aluraflix.usecase.GetCategoriasInteractor;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaResponse;
import com.giovanacgois.aluraflix.usecase.mapper.CategoriaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetCategoriasInteractorImpl implements GetCategoriasInteractor {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaResponse> execute() {
        return CategoriaMapper.fromDomainToResponse(categoriaRepository.findAll());
    }
}
