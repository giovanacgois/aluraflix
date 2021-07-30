package com.giovanacgois.aluraflix.usecase.impl;

import com.giovanacgois.aluraflix.infrastructure.CategoriaRepository;
import com.giovanacgois.aluraflix.usecase.GetCategoriasInteractor;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaResponse;
import com.giovanacgois.aluraflix.usecase.mapper.CategoriaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetCategoriasInteractorImpl implements GetCategoriasInteractor {

    private final CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaResponse> execute() {
        return CategoriaMapper.fromDomainToResponse(categoriaRepository.findAll());
    }
}
